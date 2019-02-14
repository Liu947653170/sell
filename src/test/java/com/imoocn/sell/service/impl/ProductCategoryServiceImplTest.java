package com.imoocn.sell.service.impl;

import com.imoocn.sell.dataobject.ProductCategory;
import com.imoocn.sell.service.ProductCategoryService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

/**
 * @author jiale liu
 * @date 2019/2/12 11:50
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryServiceImplTest {

    @Autowired
    ProductCategoryService categoryService;

    @Test
    public void findOne() {
        ProductCategory productCategory = categoryService.findOne(1);

        Assert.assertEquals(new Integer(1), productCategory.getCategoryId());
    }

    @Test
    public void findAll() {

        List<ProductCategory> productCategories = categoryService.findAll();

        Assert.assertNotNull(productCategories.size());
    }

    @Test
    public void findByCategoryTypeIn() {

        List<Integer> list = Arrays.asList(2, 3);

        List<ProductCategory> byCategoryTypeIn = categoryService.findByCategoryTypeIn(list);

        Assert.assertNotNull(byCategoryTypeIn.size());

    }

    @Test
    public void save() {

        ProductCategory productCategory = new ProductCategory("学生最爱", 5);
        categoryService.save(productCategory);

        ProductCategory one = categoryService.findOne(4);

        Assert.assertEquals(new Integer(4), one.getCategoryId());
    }
}