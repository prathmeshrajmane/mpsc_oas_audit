package com.vast.oasauditlog.repository;

import com.vast.oasauditlog.model.AuditLog;
import org.springframework.data.repository.CrudRepository;

public interface AuditLogRepository extends CrudRepository<AuditLog, Long> {

}
