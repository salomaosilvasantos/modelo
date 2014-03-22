package br.ufc.quixada.npi.service;

import java.util.List;

import br.ufc.quixada.npi.model.Contato;

public interface ContatoService {

	public abstract void insere(Contato contato);

	public abstract List<Contato> findAll();

}