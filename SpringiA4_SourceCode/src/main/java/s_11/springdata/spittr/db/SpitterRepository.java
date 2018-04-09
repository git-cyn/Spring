package s_11.springdata.spittr.db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import s_11.springdata.spittr.domain.Spitter;

import java.util.List;


/**
 * Repository interface with operations for {@link Spitter} persistence.
 * @author habuma
 */
public interface SpitterRepository extends JpaRepository<Spitter, Long>, SpitterSweeper {

}
