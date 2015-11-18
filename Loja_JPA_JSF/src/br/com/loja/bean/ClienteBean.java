package br.com.loja.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.loja.dao.impl.ClienteDAOImpl;
import br.com.loja.entity.Cliente;

@ManagedBean
@SessionScoped
public class ClienteBean {
	
	//Afim de manipular a view do formularioCliente
	Cliente cliente;
	//Meu repositorio
	ClienteDAOImpl clienteDAOImpl;
	//Lista de clientes, para receber a lista do modelo Loja_JPA
	List<Cliente> clientes;
	
	//construtor
	public ClienteBean(){
		clienteDAOImpl = new ClienteDAOImpl();
		cliente = new Cliente();
	}
	
	//metodo para Salvar
	public String salvar(){
		clienteDAOImpl.salvar(cliente);
		return "index"; //retorno para index
	}
	
	//metodo para um novo cliente com redirect para formularioCliente
	public String novo(){
		cliente = new Cliente();
		return "formularioCliente";
	}
	
	//metodo para editar
	public String editar(){
		return "formularioCliente";
	}
	
	//metodo remover retorno null para que ele permaneça na pagina
	public String remover(){
		clienteDAOImpl.remover(cliente);
		return null;
	}
     
	//Getters e Setters da Lista
	//Qunado chamar a lista na View, quero que ele busque isso no BD
	public List<Cliente> getClientes() {
		clientes = clienteDAOImpl.listarTodos();		
		return clientes;	
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	//getters e setter do cliente para manipular na view	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
}
