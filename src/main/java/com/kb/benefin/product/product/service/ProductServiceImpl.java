package com.kb.benefin.product.product.service;

import com.kb.benefin.product.product.dao.ProductDao;
import com.kb.benefin.product.product.vo.ProductVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("productService")
public class ProductServiceImpl implements ProductService {
  //@Ressource(name="memberDao")
  @Autowired
  private ProductDao productDao;

  public List<ProductVo> getList(ProductVo vo) {
    System.out.println("ProductServiceImpl 호출");
    return productDao.getList(vo);
  }
}
