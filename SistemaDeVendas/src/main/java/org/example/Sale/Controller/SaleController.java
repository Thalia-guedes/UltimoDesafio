package org.example.Sale.Controller;

import com.example.sistemadevendas.Sale.Model.Sale;
import com.example.sistemadevendas.Sale.Service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("vendas")
public class SaleController {
    @Autowired
    private SaleService repository;
    @PostMapping
    public Sale create(@RequestBody Sale sale) {
        System.out.println("Produto cadastrado com Sucesso!");
        return repository.createSale(sale);

    }
}
