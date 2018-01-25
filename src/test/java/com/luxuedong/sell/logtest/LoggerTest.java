package com.luxuedong.sell.logtest;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by luxuedong
 * 2018/1/24 下午3:07
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LoggerTest {


    @Test
    public void test1(){
        String username="鲁雪冬";

        String age="27";

        log.info("info 名字={}, 年龄={}",username,age);

        log.error("error 名字={}, 年龄={}",username,age);

    }


}
