package com.imoocn.sell.dto;

import lombok.Data;

/**
 * @author jiale liu
 * @date 2019/2/13 11:01
 */
@Data
public class CartDTO {

    private String productId;

    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
