package org.example.adress;

import jakarta.validation.constraints.NotBlank;

public record Addressdata(
        @NotBlank (message = "ERRO! Campo nao pode ser vazio ou em branco!")
        String city,
        @NotBlank (message = "ERRO! Campo nao pode ser vazio ou em branco!")
        String road,
        @NotBlank (message = "ERRO! Campo nao pode ser vazio ou em branco!")
        String district,
        @NotBlank (message = "ERRO! Campo nao pode ser vazio ou em branco!")
        String zip_code,
        @NotBlank (message = "ERRO! Campo nao pode ser vazio ou em branco!")
        String number
) {
}
