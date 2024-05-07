package quyet.example.bootApp.repos;

import org.springframework.stereotype.Repository;
import quyet.example.bootApp.JPA.Customer;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByFirstName(String firstName);    List<Customer> findByLastName(String lastName);
    Customer findById(long id);
}
