package com.chesterford.mapstruct.list;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

import com.chesterford.mapstruct.model.Student;

@Component
public class StudentList {

  public ArrayList<Student> studentDtoArrayList;

  StudentList() {
    studentDtoArrayList = new ArrayList<>();
  }

}
