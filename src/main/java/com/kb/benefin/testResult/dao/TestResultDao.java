package com.kb.benefin.testResult.dao;

import com.kb.benefin.testResult.vo.TestResultVo;

import java.util.List;

public interface TestResultDao {
  public List<TestResultVo> getList(TestResultVo vo);
}
