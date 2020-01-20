package com.edumark.edumarkservice.service.impl;

import com.edumark.edumarkservice.dto.CoursesCategoryDTO;
import com.edumark.edumarkservice.repository.CoursesCategoryRepository;
import com.edumark.edumarkservice.repository.entity.CoursesCategory;
import com.edumark.edumarkservice.service.CoursesCategoryService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

public class CoursesCategoryServiceImpl implements CoursesCategoryService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private CoursesCategoryRepository  coursesCategoryRepository;

    @Override
    public List<CoursesCategoryDTO> finAdLLByDisable(boolean disable) {
        List<CoursesCategory> coursesCategoryList = coursesCategoryRepository.finAdLLByDisable(disable);
        return coursesCategoryList.stream().map(CoursesCategory -> modelMapper.map(CoursesCategory, CoursesCategoryDTO.class)).collect(Collectors.toList());
    }
}
