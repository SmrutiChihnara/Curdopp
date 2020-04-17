package infa.services;


import infa.model.Customer;
import infa.repostery.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

;

@Service
public class CustomerSer {
    @Autowired
    CustomerRepo customerRepo;
    public String saveCustomer(Customer customer)
    {
        customerRepo.save(customer);
        return  "save";
    }
    public List<Customer> getAll()
    {
        return customerRepo.findAll();
    }
    public String delete(int id)
    {
        customerRepo.deleteById(id);
        return "delete";
    }

    public Optional<Customer> get(int id)
    {
        return customerRepo.findById(id);
    }

    public String update(Customer customer,int id)
    {
        Customer customer1= new Customer();
        customer1.setId(customer.getId());
        customer1.setName(customer.getName());
        customerRepo.save(customer1);
        return "Data updateed";
    }
}
