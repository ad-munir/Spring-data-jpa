package com.spring.data.model.dto;

import com.spring.data.model.entity.Student;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto {
    private Integer id;
    private String firstname;
    private String lastname;
    private Integer age;
    private String university;
    private BigDecimal note;

    public static StudentDto toDto(Student student){
        return StudentDto.builder().
                firstname(student.getFirstname()).
                lastname(student.getLastname()).
                age(student.getAge()).
                university(student.getUniversity()).
                note(student.getNote()).
                build();

    }
}
