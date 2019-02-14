package com.imoocn.sell.service;

import com.imoocn.sell.dataobject.ProductCategory;

import java.util.List;

/**
 * @author jiale liu
 * @date 2019/2/12 11:36
 */
public interface ProductCategoryService {

    /**
     * 根据id查找类目
     *
     * @param categoryId 类目id
     * @return 查找结果
     */
    ProductCategory findOne(Integer categoryId);

    /**
     * 查找所有类目
     *
     * @return 所有类目
     */
    List<ProductCategory> findAll();

    /**
     * 根据商品编号查询类目
     *
     * @param categoryTypeList 商品编号列表
     * @return 查询结果
     */
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    /**
     * 保存和修改类目
     *
     * @param productCategory 类目
     * @return 无
     */
    ProductCategory save(ProductCategory productCategory);
}
