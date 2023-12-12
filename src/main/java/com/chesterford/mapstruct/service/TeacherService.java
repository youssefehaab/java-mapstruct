package com.chesterford.mapstruct.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import com.chesterford.mapstruct.dto.TeacherDto;
import com.chesterford.mapstruct.list.TeacherList;
import com.chesterford.mapstruct.mapper.TeacherMapper;

@Service
@RequiredArgsConstructor
public class TeacherService {

  private final TeacherList teacherList;
  private final TeacherMapper teacherMapper;

  public void createTeacher(TeacherDto teacherDto) {
    teacherList.teacherDtoArrayList.add(teacherMapper.mapToModel(teacherDto));
  }

  public List<TeacherDto> getTeachers() {
    List<TeacherDto> teacherDtoList = new ArrayList<>();
    teacherList.teacherDtoArrayList.forEach(teacher -> teacherDtoList.add(teacherMapper.mapToDto(teacher)));
    return teacherDtoList;
  }

}
