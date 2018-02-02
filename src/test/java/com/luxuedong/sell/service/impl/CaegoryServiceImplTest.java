package com.luxuedong.sell.service.impl;

import com.luxuedong.sell.domain.ProductCategory;
import com.luxuedong.sell.domain.ProductInfo;
import com.luxuedong.sell.enums.ProductStatusEnum;
import com.luxuedong.sell.service.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Created by luxuedong
 * 2018/2/1 下午4:49
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class CaegoryServiceImplTest {

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private ProductServiceImpl productService;

    @Test
    public void findOne() {
    }

    @Test
    public void findAll() {
    }

    @Test
    public void findByCategoryTypeIn() {
    }

    @Test
    public void save() {
        ProductCategory category = new ProductCategory();
        category.setCategoryName("热销榜");
        category.setCategoryType(001);
        ProductCategory save = categoryService.save(category);
        log.info("新增 {}",save);
        Assert.assertEquals(new Integer(2), save.getCategoryType());

    }

    @Test
    public void save1() throws Exception {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("123457");
        productInfo.setProductName("皮皮虾");
        productInfo.setProductPrice(new BigDecimal(3.2));
        productInfo.setProductStock(100);
        productInfo.setProductDescription("很好吃的虾");
        productInfo.setProductIcon("http://xxxxx.jpg");
        productInfo.setProductStatus(ProductStatusEnum.DOWN.getCode());
        productInfo.setCategoryType(2);

        ProductInfo result = productService.save(productInfo);
        Assert.assertNotNull(result);
    }
}