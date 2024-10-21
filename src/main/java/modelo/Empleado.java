package modelo;

import jakarta.persistence.*;

@Entity
@Table(name="empleados")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", length = 60, nullable = false)
    private String nombre;

    @Column(name = "ap_paterno", length = 60, nullable = false)
    private String apellido_pat;
}
