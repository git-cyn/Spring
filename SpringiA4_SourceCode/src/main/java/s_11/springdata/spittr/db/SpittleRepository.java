package s_11.springdata.spittr.db;

import org.springframework.data.jpa.repository.JpaRepository;
import s_11.springdata.spittr.domain.Spittle;

import java.util.List;


/**
 * Repository interface with operations for {@link Spittle} persistence.
 * @author habuma
 */
public interface SpittleRepository extends JpaRepository<Spittle, Long>, SpittleRepositoryCustom {
  
  List<Spittle> findBySpitterId(long spitterId);
  
}
