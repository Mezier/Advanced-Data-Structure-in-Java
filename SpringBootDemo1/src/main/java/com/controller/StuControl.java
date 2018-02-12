package com.controller;

import com.entity.Student;
import com.service.StudentServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/stu")
public class StuControl {
    @Autowired
    private StudentServ stuSer;

    @RequestMapping(value = "/index")
    public String index(){
        return "stu/index";
    }
    @RequestMapping(value = "/show")
    @ResponseBody
    public String show(@RequestParam(value = "id") int id){
        Student stu=stuSer.findStuById(id);
        if(stu!=null){
            return stu.getId()+"/"+stu.getStuName()+"/"+stu.getAge();
        }else{
            return null;
        }
    }
}
