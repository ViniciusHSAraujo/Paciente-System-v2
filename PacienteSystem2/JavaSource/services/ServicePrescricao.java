package services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entities.Prescricao;

/**
 * Classe de serviços para a {@link Prescricao}.
 * 
 * @author Vinícius Henrique Santos Araújo
 *
 */
@Stateless
public class ServicePrescricao {

	@PersistenceContext
	private EntityManager em;

	/**
	 * Método que cadastra uma nova prescrição no banco de dados.
	 * 
	 * @param prescricao: prescrição a ser cadastrada
	 */
	public void cadastrarPrescricao(Prescricao prescricao) throws Exception {

		this.em.persist(prescricao);
	}

	/**
	 * Método que lista as prescrições cadastradas no banco de dados.
	 * 
	 * @return uma lista com todas as prescrições.
	 */
	public List<Prescricao> listarPrescricoes() {
		return this.em.createQuery("SELECT p FROM Prescricao p", Prescricao.class).getResultList();
	}

	public void excluirPrescricao(Prescricao prescricao) {
		this.em.remove(this.em.merge(prescricao));
	}
}
