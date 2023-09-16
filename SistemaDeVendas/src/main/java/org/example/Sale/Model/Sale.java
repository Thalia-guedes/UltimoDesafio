package org.example.Sale.Model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "vendas")
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long product_code;

    @Column(name = "product_name")
    private String product_name;

    @Column(name = "price_product")
    private BigDecimal price_product;

    @Column(name = "qty_product")
    private int qty_product;

    @Column(name = "amount")
    private BigDecimal amount;

    public void setId(Long id) {
        this.id = id;
    }
    public void setProduct_code(Long product_code) {
        this.product_code = product_code;
    }
    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }
    public void setPrice_product(BigDecimal price_product) {
        this.price_product = price_product;
    }
    public void setQty_product(int qty_product) {
        this.qty_product = qty_product;
    }
    public BigDecimal getAmount() {
        return amount;
    }
    public Long getProduct_code() {
        return product_code;
    }
    public String getProduct_name() {
        return product_name;
    }
    public BigDecimal getPrice_product() {
        return price_product;
    }
    public int getQty_product() {
        return qty_product;
    }
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}

