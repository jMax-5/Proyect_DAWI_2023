package dawi.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dawi.project.dao.TipoRepository;
import dawi.project.entity.TipoModel;

@Service
public class TipoService {

	@Autowired
	private TipoRepository repo;
	
	public List<TipoModel> listarTodos(){
		return repo.findAll();
	}
	
}
