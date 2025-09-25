package GestaoDeBiblioteca;

public class LivroFiccao extends Livro{
    private String genero;

    public LivroFiccao(String genero, String titulo, String autor) {
        super(titulo, autor);
        this.genero = genero;
    }
    
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
}

