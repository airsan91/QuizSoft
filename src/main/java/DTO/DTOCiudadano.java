package DTO;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor

public class DTOCiudadano {
    private String cedula;
    private String nombre;
    private String apellido;
    private String lugarDeNacimiento;
    private String tipoSangre;
}
