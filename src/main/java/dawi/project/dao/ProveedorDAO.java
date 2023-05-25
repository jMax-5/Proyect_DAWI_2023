package dawi.project.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import dawi.project.entity.ProveedorModel;

public interface ProveedorDAO extends JpaRepository<ProveedorModel, Integer> {
	

}
