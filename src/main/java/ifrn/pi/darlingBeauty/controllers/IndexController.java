package ifrn.pi.darlingBeauty.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@GetMapping("/agendamento")
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
		return "redirect:/agendamento";

	}
	
	@GetMapping("/darlingBeauty/lista")
	public ModelAndView listarAgendamento() {
		List<Agendamento> agendamento = ar.findAll();
		ModelAndView mv = new ModelAndView("/listaAgendamento");
		mv.addObject("agendamento", agendamento);
		return mv;

	}
	
	
	@GetMapping("/darlingBeauty/lista/{id}/remover")
	public String apagarAgendamento(@PathVariable Long id, RedirectAttributes attributes) {
	    Optional<Agendamento> opt = ar.findById(id);
	    if (opt.isPresent()) {
	        ar.delete(opt.get());
	        attributes.addFlashAttribute("mensagem", "Agendamento removido com sucesso!");
	    } else {
	        attributes.addFlashAttribute("erro", "Agendamento não encontrado!");
	    }
	    return "redirect:/darlingBeauty/lista";
	}
	
	
	
	
	

}
