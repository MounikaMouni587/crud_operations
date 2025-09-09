package com.restfulcrud.crudoperations.repository;

import com.restfulcrud.crudoperations.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
