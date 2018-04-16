package s_12.redisjson.cart.cache;

import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import s_12.redisjson.cart.SerializeUtil;

import java.util.concurrent.TimeUnit;

@Component
public class RedisCache {

    @Autowired
    private RedisTemplate redisTemplate;

    public void delete(String key) {
        try {
            redisTemplate.delete(key);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setCache(String key, Object o) {
        try {
            if (o instanceof String) {
                String value = (String) o;
                if (!StringUtils.isEmpty(value))
                    redisTemplate.opsForValue().set(key, value, 30, TimeUnit.DAYS);
            } else {
                redisTemplate.opsForValue().set(key, new String(new Base64().encode( SerializeUtil.serizlize(o))), 30, TimeUnit.DAYS);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getStringCache(String key) {
        try {
            return (String) this.redisTemplate.opsForValue().get(key);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
