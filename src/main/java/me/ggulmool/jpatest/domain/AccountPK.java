package me.ggulmool.jpatest.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class AccountPK implements Serializable {

    private String userNo;

    private Long trsfId;

    private Long seq;
}
