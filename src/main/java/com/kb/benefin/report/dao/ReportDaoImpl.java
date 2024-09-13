package com.kb.benefin.report.dao;


import com.kb.benefin.report.vo.ReportVo;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository("reportDao")
public class ReportDaoImpl implements ReportDao {

  @Autowired
  SqlSessionTemplate sm;

  @Override
  public List<ReportVo> getList(ReportVo vo) {
    System.out.println("ReportDaoImpl 호출");
    return sm.selectList("Report.getList");
  }
}
