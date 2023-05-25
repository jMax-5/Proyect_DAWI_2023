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
@Table(name = "marca")
public class MarcaModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idmarca;
	
	private String descripcion;
	
	@JsonIgnore
	@OneToMany(mappedBy = "marc")
	private List<ProductoModel> listaMarca;


	public List<ProductoModel> getListaMarca() {
		return listaMarca;
	}

	public void setListaMarca(List<ProductoModel> listaMarca) {
		this.listaMarca = listaMarca;
	}

	public int getIdmarca() {
		return idmarca;
	}

	public void setIdmarca(int idmarca) {
		this.idmarca = idmarca;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	
	
}
