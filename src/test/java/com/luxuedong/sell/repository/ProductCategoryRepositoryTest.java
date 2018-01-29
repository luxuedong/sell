package com.luxuedong.sell.repository;

import com.luxuedong.sell.domain.ProductCategory;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

/**
 * Created by luxuedong
 * 2018/1/25 上午10:53
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository repository;

    @Test
    @Transactional
    public void saveTest(){
        ProductCategory category = new ProductCategory();
        category.setCategoryName("热销榜");
        category.setCategoryType(1001);
        ProductCategory save = repository.save(category);
        log.info("【新增记录】{}",save);
        Assert.assertNotNull(save);
    }

    @Test
    public void findOneTest(){
        ProductCategory one = repository.findOne(1);
        log.info("【查询对象】{}",one);
    }

    @Test
    @Transactional
    public void updateTest(){
        ProductCategory category = new ProductCategory();
        category.setCategoryId(1);
        category.setCategoryName("精品");
        category.setCategoryType(1002);
        ProductCategory save = repository.save(category);
        Assert.assertNotNull(save);
    }

}