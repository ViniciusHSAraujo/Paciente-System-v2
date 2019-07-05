package entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import com.sun.istack.internal.NotNull;

/**
 * 
 * Classe que representa a prescrição média do paciente que será internado.
 * 
 * @author Vinícius Araújo
 * @Entity -> Informa ao JSF que é uma ENTIDADE (e criar uma tabela no banco de
 *         dados).
 * 
 */
@Entity
public class Prescricao {
	
	/**
	 * Identificação de cada paciente no banco de dados
	 * 
	 * @SequenceGenerator e @GeneratedValue fazem com que o sistema gere uma
	 *                    numeração sequencial para cada paciente automaticamente.
	 * 
	 */
	@Id
	@SequenceGenerator(name = "CONTADOR_PRESCRICAO", sequenceName = "NUM_SEQ_PRESCRICAO", allocationSize = 0)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CONTADOR_PRESCRICAO")
	private Integer id;
	
	@ManyToOne
	@NotNull
	private Paciente paciente;
	
	@ManyToOne
	@NotNull
	private Medicamento medicamento;
	
	@NotNull
	private Date dataInicio;
	
	@NotNull
	private Date dataFinal;
	
	@NotNull
	private String frequencia;
	
	public Prescricao() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Medicamento getMedicamento() {
		return medicamento;
	}

	public void setMedicamento(Medicamento medicamento) {
		this.medicamento = medicamento;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(Date dataFinal) {
		this.dataFinal = dataFinal;
	}

	public String getFrequencia() {
		return frequencia;
	}

	public void setFrequencia(String frequencia) {
		this.frequencia = frequencia;
	}
	
}
