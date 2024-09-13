package com.kb.benefin.financeInfo.dao;

import com.kb.benefin.financeInfo.vo.FinanceInfoVo;

import java.util.List;

public interface FinanceDao {
  public List<FinanceInfoVo> getList(FinanceInfoVo vo);
}
