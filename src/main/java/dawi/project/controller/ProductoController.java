package dawi.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import dawi.project.service.ProductoService;

@Controller
@RequestMapping("/almacen")
public class ProductoController {

	@Autowired
	private ProductoService serProd;

	@RequestMapping("/")
	public String index(Model model) {

		model.addAttribute("producto", serProd.listarProducto());
		return "producto";
	}

	/*@RequestMapping("/grabar")
	public String grabarModel(@RequestParam("Codigo") Integer cod, @RequestParam("Insumo") int ins,
			@RequestParam("Fecha") String fec, @RequestParam("CantSal") int cas, @RequestParam("GuiaSal") String gsa,
			@RequestParam("CantIng") int cai, @RequestParam("GuiaIng") String gin, RedirectAttributes redirect) {
		try {

			ProductoModel sm = new ProductoModel();

			sm.setCant_Salida(cas);
			sm.setGuia_Salida(gsa);
			sm.setCant_Ingreso(cai);
			sm.setGuia_Ingreso(gin);
			sm.setFecha(LocalDate.parse(fec));
			
			int mer= cai - cas;
			sm.setMerma(mer);

			TipoModel tm = new TipoModel();
			tm.setId_insumo(ins);
			sm.setTipo(tm);

			if (cod == 0) {
				serSeri.grabar(sm);
				redirect.addFlashAttribute("MENSAJE", "SERIGRAFIADO REGISTRADO");
			} else {
				sm.setId_serigrafiado(cod);
				serSeri.actualizar(sm);
				redirect.addFlashAttribute("MENSAJE", "SERIGRAFIADO ACTUALIZADO");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			redirect.addFlashAttribute("mensaje", "Error en el Registro");
			e.printStackTrace();
		}
		return "redirect:/serigrafia/";

	}
	
	@RequestMapping("/insumo")
	public String grabarInsumo(@RequestParam("Codigo") Integer cod, @RequestParam("Descripcion") String des, RedirectAttributes redirect) {
		try {
			TipoModel tm = new TipoModel();
			tm.setDescripcion(des);

			if (cod == 0) {
				serTipo.grabar(tm);
				redirect.addFlashAttribute("MENSAJE", "INSUMO REGISTRADO");
			} else {
				tm.setId_insumo(cod);
				serTipo.actualizar(tm);
				redirect.addFlashAttribute("MENSAJE", "INSUMO ACTUALIZADO");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			redirect.addFlashAttribute("mensaje", "Error en el Registro");
			e.printStackTrace();
		}
		return "redirect:/serigrafia/";

	}

	@RequestMapping("/buscar")
	@ResponseBody
	public ProductoModel buscar(@RequestParam("Codigo") int cod) {
		return serSeri.buscar(cod);
	}
	
	@RequestMapping("/eliminar")
	public String eliminar(@RequestParam("Codigo") int cod,RedirectAttributes redirect) {
		try {
			serSeri.eliminar(cod);
			redirect.addFlashAttribute("MENSAJE", "Registro eliminado correctamente");
		} catch (Exception e) {
			redirect.addFlashAttribute("MENSAJE", "Error en la eliminación de medicamento");
			e.printStackTrace();
		}
		return "redirect:/serigrafia/";
	}
	*/
}
