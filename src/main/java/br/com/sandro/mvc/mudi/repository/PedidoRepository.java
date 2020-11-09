package br.com.sandro.mvc.mudi.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import br.com.sandro.mvc.mudi.model.Pedido;

@Repository
public class PedidoRepository {

	//Comunicando com o Banco de Dados
	@PersistenceContext
	private EntityManager entityManager;
	
	public  List<Pedido> recuperaTodosOsPedidos() {
		Query query = entityManager.createQuery("select p from Pedido p", Pedido.class);
		return query.getResultList();
	}
}
