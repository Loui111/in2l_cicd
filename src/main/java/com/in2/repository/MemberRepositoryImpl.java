package com.in2.repository;

import com.in2.domain.Member;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MemberRepositoryImpl implements MemberRepositoryCustom {

  private final EntityManager entityManager;

  @Override
  public List<Member> selectAll(){

    MemberGenerator memberGenerator = new MemberGenerator();

    //TODO: 귀찮아서 DB접속 안하고 그냥 여기서 만듬.
    ArrayList<Member> memberArrayList = new ArrayList<Member>();
    memberArrayList.add(memberGenerator.getMember1());
    memberArrayList.add(memberGenerator.getMember2());
    memberArrayList.add(memberGenerator.getMember3());

    return memberArrayList;
  }

  @Override
  public Member selectOne(Long id){

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

    return resultMember;    //TODO: null
  }


}
