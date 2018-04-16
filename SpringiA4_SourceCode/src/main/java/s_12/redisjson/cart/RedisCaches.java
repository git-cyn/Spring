/*
 * FileName:RedisCache.java
 * Copyright(C) 2016-2019 思发路网络科技有限公司
 * All rights reserved.
 * -----------------------------------------------
 * 2017-09-20-15:30 Created
 */
package s_12.redisjson.cart;

import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.Set;
import java.util.concurrent.TimeUnit;

@Component
public class RedisCaches {

    private StringRedisTemplate stringRedisTemplate;

    public void delete(String key) {
        try {
            stringRedisTemplate.delete(key);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setCache(String key, Object o) {
        try {
            if (o instanceof String) {
                String value = (String) o;
                if (!StringUtils.isEmpty(value))
                    stringRedisTemplate.opsForValue().set(key, value, 30, TimeUnit.DAYS);
            } else {
                stringRedisTemplate.opsForValue().set(key, new String(new Base64().encode( SerializeUtil.serizlize(o))), 30, TimeUnit.DAYS);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getStringCache(String key) {
        try {
            return this.stringRedisTemplate.opsForValue().get(key);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
