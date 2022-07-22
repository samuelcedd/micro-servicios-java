package co.edu.poli.vehiculos.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.poli.vehiculos.dto.VehiculoDTO;
import co.edu.poli.vehiculos.services.IVehiculoService;

@RestController
@RequestMapping("/vehiculo")
public class VehiculoRestController {
    @Autowired
    private IVehiculoService service;
    
    @GetMapping("/vehiculos")
    public List<VehiculoDTO> consultar(){
    	return service.consultar();
    }
}
