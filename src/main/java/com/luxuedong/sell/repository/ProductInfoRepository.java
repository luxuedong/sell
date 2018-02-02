package com.luxuedong.sell.repository;

import com.luxuedong.sell.domain.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * 商品 repository
 * Created by luxuedong
 * 2018/2/1 下午5:19
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo,String>{

    List<ProductInfo> findByProductStatus(Integer productStatus);
}
