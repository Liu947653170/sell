package com.imoocn.sell.service;

import com.imoocn.sell.dataobject.ProductInfo;
import com.imoocn.sell.dto.CartDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * 商品
 *
 * @author jiale liu
 * @date 2019/2/12 14:19
 */
public interface ProductInfoService {

    ProductInfo findOne(String productId);

    /**
     * 查询所有上架的商品
     *
     * @return 列表
     */
    List<ProductInfo> findUpAll();

    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);

    /**
     * 加库存
     *
     * @param cartDTOList 购物车
     */
    void increaseStock(List<CartDTO> cartDTOList);

    /**
     * 减库存
     *
     * @param cartDTOList 购物车
     */
    void decreaseStock(List<CartDTO> cartDTOList);
}
