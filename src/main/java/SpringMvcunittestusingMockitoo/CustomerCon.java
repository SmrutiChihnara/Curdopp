package SpringMvcunittestusingMockitoo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerCon {
    @Autowired
    CustReoist repo;
    @PostMapping("/savetest")
    public Response save(@RequestBody Customer customer)
    {
        repo.save(customer);
        return new Response(customer.getId(),true);
    }
    @GetMapping("getAlltest")
    public Response getAll()
    {
        List<Customer> list=repo.findAll();
        return new Response(list.size(),true);
    }


}
