package me.doyoung.alley.app.domain.accounts.infra;

import me.doyoung.alley.app.domain.accounts.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account, Long> {
    Optional<Account> findByEmail(String username);
}
