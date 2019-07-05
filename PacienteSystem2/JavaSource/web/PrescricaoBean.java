package web;

import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import entities.Prescricao;
import services.ServicePrescricao;
import util.JSFUtils;

@RequestScoped
@Named
public class PrescricaoBean {

	private Prescricao prescricao;

	@EJB
	private ServicePrescricao servicePrescricao;

	public PrescricaoBean() {
		this.prescricao = new Prescricao();
	}

	public Prescricao getPrescricao() {
		return prescricao;
	}

	public void setPrescricao(Prescricao prescricao) {
		this.prescricao = prescricao;
	}

	public void cadastrarPrescricao() {
		try {
			this.servicePrescricao.cadastrarPrescricao(prescricao);;
			JSFUtils.enviarMensagemDeTexto("Prescricao cadastrada com sucesso!");
			this.prescricao = new Prescricao();
		} catch (Exception e) {
			JSFUtils.enviarMensagemDeAtencao(e.getMessage());
		}
	}

	public void excluirPrescricao(Prescricao prescricao) {
		this.servicePrescricao.excluirPrescricao(prescricao);;
		JSFUtils.enviarMensagemDeTexto("Prescricao excluída com sucesso.");
	}

	public List<Prescricao> listarPrescricoes() {
		return this.servicePrescricao.listarPrescricoes();
	}
}
