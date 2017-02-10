package teste.pratico.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Livro")
public class Livro implements Serializable {

	/**
	 * 
	 */
	@Id
	@GeneratedValue
	private Long idLivro;
	@Column
	private String nomeLivro;
	@Column
	private String quantPags;
	@Column
	private String temaLivro;

	public Long getIdLivro() {
		return idLivro;
	}

	public void setIdLivro(Long idLivro) {
		this.idLivro = idLivro;
	}

	public String getNomeLivro() {
		return nomeLivro;
	}

	public void setNomeLivro(String nomeLivro) {
		this.nomeLivro = nomeLivro;
	}

	public String getQuantPags() {
		return quantPags;
	}

	public void setQuantPags(String quantPags) {
		this.quantPags = quantPags;
	}

	public String getTemaLivro() {
		return temaLivro;
	}

	public void setTemaLivro(String temaLivro) {
		this.temaLivro = temaLivro;
	}

}
