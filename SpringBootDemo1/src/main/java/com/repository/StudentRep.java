package com.repository;

import com.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

// dao
@Repository
public interface StudentRep extends JpaRepository<Student,Integer>{
    @Query("select s from Student s where s.id= :id")
    Student findById(@Param("id") int id);
}
