package modelo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "consultas")
public class Consulta
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idConsulta;
	
	@ManyToOne
	@JoinColumn(name = "idPaciente")
	private Paciente paciente;

	@ManyToOne
	@JoinColumn(name = "idMedico")
	private Medico medico;
	
	@Column(name = "data_hora")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataHora;

	public long getIdConsulta() {
		return idConsulta;
	}

	public void setIdConsulta(long idConsulta) {
		this.idConsulta = idConsulta;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public Date getDataHora() {
		return dataHora;
	}

	public void setDataHora(Date dataHora) {
		this.dataHora = dataHora;
	}
}
