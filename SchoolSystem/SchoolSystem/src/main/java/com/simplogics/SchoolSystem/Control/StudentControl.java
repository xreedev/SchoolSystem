package com.simplogics.SchoolSystem.Control;

import com.simplogics.SchoolSystem.Model.Student;
import com.simplogics.SchoolSystem.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class StudentControl {
    @Autowired
    StudentService StudentService;
    @PostMapping("/createStudent")
    public Student addStudent(@RequestBody Student Student){
        return StudentService.saveStudent(Student);
    }

    @PutMapping("/saveStudent")
    public Student saveStudent(@RequestBody Student Student){
        return StudentService.saveStudent(Student);
    }

    @GetMapping("/getStudent/{id}")
    public Student getStudent(@PathVariable Integer id){
        return StudentService.getStudentById(id);
    }

    @GetMapping("/getAll")
    public List<Student> getStudents(){
        return StudentService.getStudents();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable Integer id){
        return StudentService.deleteStudent(id);
    }
}
