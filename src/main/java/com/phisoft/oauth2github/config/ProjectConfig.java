package com.phisoft.oauth2github.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.oauth2.client.CommonOAuth2Provider;
import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.oauth2.client.registration.InMemoryClientRegistrationRepository;

@Configuration
public class ProjectConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.oauth2Login();
              http.authorizeRequests().anyRequest().authenticated();
    }

    private ClientRegistration github(){
      return CommonOAuth2Provider.GITHUB.getBuilder("github")
                .clientId("25556085c8a14f499fb2")
                .clientSecret("45c9fa3a77a01767a4f9cb4ce9fc800ac320d309")
                .build();
    }
    @Bean
    public ClientRegistrationRepository clientRegistrationRepository(){
     return new InMemoryClientRegistrationRepository(github());

    }
}
