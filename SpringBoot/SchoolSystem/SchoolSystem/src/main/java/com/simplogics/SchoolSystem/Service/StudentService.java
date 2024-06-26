package com.simplogics.SchoolSystem.Service;

import com.simplogics.SchoolSystem.Model.Student;
import com.simplogics.SchoolSystem.Repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StudentService {
    @Autowired
    private IStudentRepository studentRepository;

    public Student saveProduct(Student product){
        return studentRepository.save(product);
    }

    public Student updateProduct(Student product){
        return studentRepository.save(product);
    }

    public List<Student> getProducts() {
        return studentRepository.findAll();
    }

    public Student getProductById(Integer id){
        return studentRepository.findById(id).orElse(null);
    }

    public String deleteProduct(Integer id){
        studentRepository.deleteById(id);
        return "STUDENT DELETED";
    }
}
