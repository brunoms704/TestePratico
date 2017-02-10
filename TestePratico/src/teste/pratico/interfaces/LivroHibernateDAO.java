package teste.pratico.interfaces;

import java.util.List;

import teste.pratico.entities.Livro;

public interface LivroHibernateDAO {
	public void salvaLivro(Livro l);

	public List<Livro> listaTodosLivros();
}
