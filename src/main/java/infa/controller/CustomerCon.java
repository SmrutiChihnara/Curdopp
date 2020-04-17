package infa.controller;



import infa.model.Customer;
import infa.services.CustomerSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CustomerCon {

    @Autowired
    public CustomerSer customerSer;

    @PostMapping("/saveData")
    public String save(@RequestBody Customer customer) {
        return customerSer.saveCustomer(customer);
    }

    @GetMapping("/getAll")
    public List<Customer> getAll() {
        return customerSer.getAll();
    }

    @GetMapping("/get/{id}")
    public Optional<Customer> get(@PathVariable("id") int id) {
        return customerSer.get(id);
    }

    @PutMapping("/put/{id}")
    public String put(@RequestBody Customer customer, @PathVariable("id") int id) {
        return customerSer.update(customer,id);

    }
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable("id") int id)
    {
       return customerSer.delete(id);
    }
    @GetMapping("test")
    public String getTest()
    {
        return "Test";
    }


}
