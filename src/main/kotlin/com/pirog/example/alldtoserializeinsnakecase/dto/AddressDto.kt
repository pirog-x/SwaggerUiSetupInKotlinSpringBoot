package com.pirog.example.alldtoserializeinsnakecase.dto

import io.swagger.v3.oas.annotations.media.Schema

@Schema(description = "Home address of the employee")
data class AddressDto (
    @field:Schema(example = "161 Grove St")
    val firstLine: String,
    val secondLine: String?,
    @field:Schema(example = "NY 10023")
    val zipCode: String,
    @field:Schema(example = "New York")
    val city: String,
    @field:Schema(example = "USA")
    val country: String,
)
