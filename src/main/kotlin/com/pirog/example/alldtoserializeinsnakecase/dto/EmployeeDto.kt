package com.pirog.example.alldtoserializeinsnakecase.dto

import io.swagger.v3.oas.annotations.media.Schema
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode

@Schema(description = "Employee Dto")
data class EmployeeDto(
    @field:Schema(
        example = "123",
        requiredMode = RequiredMode.REQUIRED
    ) val id: Long?,
    @field:Schema(
        example = "John Doe",
        requiredMode = RequiredMode.REQUIRED
    )
    val fullName: String,
    @field:Schema(
        example = "QA Department",
        requiredMode = RequiredMode.REQUIRED
    )
    val departmentName: String?,
    @field:Schema(
        example = "100512",
        requiredMode = RequiredMode.REQUIRED
    )
    val salaryInCents: Long?
)