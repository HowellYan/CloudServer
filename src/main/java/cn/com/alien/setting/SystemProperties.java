package cn.com.alien.setting;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("sample")
@Data
public class SystemProperties {
    private String prop = "default value";
}
