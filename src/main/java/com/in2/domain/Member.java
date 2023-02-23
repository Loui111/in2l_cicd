package com.in2.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Member {

  @Id
  @GeneratedValue
  private Long id;
  private String user;
  private String type;
}
