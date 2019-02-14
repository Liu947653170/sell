package com.imoocn.sell.enums;

import lombok.Getter;

/**
 * 商品状态
 *
 * @author jiale liu
 * @date 2019/2/12 14:26
 */
@Getter
public enum ProductStatusEnum {

    UP(0, "在架"),
    DOWN(1, "下架");

    private Integer code;
    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
