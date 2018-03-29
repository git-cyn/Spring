package Chapter_10.spittr.jdbctest;

import static org.junit.Assert.*;

import java.util.List;

import Chapter_10.spittr.db.jdbc.JdbcSpitterRepository;
import Chapter_10.spittr.domain.Spitter;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;


@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:JdbcRepositoryTests-context.xml")
@ContextConfiguration(classes = JdbcConfig.class)
public class JdbcSpitterRepositoryTest {

  @Autowired
  JdbcSpitterRepository spitterRepository;

  @Test
  @Transactional
  public void findAll() {
    List<Spitter> spitters = spitterRepository.findAll();
    System.out.println(spitters.get(0).getEmail());
  }
}
