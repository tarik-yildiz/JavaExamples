package UnitTestExamples.Services;

import UnitTestExamples.Model.Customer;

public class NotificationService {

    public void sendMailToNewCustomer(Customer customer) {
        System.out.println("Mail sent to: "+ customer);
    }
}