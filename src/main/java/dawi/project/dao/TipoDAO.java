package dawi.project.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import dawi.project.entity.TipoModel;

public interface TipoDAO extends JpaRepository<TipoModel, Integer> {
	

}
