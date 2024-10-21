package Services;

import modelo.Empleado;
import org.springframework.beans.factory.annotation.Autowired;
import repositorio.EmpleadoRepositorio;

import java.util.List;

public class EmpleadoService {
    @Autowired
    private EmpleadoRepositorio empleadoRepositorio;

    private List<Empleado>
    getEmpleados()
    {
        return empleadoRepositorio.findAll();

    }
}
