package com.in2.controller;

import com.in2.domain.Member;
import com.in2.domain.MemberDto;
//import com.in2.repository.MemberRepository;
import com.in2.repository.MemberGenerator;
import java.util.ArrayList;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class MemberController {

//  private final MemberRepository memberRepository;

  @GetMapping("/")
  public String version() { //걍 healthcheck. 별 의미 없음.
    return String.format("Project Version : %s", "0.0.6");
  }

  @GetMapping("/memberAll")
  List<Member> getAllMember() {
//    return memberRepository.selectAll();
    MemberGenerator memberGenerator = new MemberGenerator();

    //TODO: 귀찮아서 DB접속 안하고 그냥 여기서 만듬.
    ArrayList<Member> memberArrayList = new ArrayList();
    memberArrayList.add(memberGenerator.getMember1());
    memberArrayList.add(memberGenerator.getMember2());
    memberArrayList.add(memberGenerator.getMember3());

    log.info("/memberAll:: "+memberArrayList.toString());
    
    return memberArrayList;
  }

  @GetMapping("/member")
  MemberDto getMember( @RequestParam("id") Long id){  //TODO validation?
    MemberDto memberDto = new MemberDto();
    Member member = selectOne(id);

    MemberDto memberDto1 = memberDto.of(member);
    log.info("/member:: "+memberDto1.toString());

    return memberDto1;
  }

  //TODO: mysql이 연결되면 없어져야함. 그냥 더미서버.
  private Member selectOne(Long id) {
    MemberGenerator memberGenerator = new MemberGenerator();
    Member resultMember = new Member();

    //TODO: 귀찮아서 DB접속 안하고 그냥 여기서 만듬.
    ArrayList<Member> memberArrayList = new ArrayList<Member>();
    memberArrayList.add(memberGenerator.getMember1());
    memberArrayList.add(memberGenerator.getMember2());
    memberArrayList.add(memberGenerator.getMember3());

    if (id == 2){
      resultMember = memberGenerator.getMember2();
    } else if (id == 3) {
      resultMember = memberGenerator.getMember3();
    }
    else{
      resultMember = memberGenerator.getMember1();
    }

    return resultMember;

  }
}
