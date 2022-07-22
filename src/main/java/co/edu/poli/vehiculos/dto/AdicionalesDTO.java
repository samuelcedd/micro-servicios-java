package co.edu.poli.vehiculos.dto;

public class AdicionalesDTO {
	private Integer Idcantidad;
    private String llantas;
    private String frenos;
    private String sillas;
    private String esterio;
    
    public AdicionalesDTO() {}

	public Integer getIdcantidad() {
		return Idcantidad;
	}

	public void setIdcantidad(Integer idcantidad) {
		Idcantidad = idcantidad;
	}

	public String getLlantas() {
		return llantas;
	}

	public void setLlantas(String llantas) {
		this.llantas = llantas;
	}

	public String getFrenos() {
		return frenos;
	}

	public void setFrenos(String frenos) {
		this.frenos = frenos;
	}

	public String getSillas() {
		return sillas;
	}

	public void setSillas(String sillas) {
		this.sillas = sillas;
	}

	public String getEsterio() {
		return esterio;
	}

	public void setEsterio(String esterio) {
		this.esterio = esterio;
	}
    
    
}
