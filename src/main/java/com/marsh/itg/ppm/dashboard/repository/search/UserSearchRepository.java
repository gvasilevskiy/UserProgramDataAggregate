package com.marsh.itg.ppm.dashboard.repository.search;

import com.marsh.itg.ppm.dashboard.domain.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the User entity.
 */
public interface UserSearchRepository extends ElasticsearchRepository<User, String> {}
