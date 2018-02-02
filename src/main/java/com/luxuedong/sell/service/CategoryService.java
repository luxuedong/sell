package com.luxuedong.sell.service;

import com.luxuedong.sell.domain.ProductCategory;

import java.util.List;

/**
 * Created by luxuedong
 * 2018/2/1 下午3:30
 */
public interface CategoryService {

    /**
     * query ProduceCategory by id
     * @param categoryId
     * @return
     */
    ProductCategory findOne(Integer categoryId);

    /**
     * query All ProduceCategory list
     * @return
     */
    List<ProductCategory> findAll();

    /**
     * query ProduceCategory list by categoryTypes
     * @param categoryTypes
     * @return
     */
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypes);

    /**
     * insert or update
     * @param productCategory
     * @return
     */
    ProductCategory save(ProductCategory productCategory);

}
