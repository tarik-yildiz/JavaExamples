import UnitTestExamples.Model.Customer;
import UnitTestExamples.Repository.CustomerRepository;
import UnitTestExamples.Services.CustomerService;
import UnitTestExamples.Services.NotificationService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CustomerServiceTest {
    private CustomerService customerService;
    private CustomerRepository customerRepository;
    private CustomerRepositoryTestStub customerRepositoryTestStub;
    private NotificationService notificationService;

    @Before
    public void setUp() {
        customerService = new CustomerService();
        //Mock kullanmak...
//        customerRepository = Mockito.mock(CustomerRepository.class);
//        customerService.setCustomerRepository(customerRepository);
        //Stub classi kullanmak...
        customerRepositoryTestStub = new CustomerRepositoryTestStub();
        customerService.setCustomerRepository(customerRepositoryTestStub);
        notificationService = Mockito.mock(NotificationService.class);
        customerService.setNotificationService(notificationService);
    }


    @Test
    public void testAddCustomerWithMock() {
        Customer customer = new Customer(1);
        customerService.addCustomer(customer);
        Mockito.verify(customerRepository).addCustomer(customer);
        Mockito.verify(notificationService).sendMailToNewCustomer(customer);
    }

    @Test
    public void testAddCustomerWithStub() {
        Customer customer = new Customer(1);
        customerService.addCustomer(customer);
//        assertTrue(customerRepositoryTestStub.getCustomerMap().containsValue(customer));
//        assertNotNull(customerRepositoryTestStub.findCustomer(1));
        assertEquals(customer, customerRepositoryTestStub.findCustomer(1));
//        Mockito.verify(notificationService).sendMailToNewCustomer(customer);
    }

    @Test
    public void testDeleteCustomerWithStub() {
        assertNotNull(customerRepositoryTestStub.findCustomer(1));
        customerService.removeCustomer(1);
    }
}