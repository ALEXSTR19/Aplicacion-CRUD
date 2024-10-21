package modelo;

import jakarta.persistence.*;
import org.hibernate.query.Order;

@Entity
public class diaItems {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "dias_off")
    private Order order;


    // Otros atributos: product, quantity, price, etc.
}
