package com.edumark.edumarkservice.controller;

import com.edumark.edumarkservice.dto.CoursesCategoryDTO;
import com.edumark.edumarkservice.service.CoursesCategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/coursescategory")
@CrossOrigin(origins = "*", maxAge = -1)
@Component
public class CoursesCategoryController {


    private final CoursesCategoryService coursesCategoryService;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getAllCoursesCategory() {
        Optional<List<CoursesCategoryDTO>> coursesCategoryDTOS = Optional.of(coursesCategoryService.finAdLLByDisable(false));
        if (coursesCategoryDTOS.isPresent()) {
            return ResponseEntity.ok(coursesCategoryDTOS);
        } else {
            return ResponseEntity.notFound().build();
        }

    }
}
