package com.example.HolaSpring.domain;
import lombok.Data;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@Table(name = "usuario")
public class Usuario implements Serializable {
    public static final long serialVersionUTD = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;

    @NotEmpty
    private String username;

    @NotEmpty
    private String password;

    @OneToMany
    @JoinColumn(name = "id_usuario")
    private List<Rol> roles;
 }
