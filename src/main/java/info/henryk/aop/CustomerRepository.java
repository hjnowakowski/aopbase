package info.henryk.aop;

/**
 * Created by henryknowakowski on 01.07.2017.
 */
public interface CustomerRepository {
    Customer getCustomer(long customerid);
    String getCustomerName(long customerid);
    void addCustomer(Customer customer);

}
