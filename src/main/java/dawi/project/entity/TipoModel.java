package dawi.project.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="tipo")
public class TipoModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idtipo;
	private String descripcion;
	
	@OneToMany(mappedBy = "tipo")
	@JsonIgnore
	private List<ProductoModel> tblistatipo;

	public Integer getIdtipo() {
		return idtipo;
	}

	public void setIdtipo(Integer idtipo) {
		this.idtipo = idtipo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<ProductoModel> getTblistatipo() {
		return tblistatipo;
	}

	public void setTblistatipo(List<ProductoModel> tblistatipo) {
		this.tblistatipo = tblistatipo;
	}

	
}
