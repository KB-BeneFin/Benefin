package com.kb.benefin.testResult.service;

import com.kb.benefin.testResult.vo.TestResultVo;

import java.util.List;

public interface TestResultService {
  List<TestResultVo> getList(TestResultVo vo);
}
