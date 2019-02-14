package com.imoocn.sell.converter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.imoocn.sell.dataobject.OrderDetail;
import com.imoocn.sell.dto.OrderDTO;
import com.imoocn.sell.enums.ResultEnum;
import com.imoocn.sell.exception.SellException;
import com.imoocn.sell.form.OrderForm;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * @author jiale liu
 * @date 2019/2/14 14:26
 */
@Slf4j
public class OrderForm2OrderDTOConverter {

    public static OrderDTO convert(OrderForm orderForm) {
        Gson gson = new Gson();

        OrderDTO orderDTO = new OrderDTO();

        orderDTO.setBuyerName(orderForm.getName());
        orderDTO.setBuyerPhone(orderForm.getPhone());
        orderDTO.setBuyerAddress(orderForm.getAddress());
        orderDTO.setBuyerOpenid(orderForm.getOpenid());

        List<OrderDetail> orderDetailList = null;
        try {
            orderDetailList = gson.fromJson(orderForm.getItems(),
                    new TypeToken<List<OrderDetail>>() {
                    }.getType());
        } catch (Exception e) {
            log.error("【对象转换】错误，string={}", orderForm.getItems());
            throw new SellException(ResultEnum.PARAM_ERROR);
        }

        orderDTO.setOrderDetails(orderDetailList);

        return orderDTO;
    }
}
