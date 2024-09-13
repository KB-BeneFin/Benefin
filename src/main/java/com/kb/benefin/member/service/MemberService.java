package com.kb.benefin.member.service;

import com.kb.benefin.member.vo.MemberVo;

import java.util.List;

public interface MemberService {
  List<MemberVo> getList(MemberVo vo);
}
