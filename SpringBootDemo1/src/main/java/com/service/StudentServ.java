package com.service;

import com.entity.Student;
import com.repository.StudentRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServ {
    @Autowired
    private StudentRep stuRep;
    public Student findStuById(int id){
        Student stu=null;
        try {
            stu = stuRep.findById(id);
        }catch (Exception e){
            e.printStackTrace();
        }
        return stu;
    }
}
