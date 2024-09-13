package com.kb.benefin.member.controller;

import com.kb.benefin.member.service.MemberService;
import com.kb.benefin.member.vo.MemberVo;
import java.util.HashMap;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MemberController {
  private final MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @RequestMapping("/member/list")
    public HashMap<String,Object> getList(HttpServletResponse response,MemberVo vo) {
      HashMap<String, Object> hs = new HashMap<>();
      hs.put("member",memberService.getList(vo));
      response.setStatus(200);
      response.setHeader("Authorization","bearer 123123132113");
      return hs;
    }

}
