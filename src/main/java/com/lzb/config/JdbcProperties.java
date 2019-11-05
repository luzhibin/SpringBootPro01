package com.lzb.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by luzhibin on 2019/11/5 0:18
 */
/*@Component
@ConfigurationProperties(prefix = "jdbc")*/
@Data
public class JdbcProperties {

    private String url;

    private String driver;

    private String username;

    private String password;


}
