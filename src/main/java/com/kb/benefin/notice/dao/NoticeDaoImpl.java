package com.kb.benefin.notice.dao;


import com.kb.benefin.notice.vo.NoticeVo;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository("noticeDao")
public class NoticeDaoImpl implements NoticeDao {

  @Autowired
  SqlSessionTemplate sm;

  @Override
  public List<NoticeVo> getList(NoticeVo vo) {
    System.out.println("NoticeDaoImpl 호출");
    return sm.selectList("Notice.getList");
  }
}
