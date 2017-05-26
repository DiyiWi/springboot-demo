package com.wangdiyi.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by uas on 2017/5/24.
 */
@Component
@ConfigurationProperties(prefix = "girl")
public class GirlProperties {
    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    private String cupSize;
    private Integer age;
}
