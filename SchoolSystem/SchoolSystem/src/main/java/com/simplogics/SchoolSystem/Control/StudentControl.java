package com.simplogics.SchoolSystem.Control;

import com.simplogics.SchoolSystem.Configs.ApiRoutes;
import com.simplogics.SchoolSystem.Model.Student;
import com.simplogics.SchoolSystem.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(ApiRoutes.STUDENT)
public class StudentControl {

    @Autowired
    StudentService studentService;

    @PostMapping()
    public Student addStudent(@RequestBody Student Student){
        return studentService.saveStudent(Student);
    }

    @PutMapping()
    public Student saveStudent(@RequestBody Student Student){
        return studentService.saveStudent(Student);
    }

    @GetMapping(ApiRoutes.ID)
    public Student getStudent(@PathVariable Integer id){
        return studentService.getStudentById(id);
    }

    @GetMapping()
    public List<Student> getStudents(){
        return studentService.getStudents();
    }

    @DeleteMapping(ApiRoutes.ID)
    public void deleteStudent(@PathVariable Integer id){studentService.deleteStudent(id);}
}
