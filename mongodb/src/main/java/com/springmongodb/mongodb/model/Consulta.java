package com.springmongodb.mongodb.model;

import java.io.Serializable;
import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document()
public class Consulta implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	private String prescricoes;
	private String exames;
	private String prontuario;
	private String dataHora;	
	private Double valor;
	
	@DBRef
	private Medico medico;
	@DBRef
	private Paciente paciente;
	
	public Consulta(String id, String prescricoes, String exames, String prontuario, String dataHora, Double valor,
			Medico medico, Paciente paciente) {
		super();
		this.id = id;
		this.prescricoes = prescricoes;
		this.exames = exames;
		this.prontuario = prontuario;
		this.dataHora = dataHora;
		this.valor = valor;
		this.medico = medico;
		this.paciente = paciente;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPrescricoes() {
		return prescricoes;
	}

	public void setPrescricoes(String prescricoes) {
		this.prescricoes = prescricoes;
	}

	public String getExames() {
		return exames;
	}

	public void setExames(String exames) {
		this.exames = exames;
	}

	public String getProntuario() {
		return prontuario;
	}

	public void setProntuario(String prontuario) {
		this.prontuario = prontuario;
	}

	public String getDataHora() {
		return dataHora;
	}

	public void setDataHora(String dataHora) {
		this.dataHora = dataHora;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Consulta other = (Consulta) obj;
		return Objects.equals(id, other.id);
	}
}
