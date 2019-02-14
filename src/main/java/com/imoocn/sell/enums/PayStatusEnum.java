package com.imoocn.sell.enums;

import lombok.Getter;

/**
 * @author jiale liu
 * @date 2019/2/12 16:59
 */
@Getter
public enum PayStatusEnum {
    WAIT(0, "等待支付"),
    SUCCESS(1, "支付成功");
    private Integer code;
    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }}
