package org.example.Seller.Controller;

import com.example.sistemadevendas.Seller.Model.Seller;
import com.example.sistemadevendas.Seller.Service.SellerRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("vendedores")
public class SellerController {
    @Autowired
    private SellerRepository sellerRepository;
    @RequestMapping
    @Transactional
    public void create(@RequestBody @Valid DataRegistrationSeller data){
        sellerRepository.save(new Seller(data));
        System.out.println("Vendedor" + data.name() + "Cadastrado com sucesso! :)");

    }
}
