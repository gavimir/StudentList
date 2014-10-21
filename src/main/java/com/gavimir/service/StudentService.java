package com.gavimir.service;

import com.gavimir.model.Student;

import java.util.List;

public interface StudentService {
    public void add(Student student);

    public void edit(Student student);

    public void delete(int studentId);

    public Student getStudent(int studentId);

    public List getAllStudent();
}
