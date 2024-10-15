package UnitTestExamples.Repository;

import UnitTestExamples.Model.Customer;

public class CustomerRepository {
    public void addCustomer(Customer customer){
        System.out.println(customer+" added.");
    }
    public void removeCustomer(Integer customerId){
        System.out.println(customerId+" removed!");
    }
    public Customer findCustomer(Integer customerId){
        System.out.println("Find customer");
        return null;
    }
}