package dawi.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import dawi.project.service.ProductoService;

@Controller
//ruta o url para acceder a la clase controlador desde la vista
@RequestMapping("/almacen")
public class ProductoController {


	@Autowired
	private ProductoService servProd;
	
	@RequestMapping("/lista")
	public String index(Model model) {
		//crear un atributo
		model.addAttribute("producto",servProd.listarTodos());
		return "producto";
	}
	
	
	@RequestMapping("/registrar")
	public String registrar() {
		return "";
	}
	
}
