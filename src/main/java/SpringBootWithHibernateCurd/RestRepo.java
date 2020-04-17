package SpringBootWithHibernateCurd;

import RestCurdEx.RestModel;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface RestRepo {

    public String save(SwHModel model);
    public List<RestModel> getAll();
    //public RestModel get(Integer id);
    public String delete(int id);
   // public String put(SwHModel model,int id);

}
