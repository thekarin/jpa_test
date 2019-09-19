package me.ggulmool.jpatest.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@IdClass(AccountPK.class)
public class Account {

    @Id
    private String userNo;

    @Id
    private Long trsfId;

    @Id
    private Long seq;

    private String name;

}
