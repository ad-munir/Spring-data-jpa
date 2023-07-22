package com.spring.data.service;

import com.spring.data.model.dto.StudentDto;
import com.spring.data.model.entity.Student;
import com.spring.data.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepo repo;

    public StudentDto getById(Integer id){
        return StudentDto.toDto(this.repo.findById(id).orElse(null));
    }

    public List<Student> getAll() {
        return this.repo.findAll();
    }

    //method for create & update student
    public StudentDto save(Student student){
        return StudentDto.toDto(this.repo.save(student));
    }

    public void deleteById(Integer id){
        this.repo.deleteById(id);
    }

    public void deleteAll(){
        this.repo.deleteAll();
    }


}
