package com.simplogics.SchoolSystem.Service;

import com.simplogics.SchoolSystem.Model.Student;

import java.util.List;

public interface IStudentService {
    Student saveStudent(Student Student);

    List<Student> getStudents();

    Student getStudentById(Integer id);

    void deleteStudent(Integer id);
}
