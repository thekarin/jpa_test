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
@IdClass(GroupPK.class)
public class MemGroup {

    @Id
    private String userNo;

    @Id
    private Long trsfId;

    private String name;
}
