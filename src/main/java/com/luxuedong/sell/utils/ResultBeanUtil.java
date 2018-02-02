package com.luxuedong.sell.utils;

import com.luxuedong.sell.viewbean.ResultBean;

/**
 * Created by luxuedong
 * 2018/2/2 上午11:42
 */
public class ResultBeanUtil {

    public static ResultBean success(Object object) {
        ResultBean result = new ResultBean();
        result.setData(object);
        result.setCode(0);
        result.setMsg("成功");
        return result;
    }

    public static ResultBean success() {
        return success(null);
    }

    public static ResultBean error(Integer code, String msg) {
        ResultBean result = new ResultBean();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}
