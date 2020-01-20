package com.edumark.edumarkservice.service;


import com.edumark.edumarkservice.dto.CoursesCategoryDTO;

import java.util.List;

public interface CoursesCategoryService {

    List<CoursesCategoryDTO> finAdLLByDisable(boolean disable);
}
