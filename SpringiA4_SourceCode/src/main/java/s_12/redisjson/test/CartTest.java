package s_12.redisjson.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import s_12.redisjson.cart.Product;
import s_12.redisjson.cart.RedisCaches;
import s_12.redisjson.cart.RedisConfig;
import s_12.redisjson.cart.cache.RedisCache;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=RedisConfig.class)

public class CartTest {

	@Autowired
	private RedisCache redisCaches;

	@Test
	public void workingWithSimpleValues() {
		Product product = new Product();
		product.setSku("123");
		product.setName("123456");
		product.setPrice(39.99f);
		redisCaches.setCache("123",product);
		System.out.println(product.getName());
	}

	@Test
	public void workingWidthSimpleValues() {

		System.out.println(redisCaches.getStringCache("123"));
	}
}
