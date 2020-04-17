package SpringBootWithHibernateCurd;

import RestCurdEx.RestModel;
import RestCurdEx.RestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SwHController {
    @Autowired
    SwHService service;

    @PostMapping("Shsave")
    public String save(@RequestBody SwHModel model) {
        return service.save(model);


    }

    /*@GetMapping("Shget/{id}")
    public SwHModel get(@PathVariable("id") int id) {
        return service.get(id);

    }*/

    @GetMapping("ShgetAll")
    public List getAll() {
        return service.getAll();
    }

  /*  @PutMapping("Rhput")
    public String put(@RequestBody SwHModel model,@PathVariable("id") int id) {
       service.put(model,id);
       return "save";
    }*/

    @DeleteMapping("Shdelete/{id}")
    public String delete(@PathVariable("id") int id) {
        return service.delete(id);
    }

    @RequestMapping("Resttest")
    public String contorllerTest() {

        return "RestWithSpringboot ";
    }


}
