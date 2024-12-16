package ifrn.pi.darlingBeauty.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ifrn.pi.darlingBeauty.models.Usuarios;
import ifrn.pi.darlingBeauty.repositories.UsuariosRepository;

@Controller
@RequestMapping("/darlingBeauty")

public class DarlingBeautyController {
	
	@Autowired
	private UsuariosRepository ur;
	
		
	@GetMapping("/cadastroUsuario")
	public String cadastroUsuario() {
		return "cadastro-usuario";
	}
	
	@PostMapping
	public String adicionar(Usuarios usuarios) {
		System.out.println(usuarios);
		ur.save(usuarios);
		return "redirect:/";
	
	}
	
	@RequestMapping("/agendar-servico")
	public String agendar() {
		return "agendar-servico";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	
	
	
}
