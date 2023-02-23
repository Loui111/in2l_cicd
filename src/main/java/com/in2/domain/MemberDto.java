package com.in2.domain;

import lombok.Data;

@Data
public class MemberDto {

  private Long id;
  private String user;
  private String type;

  public MemberDto of(Member member) {
    MemberDto memberDto = new MemberDto();

    memberDto.setId(member.getId());
    memberDto.setType(member.getType());
    memberDto.setUser(member.getUser());

    return memberDto;
  }
}
