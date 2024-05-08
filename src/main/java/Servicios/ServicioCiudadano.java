package Servicios;

import java.util.List;

import Entidades.Ciudadano;
import Operaciones.OperacionesCiudadano;
import Repositorio.RepositorioCiudadano;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public class ServicioCiudadano implements OperacionesCiudadano {

    @Autowired
    private RepositorioCiudadano repositorioCiudadano;


    @Override
    public List<Ciudadano> listarCiudadanos() {
        return repositorioCiudadano.findAll();
    }

    @Override
    public Ciudadano guardarCiudadano(Ciudadano ciudadano) {
        return repositorioCiudadano.save(ciudadano);
    }
}
