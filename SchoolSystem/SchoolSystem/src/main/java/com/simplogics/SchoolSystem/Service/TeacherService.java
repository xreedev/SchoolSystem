package com.simplogics.SchoolSystem.Service;

import com.simplogics.SchoolSystem.Model.Teacher;
import com.simplogics.SchoolSystem.Repository.ITeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TeacherService implements ITeacherService {
    @Autowired
    private ITeacherRepository TeacherRepository;

    @Override
    public Teacher saveTeacher(Teacher Teacher){
        return TeacherRepository.save(Teacher);
    }

    @Override
    public Teacher updateTeacher(Teacher Teacher){
        return TeacherRepository.save(Teacher);
    }

    @Override
    public List<Teacher> getTeachers() {
        return TeacherRepository.findAll();
    }

    @Override
    public Teacher getTeacherById(Integer id){
        return TeacherRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteTeacher(Integer id){TeacherRepository.deleteById(id);}
}
