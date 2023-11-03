package com.sagitta.apigateway.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.Optional;

@Repository
public interface AccessTokenRepository extends JpaRepository<AccessToken, String> {
    Optional<AccessToken> findByToken(String jwt);
}
