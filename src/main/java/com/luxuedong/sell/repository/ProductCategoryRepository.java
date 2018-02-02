package com.luxuedong.sell.repository;

import com.luxuedong.sell.domain.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * 类目 repository
 * Created by luxuedong
 * 2018/1/25 上午10:52
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Integer>{

    /**
     * query ProduceCategory list by categoryTypes
     * @param types
     * @return
     */
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> types);

}
