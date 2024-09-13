package com.kb.benefin.report.dao;

import com.kb.benefin.report.vo.ReportVo;

import java.util.List;

public interface ReportDao {
  public List<ReportVo> getList(ReportVo vo);
}
