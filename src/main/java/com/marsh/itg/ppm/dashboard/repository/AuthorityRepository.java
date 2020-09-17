package com.marsh.itg.ppm.dashboard.repository;

import com.marsh.itg.ppm.dashboard.domain.Authority;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Spring Data MongoDB repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends MongoRepository<Authority, String> {}
