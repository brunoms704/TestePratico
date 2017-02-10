package teste.pratico.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import teste.pratico.entities.Livro;
import teste.pratico.interfaces.LivroHibernateDAO;
import teste.pratico.persistencia.LivroHibernateDAOImpl;

/**
 * Servlet implementation class CadastraLivroServlet
 */
@WebServlet("/CadastraLivroServlet")
public class CadastraLivroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CadastraLivroServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/* Captura os dados informados pelo usuário na página HTML */
		String nomeLivro = request.getParameter("nomeLivro");
		String quantPags = request.getParameter("quantPags");
		String temaLivro = request.getParameter("temaLivro");

		/* Cria uma instância de Livro e seta os atributos */
		Livro l = new Livro();
		l.setNomeLivro(nomeLivro);
		l.setQuantPags(quantPags);
		l.setTemaLivro(temaLivro);

		LivroHibernateDAO livroDAO = new LivroHibernateDAOImpl();
		try {
			livroDAO.salvaLivro(l);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		/* Recarrega página */
		RequestDispatcher r = request.getRequestDispatcher("sucesso.html");
		r.forward(request, response);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
