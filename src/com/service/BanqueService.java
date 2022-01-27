package com.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.entity.BanqueEntity;

@WebService(name = "BanqueWS")
public class BanqueService {
	
	@WebMethod(operationName = "RecupCompte")
	public BanqueEntity getCompte(@WebParam(name = "matricule") long matricule ) {
		return new BanqueEntity(matricule,Math.random()*8000 , new Date());                     
	}
	@WebMethod(operationName = "ConvertionCfatoEuro")
	public double Conversion(@WebParam(name = "montant") double montant) {
		double convert = montant * 600 ;
		return convert;
	}
	@WebMethod(operationName = "AllCompte")
	public List<BanqueEntity> getListCompte() {
		List<BanqueEntity> Compte = new ArrayList<BanqueEntity>();
		Compte.add(new BanqueEntity(1L, Math.random()*8000, new Date()));
		Compte.add(new BanqueEntity(2L, Math.random()*8000, new Date()));
		return Compte;                     
	}


}
