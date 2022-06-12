package modelo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "paciente")
public class Paciente
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected long idPaciente;
	
	@Column(name = "data_nascimento")
	@Temporal(TemporalType.TIMESTAMP)
	protected Date dataNasc;
	
	protected String nome;
	
	protected String endereço;
	
	protected int numConvenio;
	
	protected String descConsulta;
	
	public void marcarConsulta() {
		
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public int getNumConvenio() {
		return numConvenio;
	}

	public void setNumConvenio(int numConvenio) {
		this.numConvenio = numConvenio;
	}

	public String getDescConsulta() {
		return descConsulta;
	}

	public void setDescConsulta(String descConsulta) {
		this.descConsulta = descConsulta;
	}
}