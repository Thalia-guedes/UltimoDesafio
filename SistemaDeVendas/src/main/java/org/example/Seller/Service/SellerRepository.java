package org.example.Seller.Service;

import com.example.sistemadevendas.Seller.Model.Seller;
import org.springframework.data.jpa.repository.JpaRepository;
public interface SellerRepository extends JpaRepository<Seller, Long> {
}
