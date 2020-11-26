package com.mmlshare.auth;

import com.mmlshare.auth.handler.UrlAuthenticationFailHandler;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;

import javax.annotation.Resource;

@Configuration
@EnableJpaRepositories
@EntityScan("${entityScan:com.mmlshare}")
public class AuthConfig extends WebSecurityConfigurerAdapter {
    @Resource
    private UserDetailsService authUserDetailService;

    @Resource
    private PersistentTokenRepository authPersistentRememberMeTokenService;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(authUserDetailService).passwordEncoder(new PasswordEncoder() {
            @Override
            public String encode(CharSequence charSequence) {
                return charSequence.toString();
            }

            @Override
            public boolean matches(CharSequence charSequence, String s) {
                return s.equals(charSequence.toString());
            }
        });
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.logout().permitAll().and()
                .formLogin().loginPage("/loginPage").loginProcessingUrl("/login").passwordParameter("password").usernameParameter("username")
                .failureHandler(new UrlAuthenticationFailHandler()).and()
                .rememberMe().tokenRepository(authPersistentRememberMeTokenService)
                // 有效时间：单位s
                .tokenValiditySeconds(6000)
                .userDetailsService(authUserDetailService).and()
                .authorizeRequests()
                // 如果有允许匿名的url，填在下面
                .antMatchers("/loginPage", "/register").permitAll()
                .anyRequest().authenticated();

        // 关闭CSRF跨域

        http.csrf().disable();


    }


}
