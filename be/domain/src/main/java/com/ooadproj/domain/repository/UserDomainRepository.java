package com.ooadproj.domain.repository;

import com.ooadproj.domain.model.entity.user.UserDomainEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDomainRepository extends JpaRepository<UserDomainEntity, Long> {

}
