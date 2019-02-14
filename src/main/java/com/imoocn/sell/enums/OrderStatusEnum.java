package com.imoocn.sell.enums;

import lombok.Getter;

/**
 * @author jiale liu
 * @date 2019/2/12 16:55
 */
@Getter
public enum OrderStatusEnum {

    NEW(0, "新订单"),
    FINISHED(1, "完结"),
    CANCEL(2, "已取消");

    private Integer code;
    private String message;

    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
