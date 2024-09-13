package com.kb.benefin.testResult.dao;


import com.kb.benefin.testResult.vo.TestResultVo;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository("testResultDao")
public class TestResultDaoImpl implements TestResultDao {

  @Autowired
  SqlSessionTemplate sm;

  @Override
  public List<TestResultVo> getList(TestResultVo vo) {
    System.out.println("TestResultDaoImpl 호출");
    return sm.selectList("TestResult.getList");
  }
}
