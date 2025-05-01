package ru.youdzhin.security_configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder; import org.springframework.security.crypto.password.PasswordEncoder;
@Configuration
public class SecurityConfig {

    /*
    Класс объявляет bean-компонент PasswordEncoder,
    который мы будем использовать при создании новых пользователей
    и при аутентификации. В данном случае класс использует BCryptPasswordEncoder,
    один из нескольких средств шифрования паролей, имеющихся в составе Spring Security.
    */

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }


}