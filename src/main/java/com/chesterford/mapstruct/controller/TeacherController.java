package com.chesterford.mapstruct.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.chesterford.mapstruct.dto.TeacherDto;
import com.chesterford.mapstruct.service.TeacherService;

@RestController
@RequiredArgsConstructor
public class TeacherController {

  private final TeacherService teacherService;

  @PostMapping(value = "/teacher", consumes = { "application/json" })
  public ResponseEntity<Void> createTeacher(@RequestBody TeacherDto teacherDto) {
    teacherService.createTeacher(teacherDto);
    return ResponseEntity.ok().build();
  }

  @GetMapping(value = "/teacher")
  public ResponseEntity<List<TeacherDto>> getTeachers() {
    return ResponseEntity.ok().body(teacherService.getTeachers());
  }

}
