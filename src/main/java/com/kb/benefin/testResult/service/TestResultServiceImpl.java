package com.kb.benefin.testResult.service;

import com.kb.benefin.testResult.vo.TestResultVo;
import com.kb.benefin.testResult.dao.TestResultDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("testResultService")
public class TestResultServiceImpl implements TestResultService {
  //@Ressource(name="memberDao")
  @Autowired
  private TestResultDao testResultDao;

  public List<TestResultVo> getList(TestResultVo vo) {
    System.out.println("TestResultServiceImpl 호출");
    return testResultDao.getList(vo);
  }
}
