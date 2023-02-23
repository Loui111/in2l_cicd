package com.in2.controller;

import com.in2.domain.Member;
import com.in2.domain.MemberDto;
import com.in2.repository.MemberRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MemberController {

  private final MemberRepository memberRepository;

  @GetMapping("/memberAll")
  List<Member> getAllMember() {
    return memberRepository.selectAll();
  }

  @GetMapping("/member")
  MemberDto getMember( @RequestParam("id") Long id){  //TODO validation?
    MemberDto memberDto = new MemberDto();
    Member member = memberRepository.selectOne(id);

    return memberDto.of(member);
  }

  //TODO: DELETE
}
