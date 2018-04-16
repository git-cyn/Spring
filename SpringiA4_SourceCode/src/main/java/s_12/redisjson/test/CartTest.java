package s_12.redisjson.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import s_12.redisjson.cart.Product;
import s_12.redisjson.cart.RedisConfig;
import s_12.redisjson.cart.cache.RedisCache;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=RedisConfig.class)

public class CartTest {

	@Autowired
	private RedisCache redisCache;

	@Test
	public void workingWithSimpleValues() {
		Product product = new Product();
		product.setSku("123");
		product.setName("123456");
		product.setPrice(39.99f);
		redisCache.setCache("123",product);
		System.out.println(product.getName());
	}

	@Test
	public void workingWidthSimpleValues() {

		System.out.println(redisCache.getStringCache("123"));
	}
}
