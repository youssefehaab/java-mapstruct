package com.chesterford.mapstruct.mapper;

import org.mapstruct.Mapper;

import com.chesterford.mapstruct.dto.TeacherDto;
import com.chesterford.mapstruct.model.Teacher;

@Mapper(componentModel = "spring")
public interface TeacherMapper {

  Teacher mapToModel(TeacherDto teacherDto);

  TeacherDto mapToDto(Teacher teacher);

}
