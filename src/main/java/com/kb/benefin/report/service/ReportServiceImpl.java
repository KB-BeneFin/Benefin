package com.kb.benefin.report.service;

import com.kb.benefin.report.dao.ReportDao;
import com.kb.benefin.report.vo.ReportVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("reportService")
public class ReportServiceImpl implements ReportService {
  //@Ressource(name="memberDao")
  @Autowired
  private ReportDao reportDao;

  public List<ReportVo> getList(ReportVo vo) {
    System.out.println("ReportServiceImpl 호출");
    return reportDao.getList(vo);
  }
}
