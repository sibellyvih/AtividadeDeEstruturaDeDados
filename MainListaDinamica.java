public class MainListaDinamica {
    static void main() {
        ListaDinamica listaDinamica = new ListaDinamica();

        listaDinamica.adicionarElemento("Banana");
        listaDinamica.adicionarElemento("Maçã");
        listaDinamica.adicionarElemento("Pera");
        listaDinamica.adicionarElemento("Banana");
        listaDinamica.exibirElementos();

        listaDinamica.removerTodas("Banana");
        listaDinamica.exibirElementos();
    }
}
