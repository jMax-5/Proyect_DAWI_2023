package dawi.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dawi.project.dao.TipoDAO;
import dawi.project.entity.TipoModel;

@Service
public class TipoService {
	
	@Autowired
	private TipoDAO repo;
	
	
	public void grabar(TipoModel m) {
		repo.save(m);
	}
	
	public List<TipoModel> listarTipo(){
		return repo.findAll();
	}
	
	public void actualizar(TipoModel m) {
		repo.save(m);
	}
	
	public void eliminar(int cod) {
		repo.deleteById(cod);
	}
	
	public TipoModel buscar(int cod) {
		return repo.findById(cod).orElse(null);
	}
	
}
