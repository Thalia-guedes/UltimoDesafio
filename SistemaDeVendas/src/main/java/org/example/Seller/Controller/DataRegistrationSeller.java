package org.example.Seller.Controller;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DataRegistrationSeller(
        @NotBlank (message = "ERRO! Campo nao pode ser vazio ou em branco!")
        String name,
        @NotBlank (message = "ERRO! Campo nao pode ser vazio ou em branco!")
        @Email(message = "ERRO! Formato de e-mail inválido.")
        String email,
        @NotBlank(message = "ERRO! Formato de CPF inválido.")
        @Pattern( regexp = "^\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}$")
        String cpf,
        @NotBlank (message = "ERRO! Campo nao pode ser vazio ou em branco!")
        String salary
) {
}
