package Testes;

import java.util.ArrayList;

import Sistema.Agenda;
import Sistema.Consulta;
import Sistema.MedicoAssalariado;
import Sistema.MedicoComissionado;
import Sistema.Paciente;
import Sistema.Procedimento;
import Sistema.comissionamentoInvalidoException;

public class TesteRelatorios {
	
	public static void main(String[] args) {
	
		MedicoAssalariado m1 = new MedicoAssalariado("Eduardo", "Lelis", "M", "eduardo@gmail.com", "222", 15000);
		MedicoAssalariado m2 = new MedicoAssalariado("Liana", "Sena", "f", "liana@gmail.com", "777", 25000);
		MedicoAssalariado m3 = new MedicoAssalariado("Henrique", "Clemente", "m", "clemenrte@gmail.com", "777", 2200);
		MedicoAssalariado m4 = new MedicoAssalariado("Ana", "Lemos", "f", "lemos@gmail.com", "777", 24200);
		
		// Instanciando pacientes
		Paciente p1 = new Paciente("Z�",  "Couves", "M", "couve@gmail.com", "10/10/1950");
		Paciente p2 = new Paciente("Z�", "Tomates", "M", "tomates@gmail.com", "16/11/1945");
		Paciente p3 = new Paciente("Z�", "Cebolas", "M", "cebolas@gmail.com", "18/01/1960");
		// Instanciando procedimentos
		Procedimento pr1 = new Procedimento("Cirurgia Joelho", 500.0);
		Procedimento pr2 = new Procedimento("Cirurgia Cotovelo", 700.0);
		Procedimento pr3 = new Procedimento("Cirurgia Cabe�a", 850.0);
		Procedimento pr4 = new Procedimento("Cirurgia P�", 1000.0);
		Procedimento pr5 = new Procedimento("Cirurgia Canela", 100.0);
		Procedimento pr6 = new Procedimento("Cirurgia Olho", 1700.0);
		Procedimento pr7 = new Procedimento("Cirurgia Ouvido", 2850.0);
		Procedimento pr8 = new Procedimento("Cirurgia Boca", 4000.0);
	
		// Criando ArrayList de procedimentos
		ArrayList<Procedimento> ar1 = new ArrayList<Procedimento>();
		ArrayList<Procedimento> ar2 = new ArrayList<Procedimento>();
		ArrayList<Procedimento> ar3 = new ArrayList<Procedimento>();
		// Adicionando os procedimentos nos arrays
		ar1.add(pr1);
		ar1.add(pr5);
		ar1.add(pr3);
		ar1.add(pr7);
		ar2.add(pr3);
		ar2.add(pr2);
		ar2.add(pr4);
		ar2.add(pr5);
		ar3.add(pr6);
		ar3.add(pr7);
		ar3.add(pr8);
		ar3.add(pr4);
	
		// Instanciando consultas
		Consulta c1 = new Consulta(m1, p1, ar1);
		Consulta c2 = new Consulta(m2, p2, ar2);
		Consulta c3 = new Consulta(m3, p3, ar3);
		Consulta c4 = new Consulta(m4, p1, ar3);
		Consulta c5 = new Consulta(m1, p1, ar3);
		Consulta c6 = new Consulta(m2, p1, ar3);
		Consulta c7 = new Consulta(m3, p1, ar3);
		Consulta c8 = new Consulta(m4, p1, ar3);
		Consulta c9 = new Consulta(m1, p1, ar3);
		Consulta c10 = new Consulta(m2, p1, ar3);
		
		// Instanciando agenda
		Agenda.adicionaConsulta(c1);
		Agenda.adicionaConsulta(c2);
		Agenda.adicionaConsulta(c3);
		Agenda.adicionaConsulta(c4);
		Agenda.adicionaConsulta(c5);
		Agenda.adicionaConsulta(c6);
		Agenda.adicionaConsulta(c7);
		Agenda.adicionaConsulta(c8);
		Agenda.adicionaConsulta(c9);
		Agenda.adicionaConsulta(c10);
	
		System.out.println(Agenda.relatorioOrdemCrescenteNomePaciente());
		System.out.println("");
		System.out.println(Agenda.relatorioOrdemDecrescenteNomeMedico());
	}
}