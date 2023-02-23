package com.in2.repository;

import com.in2.domain.Member;

/**
 * 당장 backend빌드, gitaction, CI/CD를 테스트 하려는거라
 * DB는 나중에 추가할예정... (귀찮)
 */
public class MemberGenerator {

  public Member getMember1() {
    Member member1 = new Member();
    member1.setId(1L);
    member1.setUser("고냥인");
    member1.setType("Default");

    return member1;
  }

  public Member getMember2() {
    Member member2 = new Member();
    member2.setId(2L);
    member2.setUser("고냥인2");
    member2.setType("Male");

    return member2;
  }

  public Member getMember3() {
    Member member3 = new Member();
    member3.setId(3L);
    member3.setUser("고냥인3");
    member3.setType("UnKonwn");

    return member3;
  }
}
