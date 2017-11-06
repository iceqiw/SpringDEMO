package org.ice.backend.bkapi.config;


import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "org.ice.backend.bkapi.dao")
@EntityScan(basePackages =" org.ice.backend.bkapi.model")
public class JpaConfig {
}
