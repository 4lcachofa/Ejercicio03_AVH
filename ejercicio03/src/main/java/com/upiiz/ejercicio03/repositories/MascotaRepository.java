package com.upiiz.ejercicio03.repositories;

import com.upiiz.ejercicio03.models.Mascota;
import org.springframework.stereotype.Repository;

import java.util.List;

//Menu de lo que se ofrecce
@Repository

public interface MascotaRepository {
    //Regrese todas las mascotas
    public List<Mascota> findAll();

    //Regrese una mascota por id
    public Mascota obtenerMascota(int id);

    //Agregar una mascota
    public void save(Mascota mascota);

    //Eliminar una mascota
    public void delete(int id);

    //Actualizar una mascota
    public void update(Mascota mascota);

}
