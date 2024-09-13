package com.kb.benefin.product.product.dao;

import com.kb.benefin.product.product.vo.ProductVo;

import java.util.List;

public interface ProductDao {
  public List<ProductVo> getList(ProductVo vo);
}
