package com.controller;


import com.entity.Student;
import com.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/stu")
public class StudentController {
    @Autowired
    private StudentService ss;
    @Value(value = "${com.name}")
    private String variab;
    @RequestMapping(value = "/index")
    public String index() {
        return "stu/index";
    }
    @RequestMapping(value = "/vv")
    @ResponseBody
    public String vvinfo() {
        return "names:" + variab;
    }
    @RequestMapping(value = "/show")
    @ResponseBody
    public String show(@RequestParam(value = "id") int id) {
        Student stu = ss.findStuById(id);
        if (stu != null) {
            return stu.getId() + "/" + stu.getStuname() + "/" + stu.getAge();
        } else {
            return null;
        }
    }
}
