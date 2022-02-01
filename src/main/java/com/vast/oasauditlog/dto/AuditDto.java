package com.vast.oasauditlog.dto;

public class AuditDto {
    private String userId;
    private String ipAddress;
    private String tableName;
    private String data;
    private String action;

    public AuditDto(String userId, String ipAddress, String tableName, String data, String action) {
        this.userId = userId;
        this.ipAddress = ipAddress;
        this.tableName = tableName;
        this.data = data;
        this.action = action;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
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
