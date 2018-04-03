package s_11.hibernate4.spittr.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import s_11.hibernate4.spittr.db.SpitterRepository;
import s_11.hibernate4.spittr.domain.Spitter;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:Hibernate4-context.xml")
public class SpitterRepositoryTest {

  @Autowired
  SpitterRepository spitterRepository;

  @Test
  @Transactional
  public void count() {
    System.out.println(spitterRepository.count()+",,,,,,,iiiiiii");
  }
}
