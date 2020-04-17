package SpringMVCExceptionHandling;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class CustoerService {
    @Autowired
    CustomerRepo repo;

    @PostConstruct
    public void add() {
        List<Customer> list = new ArrayList<>();
        list.add(new Customer(101, "Mobile", 2000));
        list.add(new Customer(102, "laptop", 10000));
        Customer custome = new Customer();
        for (Customer cu : list) {
            repo.save(cu);
        }

    }

    public int get(String name) throws CustomerException {
        int amount = 0;
        Customer price;
        try {

            price = repo.findByName(name);
            amount = price.getPrice();


        } catch (Exception ex) {
            throw new CustomerException("Oder not found");
        }

        return amount;
    }

}

