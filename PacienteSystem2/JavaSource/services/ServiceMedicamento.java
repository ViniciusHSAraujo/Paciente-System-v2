package services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entities.Medicamento;

/**
 * Classe de serviços para o {@link Medicamento}.
 * 
 * @author Vinícius Henrique Santos Araújo
 *
 */
@Stateless
public class ServiceMedicamento {

	@PersistenceContext
	private EntityManager em;

	/**
	 * Método que cadastra um novo medicamento no banco de dados.
	 * 
	 * @param medicamento: medicamento a ser cadastrado.
	 * @throws Exception - Caso já tenha algum medicamento cadastrado com o mesmo
	 *                   nome.
	 */
	public void cadastrarMedicamento(Medicamento medicamento) throws Exception {

		List<Medicamento> medicamentosNome = listarMedicamentosPeloNome(medicamento);
		if (medicamentosNome.isEmpty()) {
			this.em.persist(medicamento);
		} else {
			throw new Exception("Já existe um medicamento cadastrado com esse nome");
		}
	}

	/**
	 * Método que lista os medicamentos cadastrados no banco de dados.
	 * 
	 * @return uma lista com todos os medicamentos.
	 */
	public List<Medicamento> listarMedicamentos() {
		return this.em.createQuery("SELECT m FROM Medicamento m", Medicamento.class).getResultList();
	}

	/**
	 * Método que exclui um medicamento.
	 * 
	 * @param medicamento
	 */
	public void excluirMedicamento(Medicamento medicamento) {
		this.em.remove(this.em.merge(medicamento));
	}

	/**
	 * Método que busca um medicamento pelo seu nome.
	 * 
	 * @param medicamento
	 * @return
	 */
	public List<Medicamento> listarMedicamentosPeloNome(Medicamento medicamento) {
		return this.em.createQuery("SELECT m FROM Medicamento m where m.nome=:p1", Medicamento.class)
				.setParameter("p1", medicamento.getNome()).getResultList();
	}
}
