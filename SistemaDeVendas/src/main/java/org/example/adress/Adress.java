package org.example.adress;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Adress {
    //cidade
    private String city;
    //rua
    private String road;
    //bairro
    private String district;
    //cep
    private String zip_code;
    //numero
    private String number;
                    //dadosendereco
    public Adress(Addressdata data) {
        this.city = data.city();
        this.road = data.road();
        this.district = data.district();
        this.zip_code = data.zip_code();
        this.number = data.number();
    }
}
