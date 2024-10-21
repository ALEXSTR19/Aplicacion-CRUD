package modelo;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "dias_off")
public class Dias {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
//esta es una columna de la base de datos
    @Column(name = "tipo_dia", length = 60, nullable = false)
    //variable string tipoD significa tipo de dia
    private String tipoD;
//columna de base de datos
    @Column(name = "fecha", length = 60, nullable = false)
    //variable String fechaO singnifica fecha off, es decir, fecha que se va el empleado
    private String fechaO;
// relacion uno a muchos
    @OneToMany(mappedBy = "dia")
    public List<Dias> diaItems;

}