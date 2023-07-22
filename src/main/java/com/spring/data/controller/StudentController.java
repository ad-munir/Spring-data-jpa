package com.spring.data.controller;

import com.spring.data.model.dto.StudentDto;
import com.spring.data.model.entity.Student;
import com.spring.data.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    StudentService service;

    @GetMapping("/get-student")
    public StudentDto getStudent(@RequestParam Integer id) {
        return this.service.getById(id);
    }

    @GetMapping("/get-all-students")
    public List<Student> getAllStudents() {
        return this.service.getAll();
    }

    @PostMapping("/add-student")
    public StudentDto createStudent(@RequestBody Student student) {
        return this.service.save(student);
    }

    @PostMapping("/update-student")
    public StudentDto updateStudent(@RequestBody Student student) {
        return this.service.save(student);
    }

    @DeleteMapping("/delete-student")
    public void deleteStudentDelete(@RequestParam Integer id) {
        this.service.deleteById(id);
    }


    @DeleteMapping("/delete-all-students")
    public void deleteAllStudents() {
        this.service.deleteAll();
    }
}
