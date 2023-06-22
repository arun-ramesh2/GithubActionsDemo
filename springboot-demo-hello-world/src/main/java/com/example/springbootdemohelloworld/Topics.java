package com.example.springbootdemohelloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


public class Topics {

   private String id;
    private String name;
    private String desc;

    public Topics() {

    }

    public Topics(String id, String name, String desc) {
        super();
        this.id = id;
        this.name = name;
        this.desc = desc;
    }





    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }




}
