package com.kb.benefin.report.service;

import com.kb.benefin.report.vo.ReportVo;

import java.util.List;

public interface ReportService {
  List<ReportVo> getList(ReportVo vo);
}
