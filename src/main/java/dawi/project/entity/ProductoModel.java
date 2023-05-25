package dawi.project.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "producto")
public class ProductoModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idproducto;
	private String descripcion;
	private LocalDate fechaVencimiento;
	private int stockMinimo;
	private int stockActual;

	@ManyToOne
	@JoinColumn(name = "idtipo")
	private TipoModel tipo;
	
	@ManyToOne
	@JoinColumn(name = "idmarca")
	private MarcaModel marc;

	public int getIdproducto() {
		return idproducto;
	}

	public void setIdproducto(int idproducto) {
		this.idproducto = idproducto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public LocalDate getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(LocalDate fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public int getStockMinimo() {
		return stockMinimo;
	}

	public void setStockMinimo(int stockMinimo) {
		this.stockMinimo = stockMinimo;
	}

	public int getStockActual() {
		return stockActual;
	}

	public void setStockActual(int stockActual) {
		this.stockActual = stockActual;
	}

	public TipoModel getTipo() {
		return tipo;
	}

	public void setTipo(TipoModel tipo) {
		this.tipo = tipo;
	}

	public MarcaModel getMarc() {
		return marc;
	}

	public void setMarc(MarcaModel marc) {
		this.marc = marc;
	}
	
	

}
