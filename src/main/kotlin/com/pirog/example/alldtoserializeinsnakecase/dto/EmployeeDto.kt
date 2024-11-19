package com.pirog.example.alldtoserializeinsnakecase.dto

import io.swagger.v3.oas.annotations.media.Schema

@Schema(description = "Employee Dto")
data class EmployeeDto(
    @field:Schema(example = "123")
    val id: Long,
    @field:Schema(example = "John Doe")
    val fullName: String,
    @field:Schema(example = "QA Department")
    val departmentName: String?,
    @field:Schema(example = "100512")
    val salaryInCents: Long?,
    @field:Schema(contentSchema = AddressDto::class)
    val homeAddress: AddressDto
)