package com.restfulcrud.crudoperations.controller;

import com.restfulcrud.crudoperations.entity.Student;
import com.restfulcrud.crudoperations.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @PostMapping("/api/student")
    public ResponseEntity<Student> saveStudent(@RequestBody Student student)
    {
        return new ResponseEntity<>(studentRepository.save(student), HttpStatus.CREATED);

    }

    @GetMapping("api/get/student")
    public ResponseEntity<List<Student>> getStudent()
    {
        return new ResponseEntity<>(studentRepository.findAll(),HttpStatus.OK);
    }

    @GetMapping("api/get/student/{id}")
   public ResponseEntity<Student> getStudentById(@PathVariable long id)
   {
       Optional<Student> student=studentRepository.findById(id);
       if(student.isPresent())
       {
           return new ResponseEntity<>(student.get(),HttpStatus.OK);
       }
       else {
           return new ResponseEntity<>(HttpStatus.NOT_FOUND);
       }
   }

   @PutMapping("/api/update/student/{id}")
   public ResponseEntity<Student> updateStudent(@RequestBody Student student,@PathVariable long id)
   {
       Optional<Student> s=studentRepository.findById(id);
       if(s.isPresent())
       {
           s.get().setStu_Name("kanna");
           s.get().setStu_email("srinivasvemula@gmail.com");
           s.get().setAddress("CORK");
           return new ResponseEntity<>(studentRepository.save(s.get()),HttpStatus.OK);
       }
       else
       {
           return new ResponseEntity<>(HttpStatus.NOT_FOUND);
       }
   }

   @DeleteMapping("api/delete/student/{id}")
   public  ResponseEntity<Void> deleteStudent(@PathVariable long id)
   {
       Optional<Student> s=studentRepository.findById(id);
       if(s.isPresent())
       {
           studentRepository.deleteById(id);
           return new ResponseEntity<>(HttpStatus.NO_CONTENT);
       }
       else
       {
           return new ResponseEntity<>(HttpStatus.NOT_FOUND);
       }
   }
}
