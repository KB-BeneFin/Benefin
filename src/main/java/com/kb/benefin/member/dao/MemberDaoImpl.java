package com.kb.benefin.member.dao;


import java.util.List;

import com.kb.benefin.member.vo.MemberVo;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository("memberDao")
public class MemberDaoImpl implements MemberDao {

  @Autowired
  SqlSessionTemplate sm;

  @Override
  public List<MemberVo> getList(MemberVo vo) {
    System.out.println("MemberDaoImpl 호출");
    return sm.selectList("Member.getList");
  }
}
