package UnitTestExamples.Services;

import UnitTestExamples.Model.Customer;
import UnitTestExamples.Repository.CustomerRepository;

public class CustomerService {
    private CustomerRepository customerRepository;
    private NotificationService notificationService;

    public void addCustomer(Customer customer){
        customerRepository.addCustomer(customer);
        notificationService.sendMailToNewCustomer(customer);
    }

    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void setNotificationService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }
    public void removeCustomer(Integer customerId){
        customerRepository.removeCustomer(customerId);
    }
}