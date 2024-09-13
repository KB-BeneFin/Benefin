package com.kb.benefin.product.product.dao;


import com.kb.benefin.product.product.vo.ProductVo;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository("productDao")
public class ProductDaoImpl implements ProductDao {

  @Autowired
  SqlSessionTemplate sm;

  @Override
  public List<ProductVo> getList(ProductVo vo) {
    System.out.println("ProductDaoImpl 호출");
    return sm.selectList("Product.getList");
  }
}
