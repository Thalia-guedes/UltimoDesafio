package org.example.Client.Service;

import com.example.sistemadevendas.Client.Model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
