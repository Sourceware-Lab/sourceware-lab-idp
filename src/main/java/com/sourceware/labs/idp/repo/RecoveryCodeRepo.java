package com.sourceware.labs.idp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sourceware.labs.idp.entity.RecoveryCode;

public interface RecoveryCodeRepo extends JpaRepository<RecoveryCode, Long>{

}