package me.ggulmool.jpatest.domain.support;

import me.ggulmool.jpatest.domain.MemGroup;
import me.ggulmool.jpatest.domain.GroupPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GroupRepository extends JpaRepository<MemGroup, GroupPK> {

    @Query(value = "select * from mem_group WHERE user_no = ?1 AND trsf_Id < ?2 ORDER BY trsf_Id LIMIT 10", nativeQuery = true)
    List<MemGroup> findMemGroupsByUserNoAndTrsfIdIsLessThanOrderByTrsfId(String userNo, Long trsfId);
}
