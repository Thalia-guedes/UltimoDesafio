package sistemadevendas.testCliente;

import com.example.sistemadevendas.Client.Controller.ClientController;
import com.example.sistemadevendas.Client.Controller.DataregistrationCustomer;
import com.example.sistemadevendas.Client.Model.Client;
import com.example.sistemadevendas.Client.Service.ClientRepository;
import com.example.sistemadevendas.adress.Addressdata;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.*;

public class ClientControllerTest {
    @InjectMocks
    private ClientController clientController;
    @Mock
    private ClientRepository clientRepository;
    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
    //test cadastrar cliente
    @Test
    public void testCreateClient_Success() {
        Addressdata addressData = new Addressdata("123 Street", "City", "12345", "ana godoy", "20");
        DataregistrationCustomer data = new DataregistrationCustomer("John Doe", "john@example.com", "123.456.789-00", addressData);
        Client client = new Client(data);

        clientController.create(data);

        verify(clientRepository, times(1)).save(client);
    }

    //detelar cliente
    @Test
    public void testDeleteClient_Success() {
        Long clientId = 1L;
        Client client = new Client();
        client.setId_client(clientId);

        when(clientRepository.getReferenceById(clientId)).thenReturn(client);

        clientController.delete(clientId);

        verify(clientRepository, times(1)).getReferenceById(clientId);
        verify(clientRepository, times(1)).save(client);
        assertFalse(client.getActive());
    }

}
