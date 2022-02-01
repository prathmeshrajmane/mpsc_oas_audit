package com.vast.oasauditlog.service;

import com.vast.oasauditlog.dto.AuditDto;
import com.vast.oasauditlog.model.AuditLog;
import com.vast.oasauditlog.model.AuditLogOas;
import com.vast.oasauditlog.repository.AuditLogOasRepository;
import com.vast.oasauditlog.repository.AuditLogRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;


@Service
public class AuditService {

    @Autowired
    AuditLogOasRepository auditLogOasRepository;

    @Autowired
    AuditLogRepository auditLogRepository;

    public void saveAuditLogCandidate(AuditDto auditDto) {
        AuditLog auditLog = new AuditLog();
        BeanUtils.copyProperties(auditDto, auditLog);
        auditLog.setCreatedAt(new Date());
        auditLogRepository.save(auditLog);
    }

    public void saveAuditLogAdmin(AuditDto auditDto) {
        AuditLogOas auditLogOas = new AuditLogOas();
        BeanUtils.copyProperties(auditDto, auditLogOas, "userId");
        auditLogOas.setUserOasId(auditDto.getUserId());
        auditLogOas.setCreatedAt(new Date());
        auditLogOasRepository.save(auditLogOas);
    }
}
