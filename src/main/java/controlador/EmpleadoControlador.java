package controlador;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import modelo.Empleado;

import repositorio.EmpleadoRepositorio;

@RestController
@RequestMapping("/api/v1")
public class EmpleadoControlador {

	@Autowired
	private EmpleadoRepositorio repositorio;

	@GetMapping("/empleados")
	public List<Empleado> listartodoslosempleados() {
		return repositorio.findAll();
	}
}
