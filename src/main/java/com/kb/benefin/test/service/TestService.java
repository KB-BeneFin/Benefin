package com.kb.benefin.test.service;

import com.kb.benefin.test.vo.TestVo;

import java.util.List;

public interface TestService {
  List<TestVo> getList(TestVo vo);
}
