package modelo.repositorio;

import java.util.Collection;

import modelo.Consulta;

public class ConsultaRepositorio extends Repositorio<Consulta> {
	public Consulta recuperarPacientePorId(int id) {
		Consulta resultado = null;

		try {
			resultado = PersistenceConfig.getEntityManager().find(Consulta.class, id);
		} catch (Exception e) {
			System.out.println("Erro ao tentar recuperar a pessoa " + "física! " + e.getMessage());
		}

		return resultado;
	}

	@SuppressWarnings("unchecked")
	public Collection<Consulta> recuperarPessoasFisicas() {
		Collection<Consulta> resultado = null;

		try {
			// HQL: "FROM PessoaFisica"
			resultado = PersistenceConfig.getEntityManager().createQuery("FROM " + Consulta.class.getName())
					.getResultList();
		} catch (Exception e) {
			System.out.println("Erro ao tentar recuperar as pessoas físicas cadastradas! " + e.getMessage());
		}

		return resultado;
	}
}
