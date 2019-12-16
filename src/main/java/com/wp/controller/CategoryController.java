package com.wp.controller;
import java.util.List;

import com.wp.pojo.Category;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wp.mapper.CategoryMapper;

@Controller
public class CategoryController {
    @Autowired CategoryMapper categoryMapper;
    private static final Logger log = LoggerFactory.getLogger(CategoryController.class);
    @RequestMapping("/listCategory")
    public String listCategory(Model m) throws Exception {
        List<Category> cs=categoryMapper.findAll();
         log.info("123");
        m.addAttribute("cs", cs);
         
        return "listCategory";
    }
     
}