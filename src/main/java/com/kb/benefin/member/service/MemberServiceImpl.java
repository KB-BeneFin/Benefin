package com.kb.benefin.member.service;

import java.util.List;

import com.kb.benefin.member.dao.MemberDao;
import com.kb.benefin.member.vo.MemberVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("memberService")
public class MemberServiceImpl implements MemberService {
  //@Ressource(name="memberDao")
  @Autowired
  private MemberDao memberDao;

  public List<MemberVo> getList(MemberVo vo) {
    System.out.println("MemberServiceImpl호출");
    return memberDao.getList(vo);
  }
}
