package Entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Ciudadanos")
public class Ciudadano {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_CIUDADANO")
    @SequenceGenerator(name="SEQ_CIUDADANO", sequenceName = "SEQ_CIUDADANO", allocationSize = 1)
    @Column(name="cedula", nullable = false)
    private int cedula;

    @Column(name="nombre", nullable = false)
    private String nombre;

    @Column(name="apellido", nullable = false)
    private String apellido;

    @Column(name="lugarDeNacimiento", nullable = false)
    private String lugarDeNacimiento;

    @Column(name="tipoSangre", nullable = false)
    private String tipoSangre;
}
