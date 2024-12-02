package ifrn.pi.darlingBeauty.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/")
	public String index() {
		System.out.println("Chamou o método index");
		return "home";
	}
	
	@RequestMapping("/darlingBeauty/servicos")
	public String servicos() {
		return "servicos";
	}
	
	@RequestMapping("/darlingBeuty/agendar-servico")
	public String agendamentos() {
		return "agendamento";
	}
}
