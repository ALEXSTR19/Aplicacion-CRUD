package repositorio;

import modelo.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRepositorio  extends JpaRepository<Empleado, Long> {
}
