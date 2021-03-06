package com.imoocn.sell.service;

import com.imoocn.sell.dto.OrderDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @author jiale liu
 * @date 2019/2/13 10:21
 */
public interface OrderService {

    /**
     * 创建订单
     */
    OrderDTO create(OrderDTO orderDTO);

    /**
     * 查询单个订单
     */
    OrderDTO findOne(String orderId);

    /**
     * 查询订单列表
     */
    Page<OrderDTO> findAll(String buyerOpenid, Pageable pageable);

    /**
     * 取消订单
     */
    OrderDTO cancel(OrderDTO orderDTO);

    /**
     * 完成订单
     */
    OrderDTO finish(OrderDTO orderDTO);

    /**
     * 支付订单
     */
    OrderDTO paid(OrderDTO orderDTO);
}
