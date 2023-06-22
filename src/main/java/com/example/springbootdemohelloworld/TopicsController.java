package com.example.springbootdemohelloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class TopicsController {

    @Autowired
    private TopicsServices topicService;

    @RequestMapping("/topics")
    public List<Topics> getAllTopics(){
        return topicService.getAllTopics();
    }

    @RequestMapping("/topics/{id}")
    public Topics getAllTopics(@PathVariable String id){
        return topicService.getTopic(id);
    }
    @RequestMapping(method= RequestMethod.POST,value="/topics")
    public void addTop(@RequestBody Topics topic){
          topicService.addTopic(topic);
    }
    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }
    @GetMapping("/")
    public String helloDefault(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }
}
