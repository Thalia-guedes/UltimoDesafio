package org.example.Sale.Service;

import com.example.sistemadevendas.Sale.Model.Sale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
@Service
public class SaleService {
    @Autowired
    private SaleRepository SaleRepository;
    public Sale createSale(Sale sale) {
        if (sale.getProduct_code() == null || sale.getProduct_name() == null) {
            throw new IllegalArgumentException("product_code e product_name são obrigatórios.");
        }
        if (sale.getPrice_product() != null && sale.getQty_product() > 0) {
            BigDecimal amount = sale.getPrice_product().multiply(BigDecimal.valueOf(sale.getQty_product()));
            sale.setAmount(amount);
            return SaleRepository.save(sale);
        } else {
            throw new IllegalArgumentException("Preço e quantidade são obrigatórios.");
        }
    }
}
