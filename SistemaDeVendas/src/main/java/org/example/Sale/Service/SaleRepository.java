package org.example.Sale.Service;

import com.example.sistemadevendas.Sale.Model.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale , Long> {
}
