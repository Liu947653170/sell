package com.imoocn.sell.service.impl;

import com.imoocn.sell.dataobject.ProductInfo;
import com.imoocn.sell.enums.ProductStatusEnum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author jiale liu
 * @date 2019/2/12 14:31
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoServiceImpTest {

    @Autowired
    private ProductInfoServiceImp productInfoServiceImp;

    @Test
    public void findOne() {
        ProductInfo one = productInfoServiceImp.findOne("123456");

        Assert.assertEquals("123456", one.getProductId());
    }

    @Test
    public void findUpAll() {

        List<ProductInfo> upAll = productInfoServiceImp.findUpAll();

        Assert.assertNotNull(upAll);
    }

    @Test
    public void findAll() {
        PageRequest request = PageRequest.of(0, 2);
        Page<ProductInfo> page = productInfoServiceImp.findAll(request);
        Assert.assertEquals(0, page.getTotalElements());
    }

    @Test
    public void save() {

        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("22554");
        productInfo.setProductName("包");
        productInfo.setProductPrice(new BigDecimal(1000));
        productInfo.setProductStock(200);
        productInfo.setProductDescription("难看的");
        productInfo.setProductIcon("http://xxxxa.jpg");
        productInfo.setProductStatus(ProductStatusEnum.DOWN.getCode());
        productInfo.setCategoryType(3);

        ProductInfo info = productInfoServiceImp.save(productInfo);
        Assert.assertNotNull(info);


    }
}