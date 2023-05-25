package dawi.project.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import dawi.project.entity.ProductoModel;

public interface ProductoDAO extends JpaRepository<ProductoModel, Integer> {


}
