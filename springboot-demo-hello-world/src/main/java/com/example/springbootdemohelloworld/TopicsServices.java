package com.example.springbootdemohelloworld;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

 @Service
public class TopicsServices {

    public List<Topics> topics = new ArrayList<>(Arrays.asList(
                new Topics("spring" ,"Java","spring Framework"),
                new Topics("Django" ,"Python","FrameWork")
        ));



     public List<Topics> getAllTopics() {
         return topics;
     }

     public Topics getTopic(String id) {
         return topics.stream().filter(t-> t.getId().equals(id)).findFirst().get();
     }

     public void addTopic(Topics topic){
         topics.add(topic);
         topics.stream().forEach(t->System.out.println("Topics="+t.getId()));

     }

 }
