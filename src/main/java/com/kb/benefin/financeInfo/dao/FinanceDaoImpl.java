package com.kb.benefin.financeInfo.dao;


import com.kb.benefin.financeInfo.vo.FinanceInfoVo;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository("financeDao")
public class FinanceDaoImpl implements FinanceDao {

  @Autowired
  SqlSessionTemplate sm;

  @Override
  public List<FinanceInfoVo> getList(FinanceInfoVo vo) {
    System.out.println("FinanceDaoImpl 호출");
    return sm.selectList("Finance.getList");
  }
}
