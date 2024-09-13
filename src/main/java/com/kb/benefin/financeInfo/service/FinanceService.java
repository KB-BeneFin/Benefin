package com.kb.benefin.financeInfo.service;

import com.kb.benefin.financeInfo.vo.FinanceInfoVo;

import java.util.List;

public interface FinanceService {
  List<FinanceInfoVo> getList(FinanceInfoVo vo);
}
