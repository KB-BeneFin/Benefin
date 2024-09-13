package com.kb.benefin.product.gold.dao;

import com.kb.benefin.product.gold.vo.GoldVo;

import java.util.List;

public interface GoldDao {
  public List<GoldVo> getList(GoldVo vo);
}
