package com.kb.benefin.test.dao;

import com.kb.benefin.test.vo.TestVo;

import java.util.List;

public interface TestDao {
  public List<TestVo> getList(TestVo vo);
}
