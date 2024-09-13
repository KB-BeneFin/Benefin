package com.kb.benefin.financeInfo.controller;

import com.kb.benefin.member.service.MemberService;
import com.kb.benefin.member.vo.MemberVo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;

@RestController

public class FinanceController {
  private final MemberService memberService;

    public FinanceController(MemberService memberService) {
        this.memberService = memberService;
    }

    @RequestMapping("/finance/list")
    public HashMap<String,Object> getList(HttpServletResponse response,MemberVo vo) {
      HashMap<String, Object> hs = new HashMap<>();
      hs.put("member",memberService.getList(vo));
      response.setStatus(200);
      response.setHeader("Authorization","bearer 123123132113");
      return hs;
    }

}
