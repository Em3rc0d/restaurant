package corporate.restaurant.infraestructure.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/api/reservas/**").permitAll()  // Permite el acceso sin autenticación
                        .requestMatchers("/api/mesas/**").permitAll()  // Permite el acceso sin autenticación
                        .requestMatchers("/api/clientes/**").permitAll()  // Permite el acceso sin autenticación
                        .anyRequest().authenticated()  // El resto de las rutas requieren autenticación
                )
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
        return http.build();
    }
}