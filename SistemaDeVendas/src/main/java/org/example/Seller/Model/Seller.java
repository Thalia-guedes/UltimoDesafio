package org.example.Seller.Model;

import com.example.sistemadevendas.Seller.Controller.DataRegistrationSeller;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table (name = "vendedores")
@Entity (name = "Vendedores")
@Getter
@NoArgsConstructor
@EqualsAndHashCode (of = "id_seller")
public class Seller {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_seller;
    private String name;
    private String email;
    private String cpf;
    private String salary;

    public Seller(DataRegistrationSeller data) {
        this.name = data.name();
        this.email = data.email();
        this.cpf = data.cpf();
        this.salary = data.salary();
    }
}
