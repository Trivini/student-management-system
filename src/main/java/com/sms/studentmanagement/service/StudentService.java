package com.sms.studentmanagement.service;

import com.sms.studentmanagement.entity.Student;
import java.util.List;

public interface StudentService {
    Student create(Student student);
    List<Student> getAll();
    Student getById(Long id);
    Student update(Long id, Student student);
    void delete(Long id);
    List<Student> search(String name);
}