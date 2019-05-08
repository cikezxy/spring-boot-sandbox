package com.cikezxy.springbootsandbox.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "my.secret")
@Component
public class MyConfiguration {

    private String password;
    private int intValue;
    private int intValueRange;
    private long longValue;
    private long longValueRange;
    private String uuid;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getIntValue() {
        return intValue;
    }

    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }

    public int getIntValueRange() {
        return intValueRange;
    }

    public void setIntValueRange(int intValueRange) {
        this.intValueRange = intValueRange;
    }

    public long getLongValue() {
        return longValue;
    }

    public void setLongValue(long longValue) {
        this.longValue = longValue;
    }

    public long getLongValueRange() {
        return longValueRange;
    }

    public void setLongValueRange(long longValueRange) {
        this.longValueRange = longValueRange;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Override
    public String toString() {
        return "MyConfiguration{" +
                "password='" + password + '\'' +
                ", intValue=" + intValue +
                ", intValueRange=" + intValueRange +
                ", longValue=" + longValue +
                ", longValueRange=" + longValueRange +
                ", uuid='" + uuid + '\'' +
                '}';
    }
}
