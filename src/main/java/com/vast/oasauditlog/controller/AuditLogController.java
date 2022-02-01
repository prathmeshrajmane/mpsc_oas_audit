package com.vast.oasauditlog.controller;

import com.vast.oasauditlog.dto.AuditDto;
import com.vast.oasauditlog.service.AuditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.naming.AuthenticationException;


@RestController
@RequestMapping(path = "/audit/api/v1")
public class AuditLogController {

    @Autowired
    AuditService auditService;

    @Value("${api.key}")
    private String API_KEY;

    @PostMapping(path = "/candidate")
    public void saveAuditLogCandidate(@RequestBody AuditDto auditDto, @RequestHeader(name = "x-api-key", defaultValue = "") String apiKey) throws AuthenticationException {
        if (!apiKey.equals(API_KEY)) {
            throw new AuthenticationException("Invalid API Key");
        }
        auditService.saveAuditLogCandidate(auditDto);
    }

    @PostMapping(path = "/admin")
    public void saveAuditLogAdmin(@RequestBody AuditDto auditDto, @RequestHeader(name = "x-api-key", defaultValue = "") String apiKey) throws AuthenticationException {
        if (!apiKey.equals(API_KEY)) {
            throw new AuthenticationException("Invalid API Key");
        }
        auditService.saveAuditLogAdmin(auditDto);
    }


}
