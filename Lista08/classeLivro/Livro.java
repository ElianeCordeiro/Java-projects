package classeLivro;

public class Livro {
	
	private Autor autor;
	private Editora editora;
	private int isbn, anoEdicao;
	private String titulo;
	
	public Livro(Autor autor, Editora editora, int isbn, int anoEdicao, String titulo) {
		super();
		this.autor = autor;
		this.editora = editora;
		this.isbn = isbn;
		this.anoEdicao = anoEdicao;
		this.titulo = titulo;
	}
	
	
	@Override
	public String toString() {
		return "Livro [autor=" + autor + ", editora=" + editora + ", isbn=" + isbn + ", anoEdicao=" + anoEdicao
				+ ", titulo=" + titulo + "]";
	}
	
	

	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	public Editora getEditora() {
		return editora;
	}
	public void setEditora(Editora editora) {
		this.editora = editora;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public int getAnoEdicao() {
		return anoEdicao;
	}
	public void setAnoEdicao(int anoEdicao) {
		this.anoEdicao = anoEdicao;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
}
