package br.com.loja.testes;

import java.util.List;

import br.com.loja.dao.impl.ClienteDAOImpl;
import br.com.loja.entity.Cliente;

public class Teste {

	public static void main(String[] args) {
		
		ClienteDAOImpl clienteDAOImpl = new ClienteDAOImpl();
		Cliente c = new Cliente();
		
		/*
		//inserir
		c.setNome("Beltrano Silva");
		c.setIdade(26);
		
		clienteDAOImpl.salvar(c);
		*/
		
		
		/*
		//select
		List<Cliente> clientes = clienteDAOImpl.listarTodos();
		for (Cliente cliente : clientes) {
			System.out.println(cliente.getId());
			System.out.println(cliente.getNome());
			System.out.println(cliente.getIdade());
		}
		*/
		
		
		
		/*
		//atualizando pego por ID
		Cliente c = clienteDAOImpl.obterPorId(1);
		c.setNome("Victor2");
		c.setIdade(55);
		
		clienteDAOImpl.salvar(c);
	
		System.out.println(c.getId());
		System.out.println(c.getNome());
		System.out.println(c.getIdade());
		*/
		
		/*
		//remover
		c = clienteDAOImpl.obterPorId(2);
		clienteDAOImpl.remover(c);
		*/
	}
}
