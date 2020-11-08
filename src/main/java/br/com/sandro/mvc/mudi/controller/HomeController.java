package br.com.sandro.mvc.mudi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.sandro.mvc.mudi.model.Pedido;

@Controller
public class HomeController {

	@GetMapping("/home")
	public String home(Model model) {
		Pedido pedido = new Pedido();
		pedido.setNomeProduto("Celular Xiaomi Redmi 9 64GB");
		pedido.setUrlImagem("https://images-na.ssl-images-amazon.com/images/I/6147ZT4PeFL._AC_SL1000_.jpg");
		pedido.setUrlProduto("https://www.amazon.com.br/Celular-Xiaomi-Redmi-64GB-Dual/dp/B08B3VCF9G/ref=sr_1_1?__mk_pt_BR=%C3%85M%C3%85%C5%BD%C3%95%C3%91&crid=2V7TXU9LUV3SI&dchild=1&keywords=celular+xiaomi&qid=1604851903&sprefix=celuar%2Caps%2C272&sr=8-1");
		pedido.setDescricao("Smartphone Xioami Redmi 9\r\n" + 
				"4GB RAM e 64GB de memória interna - memória expansível (MicroSD) até 512GB.");
		
		List<Pedido> pedidos = Arrays.asList(pedido);
		model.addAttribute("pedidos", pedidos);
		
		return "home";
		
		
	}

}
