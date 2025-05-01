package ru.youdzhin.services;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface UserDetailsService {

    /*
    Чтобы настроить хранилище учетных записей пользователей
    для их аутентификации, нам понадобится bean-компонент UserDetailsService.
    Интерфейс UserDetailsService относительно прост и имеет всего один метод,
    который нужно реализовать. Вот как выглядит UserDetailsService:
    */

    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;

}
