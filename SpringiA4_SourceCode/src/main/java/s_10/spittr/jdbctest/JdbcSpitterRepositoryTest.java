package s_10.spittr.jdbctest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import s_10.spittr.db.jdbc.JdbcSpitterRepository;
import s_10.spittr.domain.Spitter;

import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=JdbcConfig.class)
//@ContextConfiguration(classes = JdbcConfig.class)
public class JdbcSpitterRepositoryTest {

  @Autowired
  JdbcSpitterRepository spitterRepository;

  @Test
  public void findAll() {
    List<Spitter> spitters = spitterRepository.findAll();
    System.out.println(spitters.get(0).getEmail());
  }
}
