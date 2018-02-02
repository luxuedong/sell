package com.luxuedong.sell.controller;

import com.luxuedong.sell.domain.ProductCategory;
import com.luxuedong.sell.domain.ProductInfo;
import com.luxuedong.sell.service.CategoryService;
import com.luxuedong.sell.service.ProductService;
import com.luxuedong.sell.utils.ResultBeanUtil;
import com.luxuedong.sell.viewbean.ProductInfoViewBean;
import com.luxuedong.sell.viewbean.ProductViewBean;
import com.luxuedong.sell.viewbean.ResultBean;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 买家商品
 * Created by luxuedong
 * 2018/2/2 上午11:46
 */
@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {
    @Autowired
    private ProductService productService;

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/list")
    public ResultBean list() {
        //1. 查询所有的上架商品
        List<ProductInfo> productInfoList = productService.findUpAll();

        //2. 查询类目(一次性查询)
        //精简方法(java8, lambda)
        List<Integer> categoryTypeList = productInfoList.stream()
                .map(e -> e.getCategoryType())
                .collect(Collectors.toList());
        List<ProductCategory> productCategoryList = categoryService.findByCategoryTypeIn(categoryTypeList);

        //3. 数据拼装
        List<ProductViewBean> productVOList = new ArrayList<>();
        for (ProductCategory productCategory: productCategoryList) {
            ProductViewBean productVO = new ProductViewBean();
            productVO.setCategoryType(productCategory.getCategoryType());
            productVO.setCategoryName(productCategory.getCategoryName());

            List<ProductInfoViewBean> productInfoVOList = new ArrayList<>();
            for (ProductInfo productInfo: productInfoList) {
                if (productInfo.getCategoryType().equals(productCategory.getCategoryType())) {
                    ProductInfoViewBean productInfoVO = new ProductInfoViewBean();
                    BeanUtils.copyProperties(productInfo, productInfoVO);
                    productInfoVOList.add(productInfoVO);
                }
            }
            productVO.setProductInfoViewBeanList(productInfoVOList);
            productVOList.add(productVO);
        }

        return ResultBeanUtil.success(productVOList);
    }
}
