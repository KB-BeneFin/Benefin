package com.kb.benefin.test.service;

import com.kb.benefin.test.vo.TestVo;
import com.kb.benefin.test.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("testService")
public class TestServiceImpl implements TestService {
  //@Ressource(name="memberDao")
  @Autowired
  private TestDao testDao;

  public List<TestVo> getList(TestVo vo) {
    System.out.println("TestServiceImpl 호출");
    return testDao.getList(vo);
  }
}
