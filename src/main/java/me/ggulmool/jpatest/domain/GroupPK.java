package me.ggulmool.jpatest.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class GroupPK implements Serializable {

    private String userNo;

    private Long trsfId;
}
