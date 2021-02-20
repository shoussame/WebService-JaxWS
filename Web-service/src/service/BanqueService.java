package service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import entities.Compte;

@WebService(serviceName = "BanqueWs")
public class BanqueService {
	@WebMethod(operationName = "conversionEuroDh")
	public double conversion(@WebParam (name = 	"montant") double montant) { return montant*11; }
	@WebMethod
	public Compte getCompte(long id) { return new Compte(id, Math.random()*12000, new Date()); }
	@WebMethod
	public Collection<Compte> listerComptes(){
		List<Compte> liste = new ArrayList<>();
		liste.add(new Compte(1, Math.random()*12000, new Date()));
		liste.add(new Compte(2, Math.random()*12000, new Date()));
		liste.add(new Compte(3, Math.random()*12000, new Date()));
		return liste;
	}
}
