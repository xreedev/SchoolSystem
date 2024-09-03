package com.simplogics.SchoolSystem.Service;

import com.simplogics.SchoolSystem.Model.Student;
import com.simplogics.SchoolSystem.Repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentService implements IStudentService {

    @Autowired
    private IStudentRepository studentRepository;

    @Override
    public Student saveStudent(Student Student){
        return studentRepository.save(Student);
    }

    @Override
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentById(Integer id){
        return studentRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteStudent(Integer id){
        studentRepository.deleteById(id);
    }
}
