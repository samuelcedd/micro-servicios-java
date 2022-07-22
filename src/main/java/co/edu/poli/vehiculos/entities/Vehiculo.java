package co.edu.poli.vehiculos.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Vehiculo {
	@Id
     private String placa;
     private String marca;
     private Integer modelo;
     private Integer cilindraje;
     
     public Vehiculo() {}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Integer getModelo() {
		return modelo;
	}

	public void setModelo(Integer modelo) {
		this.modelo = modelo;
	}

	public Integer getCilindraje() {
		return cilindraje;
	}

	public void setCilindraje(Integer cilindraje) {
		this.cilindraje = cilindraje;
	}
     
     
}
