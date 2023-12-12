package com.chesterford.mapstruct.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import com.chesterford.mapstruct.dto.StudentDto;
import com.chesterford.mapstruct.list.StudentList;
import com.chesterford.mapstruct.mapper.StudentMapper;

@Service
@RequiredArgsConstructor
public class StudentService {

  private final StudentList studentList;
  private final StudentMapper studentMapper;

  public void createStudent(StudentDto studentDto) {
    studentList.studentDtoArrayList.add(studentMapper.mapToModel(studentDto));
  }

  public List<StudentDto> getStudents() {
    List<StudentDto> studentDtoList = new ArrayList<>();
    studentList.studentDtoArrayList.forEach(student -> studentDtoList.add(studentMapper.mapToDto(student)));
    return studentDtoList;
  }

}
