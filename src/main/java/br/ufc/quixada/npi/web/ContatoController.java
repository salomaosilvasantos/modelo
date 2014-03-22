package br.ufc.quixada.npi.web;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;
import javax.inject.Named;

import br.ufc.quixada.npi.model.Contato;
import br.ufc.quixada.npi.service.ContatoService;

@Named
@ManagedBean
public class ContatoController {

	@Inject
	private ContatoService cs;
	private Contato contato;

	public ContatoController() {
		super();
		this.contato = new Contato();
	}

	public String insere() {
		return "inserir";
	}

	public void inserir() {
		try {
			cs.insere(this.contato);
			
		} catch (Exception e) {
			System.out.println("Não foi possível realizar a inserção");
			
		}

	}

	public List<Contato> getContatos() {
		System.out.println("Chamou");
		return cs.findAll();
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

}
