package br.ifsp.jpa.teste;

import br.ifsp.jpa.dao.PessoaDAO;
import br.ifsp.jpa.modelo.Pessoa;

/**
 * Classe utilizada para testar os métodos do PessoaDAO.
 */
public class PessoaDAOTeste {
	public static void main(String[] args) throws Exception {
		Pessoa pessoa = new Pessoa();
		pessoa.setId(1L);
		pessoa.setNome("Eliana Santos");
		pessoa.setDisciplina("LP2A4");
		pessoa.setMatricula("SPO222432"); 

		PessoaDAO dao = new PessoaDAO();
		System.out.println("Salvando a pessoa: " + pessoa.getNome());
		System.out.println("Matricula: " + pessoa.getMatricula());
		pessoa = dao.salvar(pessoa);

		
		pessoa.setNome("Eliana Maria dos Santos");
		pessoa = dao.salvar(pessoa);
		System.out.println("Alterando a pessoa: " + pessoa.getNome());
		System.out.println("Matricula: " + pessoa.getMatricula());
 
		Pessoa pessoa2 = dao.consultarPorId(pessoa.getId());
		System.out.println("Consultando: " + pessoa2.getNome());

		System.out.println("Removendo a pessoa: " + pessoa.getId());
		System.out.println("Matricula: " + pessoa.getMatricula());
		dao.excluir(pessoa.getId()); 
	}
}