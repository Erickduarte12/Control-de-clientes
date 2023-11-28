package com.example.HolaSpring.Servicio;

import com.example.HolaSpring.domain.Persona;

import java.util.List;

public interface PersonaService {
    public List<Persona> listarPersonas();
    public void guardar(Persona persona);
    public void eliminar(Persona persona);
    public Persona encontarPersona(Persona persona);

}
