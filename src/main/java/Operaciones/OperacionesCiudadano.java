package Operaciones;
//import com.example.QuizSoft.Entidades.Ciudadano;

import Entidades.Ciudadano;

import java.util.List;


public interface OperacionesCiudadano {
    public List<Ciudadano> listarCiudadanos();

    public Ciudadano guardarCiudadano(Ciudadano ciudadano);
}
