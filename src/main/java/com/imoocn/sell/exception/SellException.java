package com.imoocn.sell.exception;

import com.imoocn.sell.enums.ResultEnum;

/**
 * @author jiale liu
 * @date 2019/2/13 10:37
 */
public class SellException extends RuntimeException {

    private Integer code;

    public SellException(ResultEnum resultEnum) {

        super(resultEnum.getMessage());

        this.code = resultEnum.getCode();
    }

    public SellException(Integer code, String message) {

        super(message);
        this.code = code;
    }
}
