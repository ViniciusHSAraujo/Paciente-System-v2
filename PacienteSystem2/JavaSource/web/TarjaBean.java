package web;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import enums.Tarjas;

@Named
@ApplicationScoped
public class TarjaBean {

	public Tarjas[] listaTarjas() {
		return Tarjas.values();
	}
	
}