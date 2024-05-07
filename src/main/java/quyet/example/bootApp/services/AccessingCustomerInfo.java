package quyet.example.bootApp.services;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import quyet.example.bootApp.JPA.Customer;
import quyet.example.bootApp.repos.CustomerRepository;

import java.util.Optional;

@RestController
public class AccessingCustomerInfo {

    @Autowired
    CustomerRepository repository;

    private static final Logger log = LoggerFactory.getLogger(AccessingCustomerInfo.class);

    @GetMapping("/fetchAll")
    public String access(){
        Iterable<Customer> result;
        return fetchAllCustomer() == null? "" : fetchAllCustomer().toString();

    }

    public Iterable<Customer> fetchAllCustomer(){
        return this.repository.findAll();
    }

    public void persistCustomer(Customer c){
        this.repository.save(c);
    }

    public void fetchCustomerbyID(Long id){
        // fetch an individual customer by ID
        Optional<Customer> customer = repository.findById(id);
    }
}
