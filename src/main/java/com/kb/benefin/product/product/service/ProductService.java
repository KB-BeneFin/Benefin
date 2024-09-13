package com.kb.benefin.product.product.service;

import com.kb.benefin.product.product.vo.ProductVo;

import java.util.List;

public interface ProductService {
  List<ProductVo> getList(ProductVo vo);
}
