package s_11.hibernate4.spittr.db.hibernate4;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import s_11.hibernate4.spittr.db.SpitterRepository;
import s_11.hibernate4.spittr.domain.Spitter;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

@Repository
public class HibernateSpitterRepository implements SpitterRepository {

    @Resource
    private SessionFactory sessionFactory;

//    @Inject
//    public HibernateSpitterRepository(SessionFactory sessionFactory) {
//        this.sessionFactory = sessionFactory;         //<co id="co_InjectSessionFactory"/>
//    }

    private Session currentSession() {
        return sessionFactory.getCurrentSession();//<co id="co_RetrieveCurrentSession"/>
    }

    public long count() {
        return findAll().size();
    }

    public Spitter save(Spitter spitter) {
        Serializable id = currentSession().save(spitter);  //<co id="co_UseCurrentSession"/>
        return new Spitter((Long) id,
                spitter.getUsername(),
                spitter.getPassword(),
                spitter.getFullName(),
                spitter.getEmail(),
                spitter.isUpdateByEmail());
    }

    public Spitter findOne(long id) {
        System.out.println(111);
        Spitter spitter =(Spitter)  currentSession().get(Spitter.class, id);
        System.out.println("Hibernate一级缓存原因，查询语句只会显示一次");
        Spitter spitter2 =(Spitter)  currentSession().get(Spitter.class, id);

        List<Spitter> spitters =findAll();
        return spitter;
    }

    public Spitter findByUsername(String username) {
        return (Spitter) currentSession()
                .createCriteria(Spitter.class)
                .add(Restrictions.eq("username", username))
                .list().get(0);
    }

    public List<Spitter> findAll() {
        return (List<Spitter>) currentSession()
                .createCriteria(Spitter.class).list();
    }

}
