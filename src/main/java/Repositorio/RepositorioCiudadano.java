package Repositorio;

import Entidades.Ciudadano;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioCiudadano extends JpaRepository<Ciudadano, Integer> {

}
