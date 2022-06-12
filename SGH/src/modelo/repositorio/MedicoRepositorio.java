package modelo.repositorio;

import java.util.Collection;

import modelo.Medico;

public class MedicoRepositorio extends Repositorio<Medico> {
	public Medico recuperarPacientePorId(int id) {
		Medico resultado = null;

		try {
			resultado = PersistenceConfig.getEntityManager().find(Medico.class, id);
		} catch (Exception e) {
			System.out.println("Erro ao tentar recuperar a pessoa " + "física! " + e.getMessage());
		}

		return resultado;
	}

	@SuppressWarnings("unchecked")
	public Collection<Medico> recuperarPessoasFisicas() {
		Collection<Medico> resultado = null;

		try {
			// HQL: "FROM PessoaFisica"
			resultado = PersistenceConfig.getEntityManager().createQuery("FROM " + Medico.class.getName())
					.getResultList();
		} catch (Exception e) {
			System.out.println("Erro ao tentar recuperar as pessoas físicas cadastradas! " + e.getMessage());
		}

		return resultado;
	}
}
