package com.service;

import com.entity.Student;
import com.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentRepository sr;
    public Student findStuById(int id){
        Student stu=null;
        try {
            stu = sr.findById(id);
        }catch (Exception e){
            e.printStackTrace();
        }
        return stu;
    }
}
