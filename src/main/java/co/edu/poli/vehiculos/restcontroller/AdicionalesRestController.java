package co.edu.poli.vehiculos.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.poli.vehiculos.dto.AdicionalesDTO;
import co.edu.poli.vehiculos.services.IAdicionalesService;

@RestController
@RequestMapping("/Adicionales")
public class AdicionalesRestController {
	@Autowired
	private IAdicionalesService service;
	
	@GetMapping("/Adicionales")
	public List<AdicionalesDTO> consultar(){
		return service.consultar();
	}

}
