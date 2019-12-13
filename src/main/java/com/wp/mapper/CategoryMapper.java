package com.wp.mapper;

import java.util.List;

import com.wp.pojo.Category;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CategoryMapper {

 
    List<Category> findAll();


}