package com.kb.benefin.test.dao;


import com.kb.benefin.test.vo.TestVo;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository("testDao")
public class TestDaoImpl implements TestDao {

  @Autowired
  SqlSessionTemplate sm;

  @Override
  public List<TestVo> getList(TestVo vo) {
    System.out.println("TestDaoImpl 호출");
    return sm.selectList("Test.getList");
  }
}
