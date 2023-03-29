package com.yan.service;

import com.yan.entity.Student;

import java.util.Collection;

public interface StudentService {

    Collection<Student> findAll();

    Student findById(long id);

    void save(Student student);

    void deleteById(long id);

}
