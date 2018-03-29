package Chapter_10.spittr.db;

import Chapter_10.spittr.domain.Spitter;

import java.util.List;

/**
 * Repository interface with operations for {@link Spitter} persistence.
 * @author habuma
 */
public interface SpitterRepository {


  
  Spitter save(Spitter spitter);
  
  Spitter findOne(long id);

  Spitter findByUsername(String username);

  List<Spitter> findAll();

}
