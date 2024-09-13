package com.kb.benefin.member.dao;

import com.kb.benefin.member.vo.MemberVo;

import java.util.List;

public interface MemberDao {
  public List<MemberVo> getList(MemberVo vo);
}
