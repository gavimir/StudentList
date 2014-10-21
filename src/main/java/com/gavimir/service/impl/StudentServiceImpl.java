package com.gavimir.service.impl;

import com.gavimir.dao.StudentDao;
import com.gavimir.model.Student;
import com.gavimir.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;

    @Transactional
    public void add(Student student) {
        studentDao.add(student);
    }

    @Transactional
    public void edit(Student student) {
        studentDao.edit(student);
    }

    @Transactional
    public void delete(int studentId) {
        studentDao.delete(studentId);
    }

    @Transactional
    public Student getStudent(int studentId) {
        return studentDao.getStudent(studentId);
    }

    @Transactional
    public List getAllStudent() {
        return studentDao.getAllStudent();
    }

}
