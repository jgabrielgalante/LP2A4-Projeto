import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;


import modelo.Paciente;
import modelo.repositorio.PacienteRepositorio;

@SuppressWarnings("unused")
public class Main
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args)
	{
		PacienteRepositorio repPaciente = new PacienteRepositorio();
		
		int id = 1; // Usar um id cadastrado no banco
		
		/* Exemplo de inserção */
		
		Paciente p = new Paciente();
		p.setDataNasc(new Date(2001,8,23));
		p.setNome("Jeffersoon");
		p.setEndereço("Rua ana alves");
		p.setNumConvenio(3060128);
		p.setDescConsulta("blabalabla");
		
		repPaciente.criar(p);
	}
}
