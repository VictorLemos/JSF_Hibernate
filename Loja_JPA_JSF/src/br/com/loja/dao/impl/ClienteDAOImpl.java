package br.com.loja.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.com.loja.dao.ClienteDAO;
import br.com.loja.entity.Cliente;

public class ClienteDAOImpl implements ClienteDAO{

	EntityManagerFactory factory;
	EntityManager em;
	
	public ClienteDAOImpl (){
		factory = Persistence.createEntityManagerFactory("loja");
		em = factory.createEntityManager();
	}
	
	//Usado para Salvar um novo objeto ou Atualizar
	@Override
	public void salvar(Cliente c) {
		//abrir conexao com BD
		em.getTransaction().begin();
		//2 jeitos de salvar persist que salva e o merge se ja existir ele atualiza 
		em.merge(c);
		//salva o que fizemos
		em.getTransaction().commit();	
	}

	@Override
	public void remover(Cliente c) {
		em.getTransaction().begin();
		em.remove(c);
		em.getTransaction().commit();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Cliente> listarTodos() {
		em.getTransaction().begin();
		Query consulta = em.createQuery("SELECT CLIENTE FROM Cliente cliente");
		List<Cliente> clientes = consulta.getResultList();
		em.getTransaction().commit();
		return clientes;
	}

	@Override
	public Cliente obterPorId(int id) {	
		return em.find(Cliente.class, id);
	}

}
