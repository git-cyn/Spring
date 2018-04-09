package s_11.springdata.spittr.db;

import s_11.springdata.spittr.domain.Spittle;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;



public class SpittleRepositoryImpl implements SpittleRepositoryCustom {

  @PersistenceContext
  private EntityManager entityManager;

  public List<Spittle> findRecent() {
    return findRecent(10);
  }

  public List<Spittle> findRecent(int count) {
    return (List<Spittle>) entityManager.createQuery("select s from Spittle s order by s.postedTime desc")
        .setMaxResults(count)
        .getResultList();
  }
  
}
