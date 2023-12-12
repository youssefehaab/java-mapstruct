package com.chesterford.mapstruct.list;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

import com.chesterford.mapstruct.model.Teacher;

@Component
public class TeacherList {

  public ArrayList<Teacher> teacherDtoArrayList;

  TeacherList() {
    teacherDtoArrayList = new ArrayList<>();
  }

}
