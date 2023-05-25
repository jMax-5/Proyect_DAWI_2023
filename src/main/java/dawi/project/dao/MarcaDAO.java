package dawi.project.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import dawi.project.entity.MarcaModel;

public interface MarcaDAO extends JpaRepository<MarcaModel, Integer> {
	

}
