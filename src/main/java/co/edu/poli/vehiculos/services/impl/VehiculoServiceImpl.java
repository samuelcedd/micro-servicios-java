package co.edu.poli.vehiculos.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.poli.vehiculos.dto.VehiculoDTO;
import co.edu.poli.vehiculos.entities.Vehiculo;
import co.edu.poli.vehiculos.repositories.VehiculoRepository;
import co.edu.poli.vehiculos.services.IVehiculoService;

@Service
public class VehiculoServiceImpl implements IVehiculoService {

	@Autowired
	private VehiculoRepository repo;
	@Override
	public List<VehiculoDTO> consultar() {
		// TODO Auto-generated method stub
		List<VehiculoDTO> lstVehiculos = new ArrayList<>();
		VehiculoDTO vehiculo;
		List<Vehiculo> lstTemp = (List<Vehiculo>)repo.findAll();
		for (Vehiculo v : lstTemp) {
			vehiculo = new VehiculoDTO();
			vehiculo.setPlaca(v.getPlaca());
			vehiculo.setMarca(v.getMarca());
			vehiculo.setModelo(v.getModelo());
			vehiculo.setCilindraje(v.getCilindraje());
			
			lstVehiculos.add(vehiculo);
		}
		
		return lstVehiculos;
	}

}
