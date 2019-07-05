package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import com.sun.istack.internal.NotNull;

import enums.Tarjas;

/**
 * 
 * Classe que representa o medicamento que será tomado pelo paciente internado.
 * 
 * @author Vinícius Araújo
 * @Entity -> Informa ao JSF que é uma ENTIDADE (e criar uma tabela no banco de
 *         dados).
 * 
 */
@Entity
public class Medicamento {

	/**
	 * Identificação de cada paciente no banco de dados
	 * 
	 * @SequenceGenerator e @GeneratedValue fazem com que o sistema gere uma
	 *                    numeração sequencial para cada paciente automaticamente.
	 * 
	 */
	@Id
	@SequenceGenerator(name = "CONTADOR_MEDICAMENTO", sequenceName = "NUM_SEQ_MEDICAMENTO", allocationSize = 0)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CONTADOR_MEDICAMENTO")
	private Integer id;
	
	@NotNull
	private String nome;
	
	@NotNull
	private String concentracao;
	
	@NotNull
	private String laboratorio;
	
	@NotNull
	private Tarjas tarja;
	
	public Medicamento() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getConcentracao() {
		return concentracao;
	}

	public void setConcentracao(String concentracao) {
		this.concentracao = concentracao;
	}

	public String getLaboratorio() {
		return laboratorio;
	}

	public void setLaboratorio(String laboratorio) {
		this.laboratorio = laboratorio;
	}

	public Tarjas getTarja() {
		return tarja;
	}

	public void setTarja(Tarjas tarja) {
		this.tarja = tarja;
	}
	
}
