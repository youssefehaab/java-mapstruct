package com.chesterford.mapstruct.mapper;

import org.mapstruct.Mapper;

import com.chesterford.mapstruct.dto.StudentDto;
import com.chesterford.mapstruct.model.Student;

@Mapper(componentModel = "spring")
public interface StudentMapper {

  StudentDto mapToDto(Student student);

  Student mapToModel(StudentDto studentDto);

}
