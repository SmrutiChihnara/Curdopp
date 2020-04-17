package SpringMVCExceptionHandling;

import infa.services.CustomerSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerContro {
    @Autowired
    CustoerService ser;
    @GetMapping("getPrice/{name}")
    public int gdata(@PathVariable("name")String name) throws CustomerException
    {
        return ser.get(name);
    }
@RequestMapping("getAllTest")
    public String GetTest()
    {
        return  "Test me ..)";
    }


}
