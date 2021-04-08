package com.xuecheng.auth;


import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TestRedis {

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Test
    public void testRedis(){
        //定义key
        String key = "user_token:895741a1-bea2-400a-98c7-c01358693add";
        //定义value
        Map<String,String> value = new HashMap<>();
        value.put("jwt","eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJjb21wYW55SWQiOm51bGwsInVzZXJwaWMiOm51bGwsInVzZXJfbmFtZSI6IlhjV2ViQXBwIiwic2NvcGUiOlsiYXBwIl0sIm5hbWUiOm51bGwsInV0eXBlIjpudWxsLCJpZCI6bnVsbCwiZXhwIjoxNjE3ODQxNTc4LCJqdGkiOiI4OTU3NDFhMS1iZWEyLTQwMGEtOThjNy1jMDEzNTg2OTNhZGQiLCJjbGllbnRfaWQiOiJYY1dlYkFwcCJ9.jVBUTS0vLnUv-X-H34qJkSfNFNPF_Oj2LqpyCuKF14wlI8NVuwbzkvPgGv02t9eSkok6yI2LRkucfSlo8Ncf0rNqf0IqwyphUj_WTF_glaqp9o2DKqWdCoHAzl7QAhdsJqS6kl1ZNFtCqD-hlufWe_kksPfnlUEt2UKizrXGaIH1-qiYo57IKoYPHjUf75AJ9TSO3e0Qmob2DTWIHeBqpVB2UKc4_P8RmhXR3OBdxIbGs4C6HWqD4BxsEKYRWArTBaSxOv6h3Jgpi1o9HpkGCXxrXSy8Nh-EcweZf9XhvXeCaHG_JJuuURIt0WPyUAUQC2qocbKSbhwQpmxi5s63tQ");
        value.put("refresh_token","eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJjb21wYW55SWQiOm51bGwsInVzZXJwaWMiOm51bGwsInVzZXJfbmFtZSI6IlhjV2ViQXBwIiwic2NvcGUiOlsiYXBwIl0sImF0aSI6Ijg5NTc0MWExLWJlYTItNDAwYS05OGM3LWMwMTM1ODY5M2FkZCIsIm5hbWUiOm51bGwsInV0eXBlIjpudWxsLCJpZCI6bnVsbCwiZXhwIjoxNjE3ODQxNTc4LCJqdGkiOiIzMWYzODE3Mi1mZDg5LTQ0NzctOGUwNC0yYzVjNzc2OTI3OWQiLCJjbGllbnRfaWQiOiJYY1dlYkFwcCJ9.bB-qyKvZkzHovAOoy-3elIEUmXR6rxAtywBmlXuv6VLOEbqOMuBbGkQPD0RN8xg64nDaYvVI4QqgfF6PJe5vB9xcApdYAwUDVpuMRbsxuNMt0-FScLjjdXL9IGZiXMAJ1KE_aeG47eE2pZo0S--u2PoWLd4N9kW5Wtqn8B4rTU822ap2gKBy8HoZD6AGtG0UkQmEQjhrRtHwrBR5Vi4yy_HOlGCSFJtKCnV__TTwoTpmgrs8xqzSWOF3qp91NfTfK9dKzT5pJKERg9B7ixWDPeZ84dic3JCWwSSKmloIWgYnxwe8KI5Zx27rkqToa1JwkMOhVCIOihGBf3nm1eLKBA");
        String jsonString = JSON.toJSONString(value);
        //校验key是否存在,不存在返回-2
        Long expire = stringRedisTemplate.getExpire(key,TimeUnit.SECONDS);
        System.out.println(expire);
        //存储数据
        stringRedisTemplate.boundValueOps(key).set(jsonString,30, TimeUnit.SECONDS);
        //获取数据
        String string = stringRedisTemplate.opsForValue().get(key);
        System.out.println(string);
    }

}
