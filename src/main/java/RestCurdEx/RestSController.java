package RestCurdEx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestSController {
    @Autowired
    RestService service;

    @PostMapping("Restsave")
    public String save(@RequestBody RestModel model) {
        return service.save(model);


    }

    @GetMapping("Restget/{id}")
    public RestModel get(@PathVariable("id") int id) {
        return service.get(id);

    }

    @GetMapping("RestgetAll")
    public List getAll() {
        return service.getAll();
    }

    @PutMapping("Restput")
    public String put(@RequestBody RestModel model) {
        return service.put(model);
    }

    @DeleteMapping("Restdelete/{id}")
    public String delete(@PathVariable("id") int id) {
        return service.delete(id);
    }

    @RequestMapping("Resttest")
    public String contorllerTest() {

        return "RequestMapping ";
    }


}
