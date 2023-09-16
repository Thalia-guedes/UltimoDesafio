package org.example.Client.Controller;

import com.example.sistemadevendas.Client.Model.Client;
import com.example.sistemadevendas.Client.Service.ClientRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("clientes")
public class ClientController {
    @Autowired
    private ClientRepository clientRepository;
    @RequestMapping
    @Transactional                          //dadosCadastroCliente
    public void create (@RequestBody @Valid DataregistrationCustomer data){
        clientRepository.save(new Client(data));
        System.out.println("Cliente: " + data.name() + "CPF: " +data.cpf()+ "Cadastrado com sucesso! :)");
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void delete(@PathVariable Long id){
        var client = clientRepository.getReferenceById(id);
        client.delete();
    }
}
