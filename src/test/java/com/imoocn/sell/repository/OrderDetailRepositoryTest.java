package com.imoocn.sell.repository;

import com.imoocn.sell.dataobject.OrderDetail;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author jiale liu
 * @date 2019/2/13 10:11
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailRepositoryTest {

    @Autowired
    private OrderDetailRepository repository;

    @Test
    public void saveTest() {
        OrderDetail orderDetail = new OrderDetail();

        orderDetail.setDetailId("123456744");
        orderDetail.setOrderId("111223");
        orderDetail.setProductIcon("http://xxx.jpg");
        orderDetail.setProductId("1112221");
        orderDetail.setProductName("iphone");
        orderDetail.setProductPrice(new BigDecimal(2.2));
        orderDetail.setProductQuantity(3);

        OrderDetail result = repository.save(orderDetail);
        Assert.assertNotNull(result);
    }

    @Test
    public void findByOrderIdTest() {

        List<OrderDetail> orderDetailList = repository.findByOrderId("111223");
        Assert.assertNotEquals(0, orderDetailList.size());
    }
}