package s_11.springdata.spittr.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import s_11.springdata.spittr.domain.Spitter;
import s_11.springdata.spittr.db.SpitterRepository;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=JpaConfig.class)
public class SpitterRepositoryTest {

	@Autowired
	SpitterRepository spitterRepository;
	
	@Test
	@Transactional
	public void count() {
		assertEquals(4, spitterRepository.count());
	}
	
	@Test
	@Transactional
	public void findAll() {
		List<Spitter> spitters = spitterRepository.findAll();

	}
}
