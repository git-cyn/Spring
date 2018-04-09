package s_11.springdata.spittr.db;

import org.springframework.data.jpa.repository.JpaRepository;
import s_11.springdata.spittr.domain.Spitter;


/**
 * Repository interface with operations for {@link Spitter} persistence.
 * @author habuma
 */
public interface SpitterRepository extends JpaRepository<Spitter, Long>, SpitterSweeper {

}
