package com.in2.repository;

import com.in2.domain.Member;
import java.util.List;

public interface MemberRepositoryCustom{
  List<Member> selectAll();

  Member selectOne(Long id);

}
