package com.example.HolaSpring.domain;
import lombok.Data;
import javax.persistence.*;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Entity
@Data
@Table(name = "rol")
public class Rol implements Serializable {
    public static final long serialVersionUTD = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRol;

    @NotEmpty
    private String nombre;
}
