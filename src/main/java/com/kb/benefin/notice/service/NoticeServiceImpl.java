package com.kb.benefin.notice.service;

import com.kb.benefin.notice.dao.NoticeDao;
import com.kb.benefin.notice.vo.NoticeVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("noticeService")
public class NoticeServiceImpl implements NoticeService {
  //@Ressource(name="memberDao")
  @Autowired
  private NoticeDao noticeDao;

  public List<NoticeVo> getList(NoticeVo vo) {
    System.out.println("NoticeServiceImpl 호출");
    return noticeDao.getList(vo);
  }
}
