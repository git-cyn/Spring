package s_11.jpahibernate.spittr.test.spittr.db.jpa;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import s_11.jpahibernate.spittr.db.SpitterRepository;
import s_11.jpahibernate.spittr.domain.Spitter;


import javax.annotation.Resource;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:Jpahibernate-context.xml")
public class SpitterRepositoryTest {

	@Autowired
	SpitterRepository spitterRepository;
	
	@Test
	@Transactional
	public void count() {
		System.out.println(spitterRepository.count());

	}

}
