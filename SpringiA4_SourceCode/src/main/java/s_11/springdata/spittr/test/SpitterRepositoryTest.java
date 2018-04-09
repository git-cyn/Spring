package s_11.springdata.spittr.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import s_11.springdata.spittr.db.SpitterRepository;
import s_11.springdata.spittr.domain.Spitter;

import java.util.List;

import static org.junit.Assert.assertEquals;


@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes=JpaConfig.class)
@ContextConfiguration("classpath:jpaspringdata-context.xml")
public class SpitterRepositoryTest {

	@Autowired
	SpitterRepository spitterRepository;

	@Test
	@Transactional
	public void findAll() {
		List<Spitter> spitters = spitterRepository.findAll();
		System.out.println(spitters.size());
	}
}
