package com.imoocn.sell.repository;

import com.imoocn.sell.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author jiale liu
 * @date 2019/2/12 12:26
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo, String> {

    /**
     * 根据状态查询商品列表
     *
     * @param productStatus 商品状态
     * @return 该状态的商品列表
     */
    List<ProductInfo> findByProductStatus(Integer productStatus);
}
