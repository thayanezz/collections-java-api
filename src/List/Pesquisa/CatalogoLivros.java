package List.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros{

    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();

    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }
    public List<Livro> persquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(livroList.isEmpty()){
            for(Livro l: livroList){
                if(l.getAutor().equals(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }
    public List<Livro> persquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if(livroList.isEmpty()){
            for (Livro l: livroList){
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao()<= anoFinal){
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }
    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if(livroList.isEmpty()){
            for (Livro l: livroList){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;          ///retorna o primeiro livro
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("memoria postumas", "bras cubas", 1980);

        catalogoLivros.persquisarPorAutor("bras cubas");
    }
}