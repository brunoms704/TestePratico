package teste.pratico.persistencia;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import teste.pratico.entities.Livro;
import teste.pratico.interfaces.LivroHibernateDAO;

public class LivroHibernateDAOImpl implements LivroHibernateDAO {

	@Override
	public void salvaLivro(Livro l) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("livroPU");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		em.persist(l);
		em.getTransaction().commit();

		em.clear();
		em.close();
		emf.close();

	}

	@Override
	public List<Livro> listaTodosLivros() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("livroPU");
		EntityManager em = emf.createEntityManager();

		Query q = em.createQuery("select l from Livro l");

		List<Livro> livros = q.getResultList();

		em.clear();
		em.close();
		emf.close();

		return livros;
	}

}
