package com.simplogics.SchoolSystem.Control;

import com.simplogics.SchoolSystem.Configs.ApiRoutes;
import com.simplogics.SchoolSystem.Model.Teacher;
import com.simplogics.SchoolSystem.Service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TeacherControl {
    @Autowired
    TeacherService teacherService;

    @PostMapping()
    public Teacher addTeacher(@RequestBody Teacher Teacher){
        return teacherService.saveTeacher(Teacher);
    }

    @PutMapping()
    public Teacher saveTeacher(@RequestBody Teacher Teacher){
        return teacherService.saveTeacher(Teacher);
    }

    @GetMapping(ApiRoutes.ID)
    public Teacher getTeacher(@PathVariable Integer id){
        return teacherService.getTeacherById(id);
    }

    @GetMapping()
    public List<Teacher> getTeachers(){return teacherService.getTeachers();}

    @DeleteMapping(ApiRoutes.ID)
    public void deleteTeacher(@PathVariable Integer id){teacherService.deleteTeacher(id);}
}
