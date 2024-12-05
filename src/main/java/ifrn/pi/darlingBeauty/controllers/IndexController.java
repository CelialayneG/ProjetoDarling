package ifrn.pi.darlingBeauty.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import ifrn.pi.darlingBeauty.models.Agendamento;
import ifrn.pi.darlingBeauty.models.Servico;
import ifrn.pi.darlingBeauty.repositories.AgendamentoRepository;
import ifrn.pi.darlingBeauty.repositories.ServicoRepository;

@Controller
public class IndexController {

	@Autowired
	private AgendamentoRepository ar;
	@Autowired
	private ServicoRepository sr;


	
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
	
	@RequestMapping("/agendamento")

	public ModelAndView agendamento() {
	    List<Servico> servicos = sr.findAll();
	    ModelAndView mv = new ModelAndView("agendar-servico");
	    mv.addObject("servicos", servicos);
	    return mv;

	}

	@PostMapping("/agendamento")
	public String salvarAgendamento(Agendamento agendamento, RedirectAttributes attributes) {
		ar.save(agendamento);
		attributes.addFlashAttribute("mensagem", "Agendado com sucesso!");
		return "redirect:/agendar-servico";

	}


}
