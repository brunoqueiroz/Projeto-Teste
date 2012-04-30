package br.com.caelum.estoque.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UsuariosController {

	@RequestMapping(value="/login")
	public String index() {
		return "usuarios/login";
	}
}
