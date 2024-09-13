package com.kb.benefin.notice.service;

import com.kb.benefin.notice.vo.NoticeVo;

import java.util.List;

public interface NoticeService {
  List<NoticeVo> getList(NoticeVo vo);
}
