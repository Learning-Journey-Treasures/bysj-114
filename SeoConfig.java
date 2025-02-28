package edu.xja.digitallibrary.core.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;


/**
 * @author 11797
 */
@Data
@Component
@ConfigurationProperties(prefix="website")
public class SeoConfig {
    private Map<String,String> page;
    public Map<String, String> getPage() {
        return page;
    }

    public void setPage(Map<String, String> page) {
        this.page = page;
    }


}
