package com.kb.benefin.notice.dao;

import com.kb.benefin.notice.vo.NoticeVo;

import java.util.List;

public interface NoticeDao {
  public List<NoticeVo> getList(NoticeVo vo);
}
