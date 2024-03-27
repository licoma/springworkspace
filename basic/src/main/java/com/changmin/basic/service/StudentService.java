package com.changmin.basic.service;

import org.springframework.http.ResponseEntity;

import com.changmin.basic.dto.request.student.PostStudentRequestDto;

public interface StudentService {
    ResponseEntity<String> postStudent(PostStudentRequestDto dto);
}