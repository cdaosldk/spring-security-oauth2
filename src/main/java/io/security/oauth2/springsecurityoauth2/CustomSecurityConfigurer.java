package io.security.oauth2.springsecurityoauth2;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;

public class CustomSecurityConfigurer extends AbstractHttpConfigurer<CustomSecurityConfigurer, HttpSecurity> {

    private boolean isSecured;

    @Override
    public void init(HttpSecurity builder) throws Exception {
        super.init(builder);
    }

    @Override
    public void configure(HttpSecurity builder) throws Exception {
        super.configure(builder);

        if (isSecured) {
            System.out.println("http is required");
        } else {
            System.out.println("http is not required");
        }
    }

    public CustomSecurityConfigurer setFlag(boolean isSecured) {
        this.isSecured = isSecured;
        return this;
    }
}
