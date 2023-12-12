package com.chesterford.mapstruct.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.chesterford.mapstruct.dto.StudentDto;
import com.chesterford.mapstruct.service.StudentService;

@RestController
@RequiredArgsConstructor
public class StudentController {

  private final StudentService studentService;

  @PostMapping(value = "/student", consumes = { "application/json" })
  public ResponseEntity<Void> createStudent(@RequestBody StudentDto studentDto) {
    studentService.createStudent(studentDto);
    return ResponseEntity.ok().build();
  }

  @GetMapping(value = "/student")
  public ResponseEntity<List<StudentDto>> getStudents() {
    return ResponseEntity.ok().body(studentService.getStudents());
  }

}
