package com.busanit501.spring_me.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {
  @Select("select now()")
  String getTime();
}













