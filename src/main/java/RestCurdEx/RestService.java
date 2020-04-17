package RestCurdEx;

import org.springframework.stereotype.Service;

import java.util.*;
@Service
public class RestService {


    Map<Integer, RestModel> map = new HashMap<>();


    public String save(RestModel model) {
        map.put(model.getId(), model);
        return "Data Saved";

    }

    public String put(RestModel  model )
    {
        map.put(model.getId(),model);
     return "Update";
    }

    public String delete(int id)
    {
        map.remove(id);
        return "delete";
    }
    public List<RestModel> getAll()
    {
         List<RestModel> list = new ArrayList<>(map.values());
         return  list;
    }
    public RestModel get(int id)
    {
        return map.get(id);
    }



}