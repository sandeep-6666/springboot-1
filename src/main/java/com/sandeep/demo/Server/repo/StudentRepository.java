package com.sandeep.demo.Server.repo;

import com.sandeep.demo.Server.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<Student, Integer> {

}
