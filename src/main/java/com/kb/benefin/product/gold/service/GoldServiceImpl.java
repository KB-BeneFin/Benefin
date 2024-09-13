package com.kb.benefin.product.gold.service;

import com.kb.benefin.product.gold.dao.GoldDao;
import com.kb.benefin.product.gold.vo.GoldVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("goldService")
public class GoldServiceImpl implements GoldService {
  //@Ressource(name="memberDao")
  @Autowired
  private GoldDao goldDao;

  public List<GoldVo> getList(GoldVo vo) {
    System.out.println("GoldServiceImpl 호출");
    return goldDao.getList(vo);
  }
}
