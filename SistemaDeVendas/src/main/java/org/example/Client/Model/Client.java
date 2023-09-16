package org.example.Client.Model;

import com.example.sistemadevendas.Client.Controller.DataregistrationCustomer;
import com.example.sistemadevendas.adress.Adress;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table (name = "clientes")
@Entity (name = "Clientes")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Client {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_client;
    private String name;
    private String email;
    private String cpf;
    @Embedded
    private Adress adress;  //endereco
    private Boolean active;
    public Client(DataregistrationCustomer data) {
        this.active = true;
        this.name = data.name();
        this.email = data.email();
        this.cpf = data.cpf();
        this.adress = new Adress(data.adress());
    }
    public void delete() {
        this.active = false;
    }

    public void setId_client(Long id_client) {
        this.id_client = id_client;
    }

    public Boolean getActive() {
        return active;
    }

}
