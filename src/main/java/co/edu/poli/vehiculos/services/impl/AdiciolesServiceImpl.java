package co.edu.poli.vehiculos.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.poli.vehiculos.dto.AdicionalesDTO;
import co.edu.poli.vehiculos.entities.Adicionales;
import co.edu.poli.vehiculos.repositories.AdicionalesRepository;
import co.edu.poli.vehiculos.services.IAdicionalesService;

@Service
public class AdiciolesServiceImpl implements IAdicionalesService {
 
	@Autowired
	private AdicionalesRepository repo;
	
	@Override
	public List<AdicionalesDTO> consultar() {
		// TODO Auto-generated method stub
		List<AdicionalesDTO> lstAdicionales = new ArrayList<AdicionalesDTO>();
		AdicionalesDTO adiciones;
		List<Adicionales> lstTemp =(List<Adicionales>) repo.findAll();
		for(Adicionales A : lstTemp) {
			adiciones = new AdicionalesDTO();
			adiciones.setIdcantidad(A.getIdcantidad());
			adiciones.setLlantas(A.getLlantas());
			adiciones.setFrenos(A.getFrenos());
			adiciones.setSillas(A.getSillas());
			adiciones.setEsterio(A.getEsterio());
			
			lstAdicionales.add(adiciones);
		}
		
		return lstAdicionales;
	}

}
