package com.kb.benefin.financeInfo.service;

import com.kb.benefin.financeInfo.dao.FinanceDao;
import com.kb.benefin.financeInfo.vo.FinanceInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("financeService")
public class FinanceServiceImpl implements FinanceService {
  //@Ressource(name="memberDao")
  @Autowired
  private FinanceDao financeDao;

  public List<FinanceInfoVo> getList(FinanceInfoVo vo) {
    System.out.println("FinanceServiceImpl 호출");
    return financeDao.getList(vo);
  }
}
