package br.com.loja.dao;

import java.util.List;

import br.com.loja.entity.Cliente;

public interface ClienteDAO {

	void salvar(Cliente c);
	void remover(Cliente c);
	List<Cliente> listarTodos();
	Cliente obterPorId(int id);
}
