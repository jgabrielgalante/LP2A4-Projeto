package modelo.repositorio;

import java.util.Collection;

import modelo.Paciente;

public class PacienteRepositorio extends Repositorio<Paciente> {
	public Paciente recuperarPacientePorId(int id) {
		Paciente resultado = null;

		try {
			resultado = PersistenceConfig.getEntityManager().find(Paciente.class, id);
		} catch (Exception e) {
			System.out.println("Erro ao tentar recuperar a pessoa " + "física! " + e.getMessage());
		}

		return resultado;
	}

	@SuppressWarnings("unchecked")
	public Collection<Paciente> recuperarPessoasFisicas() {
		Collection<Paciente> resultado = null;

		try {
			// HQL: "FROM PessoaFisica"
			resultado = PersistenceConfig.getEntityManager().createQuery("FROM " + Paciente.class.getName())
					.getResultList();
		} catch (Exception e) {
			System.out.println("Erro ao tentar recuperar as pessoas físicas cadastradas! " + e.getMessage());
		}

		return resultado;
	}
}
