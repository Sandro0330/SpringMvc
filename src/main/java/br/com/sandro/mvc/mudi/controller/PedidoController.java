package br.com.sandro.mvc.mudi.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.sandro.mvc.mudi.dto.RequesicaoNovoPedido;
import br.com.sandro.mvc.mudi.model.Pedido;
import br.com.sandro.mvc.mudi.repository.PedidoRepository;

@Controller
@RequestMapping("pedido")
public class PedidoController {
	
	@Autowired
	private PedidoRepository pedidoRepository;

	@GetMapping("formulario")
	public String formulario() {
		return "pedido/formulario";
	}
	
	@PostMapping("novo") 
	public String novo(@Valid RequesicaoNovoPedido requisicao, BindingResult result) {
		if(result.hasErrors()) {
			return "pedido/formulario";   
		}
		
		Pedido pedido = requisicao.toPedido();
		pedidoRepository.save(pedido); 
		
		return "pedido/formulario";
	}
	
}
