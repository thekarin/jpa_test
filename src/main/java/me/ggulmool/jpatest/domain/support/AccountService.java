package me.ggulmool.jpatest.domain.support;

import lombok.extern.slf4j.Slf4j;
import me.ggulmool.jpatest.domain.MemGroup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private GroupRepository groupRepository;

    public void list() {
        List<MemGroup> memGroupsByUserNoAndTrsfIdIsLessThanOrderByTrsfId = groupRepository.findMemGroupsByUserNoAndTrsfIdIsLessThanOrderByTrsfId("001", 5L);
        log.info("{}", memGroupsByUserNoAndTrsfIdIsLessThanOrderByTrsfId.size());
    }
}
