package com.pirog.example.alldtoserializeinsnakecase.controller

import com.pirog.example.alldtoserializeinsnakecase.dto.EmployeeDto
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/v1/employees/")
@RestController
class EmployeeController {
    @PostMapping
    fun createEmployee(
        @RequestBody employeeDto: EmployeeDto
    ): ResponseEntity<EmployeeDto> {
        return ResponseEntity
            .status(HttpStatus.CREATED)
            .body(employeeDto)
    }
}
