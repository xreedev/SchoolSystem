package com.simplogics.SchoolSystem.Repository;

import com.simplogics.SchoolSystem.Model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITeacherRepository extends JpaRepository<Teacher,Integer> {
}
