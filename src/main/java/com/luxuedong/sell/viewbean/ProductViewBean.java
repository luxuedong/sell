package com.luxuedong.sell.viewbean;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * 商品(包含类目)
 * Created by luxuedong
 * 2018/2/2 上午11:50
 */
@Data
public class ProductViewBean {

    @JsonProperty("name")
    private String categoryName;

    @JsonProperty("type")
    private Integer categoryType;

    @JsonProperty("foods")
    private List<ProductInfoViewBean> productInfoViewBeanList;
}
