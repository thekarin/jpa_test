package me.ggulmool.jpatest.domain.support;

import me.ggulmool.jpatest.domain.Account;
import me.ggulmool.jpatest.domain.AccountPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, AccountPK> {
}
