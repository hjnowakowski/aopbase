package info.henryk.aop;

/**
 * Created by henryknowakowski on 01.07.2017.
 */
public class CustomerRepositoryimpl implements CustomerRepository {
    public Customer getCustomer(long customerid){
        return null;
    }
    public String getCustomerName(long customerid){

        return "Janek";
    }

    public void addCustomer(Customer customer){
        if(customer.getName() == null){
            throw new RuntimeException(" Customer name can't be null.");
        }
        System.out.println("Customer "+ customer.getName() + " saved");
    }
}