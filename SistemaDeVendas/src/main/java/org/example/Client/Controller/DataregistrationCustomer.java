package org.example.Client.Controller;

import com.example.sistemadevendas.adress.Addressdata;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DataregistrationCustomer(
        @NotBlank (message = "ERRO! Insira o nome do cliente!")
        String name,
        @NotBlank (message = "ERRO! Campo nao pode ser vazio ou em branco!")
        @Email(message = "ERRO! Formato de e-mail inválido.")
        String email,
        @NotBlank(message = "ERRO! Formato de CPF inválido.")
        @Pattern( regexp = "^\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}$")
        String cpf,
        @NotNull
        @Valid
        Addressdata adress
) {
}
