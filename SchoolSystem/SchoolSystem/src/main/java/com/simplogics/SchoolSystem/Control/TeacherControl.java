package com.simplogics.SchoolSystem.Control;

import com.simplogics.SchoolSystem.Model.Teacher;
import com.simplogics.SchoolSystem.Service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class TeacherControl {
    @Autowired
    TeacherService TeacherService;

    @PostMapping("/createTeacher")
    public Teacher addTeacher(@RequestBody Teacher Teacher){
        return TeacherService.saveTeacher(Teacher);
    }

    @PutMapping("/saveTeacher")
    public Teacher saveTeacher(@RequestBody Teacher Teacher){
        return TeacherService.saveTeacher(Teacher);
    }

    @GetMapping("/getTeacher/{id}")
    public Teacher getTeacher(@PathVariable Integer id){
        return TeacherService.getTeacherById(id);
    }

    @GetMapping("/getAll")
    public List<Teacher> getTeachers(){
        return TeacherService.getTeachers();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteTeacher(@PathVariable Integer id){
        return TeacherService.deleteTeacher(id);
    }
}
