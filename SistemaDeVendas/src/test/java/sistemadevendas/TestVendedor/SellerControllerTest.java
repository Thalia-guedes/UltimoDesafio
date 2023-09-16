package sistemadevendas.TestVendedor;

import com.example.sistemadevendas.Seller.Controller.DataRegistrationSeller;
import com.example.sistemadevendas.Seller.Controller.SellerController;
import com.example.sistemadevendas.Seller.Model.Seller;
import com.example.sistemadevendas.Seller.Service.SellerRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class SellerControllerTest {

    @InjectMocks
    private SellerController sellerController;
    @Mock
    private SellerRepository sellerRepository;
    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
    //testa cadastro de vendedor
    @Test
    public void testCreateSeller_Success() {
        DataRegistrationSeller data = new DataRegistrationSeller("John Doe", "john@example.com", "123.456.789-00", "5000.00");
        Seller seller = new Seller(data);

        sellerController.create(data);

        verify(sellerRepository, times(1)).save(seller);
    }
}
