package com.kb.benefin.product.gold.dao;


import com.kb.benefin.product.gold.vo.GoldVo;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository("goldDao")
public class GoldDaoImpl implements GoldDao {

  @Autowired
  SqlSessionTemplate sm;

  @Override
  public List<GoldVo> getList(GoldVo vo) {
    System.out.println("GoldDaoImpl 호출");
    return sm.selectList("Gold.getList");
  }
}
