package com.upiiz.ejercicio03.services;

//Extends - Herencia: Heredar las propiedades de otra clase


//Implements - Usar o implementar los metodos de otra clase

import com.upiiz.ejercicio03.models.Mascota;
import com.upiiz.ejercicio03.repositories.MascotaRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class MascotaService implements MascotaRepository {

    //Requerimos
    //1.- Acceso a una base de datos - Aun no
    //2.- Acceso a un listado de MEMORIA - Este sí

    private List<Mascota> mascotas;
    private int lastId = 0;
    public MascotaService() {
        //Evitar en NULL pointer Excception
        mascotas = new ArrayList<>();
        mascotas.add(new Mascota(1, "Pluto", "Mascota Mick", 5));
        mascotas.add(new Mascota(2, "Firulais", "Un perro muy noble", 8));
        lastId = 2;
    }



    @Override
    public List<Mascota> findAll() {
        return List.copyOf(mascotas);
    }

    @Override
    public Mascota obtenerMascota(int id) {
        return null;
    }

    @Override
    public void save(Mascota mascota) {
        lastId++;
        mascota.setId(lastId);
        mascotas.add(mascota);
    }

    @Override
    public void delete(int id) {
        mascotas.removeIf(m -> m.getId() == id);
    }

    @Override
    public void update(Mascota mascota) {
        Objects.requireNonNull(mascota,"Mascota no puede ser nula");
        boolean existe = mascotas.stream().anyMatch(m -> m.getId() == mascota.getId());
        if (!existe) {
            throw new IllegalArgumentException("Mascota ya existe");
        }else{
            mascotas.replaceAll(actual ->
                    actual.getId() == mascota.getId() ? merge(actual, mascota) : actual
            );
        }
    }

    private Mascota merge(Mascota anterior, Mascota nuevo){
        return nuevo;
    }

    public Mascota getMascota(int id) {
        return mascotas.stream()
                .filter(mascota -> mascota.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
