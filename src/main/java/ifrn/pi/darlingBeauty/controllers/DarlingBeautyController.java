package ifrn.pi.darlingBeauty.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ifrn.pi.darlingBeauty.models.Usuarios;
import ifrn.pi.darlingBeauty.repositories.UsuariosRepository;

@Controller
public class DarlingBeautyController {
	
	@Autowired
	private UsuariosRepository ur;

	@GetMapping("/darlingBeauty/cadastroUsuario")
	public String cadastroUsuario() {
		return "cadastro-usuario";
	}
	
	@PostMapping("/darlingBeauty")
	public String adicionar(Usuarios usuarios) {
		System.out.println(usuarios);
		ur.save(usuarios);
		return "cadastro-adicionado";
	
	}
	
	@RequestMapping("/darlingBeauty/agendar-servico")
	public String agendar() {
		return "agendar-servico";
	}
	
	@GetMapping("darlingBeauty/login")
	public String loginUsuario() {
		return "login";
	}
}
