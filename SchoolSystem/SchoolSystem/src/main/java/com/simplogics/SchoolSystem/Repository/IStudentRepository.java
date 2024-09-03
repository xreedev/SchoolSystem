package com.simplogics.SchoolSystem.Repository;

import com.simplogics.SchoolSystem.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudentRepository extends JpaRepository<Student,Integer> {
}
