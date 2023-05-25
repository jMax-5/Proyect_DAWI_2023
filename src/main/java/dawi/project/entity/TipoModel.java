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
@Table(name = "tipo")
public class TipoModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idtipo;
	private String descripcion;
	
	@JsonIgnore
	@OneToMany(mappedBy = "tipo")
	private List<ProductoModel> listaTipo;
	
	
	public List<ProductoModel> getListaTipo() {
		return listaTipo;
	}
	public void setListaTipo(List<ProductoModel> listaTipo) {
		this.listaTipo = listaTipo;
	}
	public int getIdtipo() {
		return idtipo;
	}
	public void setIdtipo(int idtipo) {
		this.idtipo = idtipo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	
}
