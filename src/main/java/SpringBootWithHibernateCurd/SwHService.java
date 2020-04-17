package SpringBootWithHibernateCurd;

import RestCurdEx.RestModel;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class SwHService implements RestRepo {

    @Autowired
    public SessionFactory factory;

    public  Session getSession() {
        Session session = null;
        if (factory.getCurrentSession() == null) {
            return session = factory.openSession();
        }

        return session;
    }


    @Override
    public String save(SwHModel model) {
        getSession().save(model);
        return "Data saved";
    }

    @Override
    public List<RestModel> getAll() {
        return getSession().createCriteria(SwHModel.class).list();

    }

  /*  @Override
    public SwHModel get(Integer id) {

        Session session = factory.getCurrentSession();
        SwHModel user=(SwHModel) session.get(SwHModel.class,id);
        return user;
    }*/

    @Override
    public String delete(int id) {
        getSession().delete(id);

        return "delete";
    }

   /* @Override
    public SwHModel put(SwHModel model,int id) {
        SwHModel model1=(SwHModel) getSession().get(SwHModel.class,id);
               model1.setId(model.getId());
               model1.setName(model.getName());
           getSession().update(model1);

return model1;
    }*/
}