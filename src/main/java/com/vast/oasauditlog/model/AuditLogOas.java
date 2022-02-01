package com.vast.oasauditlog.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "audit_log_oas")
public class AuditLogOas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "user_oas_id")
    private String userOasId;
    @Column(name = "ip_address")
    private String ipAddress;
    @Column(name = "created_at")
    private Date createdAt;
    @Column(name = "table_name")
    private String tableName;
    private String data;
    private String action;

    public String getUserOasId() {
        return userOasId;
    }

    public void setUserOasId(String userOasId) {
        this.userOasId = userOasId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}