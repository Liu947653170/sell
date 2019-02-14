package com.imoocn.sell.service;

import com.imoocn.sell.dto.OrderDTO;

/**
 * 买家
 *
 * @author jiale liu
 * @date 2019/2/14 15:52
 */
public interface BuyerService {

    /**
     * 查询一个订单
     *
     * @param openid
     * @param orderId
     * @return
     */
    OrderDTO findOrderOne(String openid, String orderId);

    /**
     * 取消订单
     *
     * @param openid
     * @param orderId
     * @return
     */
    OrderDTO cancelOrder(String openid, String orderId);
}
