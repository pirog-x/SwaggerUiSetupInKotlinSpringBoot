Check the `dto/EmployeeDto.kt` class for the docs.

## Moments to remain in memory

1. If field is nullable, it marks as `NOT_REQUIRED`, so we don't need to write like that:
    
    ❌
    ```kotlin
    @field:Schema(
        example = "123",
        requiredMode = NOT_REQUIRED
    ) 
    val salary: Int? = null
    ```
   ✅
    ```kotlin
    @field:Schema(example = "123")   
    val salary: Int? = null
    ```
   And vice versa.

2. `@field:Schema` Annotation doesn't needed in object classes in the dto. See `homeAddress` in `EmployeeDto`

   ❌
   ```kotlin
    @field:Schema(contentSchema = AddressDto::class)
    val homeAddress: AddressDto
   ```
   ✅
   ```kotlin
    val homeAddress: AddressDto
   ```