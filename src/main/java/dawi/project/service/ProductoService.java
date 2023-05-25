package dawi.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dawi.project.dao.ProductoRepository;
import dawi.project.entity.ProductoModel;

@Service
public class ProductoService {

	@Autowired
	private ProductoRepository repo;
	
	public void registrar(ProductoModel m) {
		repo.save(m);
	}
	public void actualizar(ProductoModel m) {
		repo.save(m);
	}
	public void eliminarPorID(Integer cod) {
		repo.deleteById(cod);
	}
	public ProductoModel buscarPorID(Integer cod) {
		return repo.findById(cod).orElse(null);
	}
	public List<ProductoModel> listarTodos(){
		return repo.findAll();
	}
	
}
