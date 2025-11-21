package ie.atu;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Vehicle {
    @NotBlank
    private String Driver;
    @Pattern(regexp ="[0-9]{2,3}-[A-Z]{1,2}-[0-9]{1,6}")
    private String reg;
    @Email
    private String Email;
    @Size (min = 1, max = 8)
    private int passengers;
}
