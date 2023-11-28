package com.example.HolaSpring.Dao;
import com.example.HolaSpring.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioDao extends JpaRepository<Usuario, Long> {
    Usuario findByUsername(String username);
}
