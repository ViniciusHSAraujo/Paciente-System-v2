package web;

import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import entities.Medicamento;
import services.ServiceMedicamento;
import util.JSFUtils;

@RequestScoped
@Named
public class MedicamentoBean {

	private Medicamento medicamento;
	
	@EJB
	private ServiceMedicamento serviceMedicamento;
	
	private List<Medicamento> medicamentos;
	
	public MedicamentoBean() {
		this.medicamento = new Medicamento();
	}

	public Medicamento getMedicamento() {
		return medicamento;
	}

	public void setMedicamento(Medicamento medicamento) {
		this.medicamento = medicamento;
	}
	
	public void cadastrarMedicamento() {
		try {
			this.serviceMedicamento.cadastrarMedicamento(medicamento);
			JSFUtils.enviarMensagemDeTexto("Medicamento cadastrado com sucesso!");
			this.medicamento = new Medicamento();
		} catch (Exception e) {
			JSFUtils.enviarMensagemDeAtencao(e.getMessage());
		}
	}
	
	public void excluirMedicamento(Medicamento medicamento) {
		this.serviceMedicamento.excluirMedicamento(medicamento);
		JSFUtils.enviarMensagemDeTexto("Medicamento excluído com sucesso.");
	}
	
	public List<Medicamento> listarMedicamentos() {
		return this.serviceMedicamento.listarMedicamentos();
	}

	public List<Medicamento> getMedicamentos() {
		
		if (this.medicamentos == null) {
			this.medicamentos = this.serviceMedicamento.listarMedicamentos();
		}
		
		return medicamentos;
	}

	public void setMedicamentos(List<Medicamento> medicamentos) {
		this.medicamentos = medicamentos;
	}
	
}
