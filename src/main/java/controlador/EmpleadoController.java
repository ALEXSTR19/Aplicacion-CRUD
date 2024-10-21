package controlador;

import modelo.Empleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/archivo")
public class EmpleadoController {
    @Autowired
    private EmpleadoService empleadoService;

    GetMapping
    public List<Empleado> getEmpleados(){
        return empleadoService.getEmpleados();
    }
}
