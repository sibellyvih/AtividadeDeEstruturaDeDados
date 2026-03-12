public class MainListaDinamica {
    static void main() {
        ListaDinamica listaDinamica = new ListaDinamica();

        listaDinamica.adicionarElemento("Banana");
        listaDinamica.adicionarElemento("Maçã");
        listaDinamica.adicionarElemento("Pera");
        listaDinamica.adicionarElemento("Banana");
        listaDinamica.exibirElementos();

        System.out.println("\n-----REMOVENDO TODAS AS OCORRÊNCIAS-----");
        listaDinamica.removerTodas("Pera");
        listaDinamica.exibirElementos();

        System.out.println("\n-----CONTANDO ELEMENTOS-----");
        listaDinamica.contar();

        System.out.println("\n-----ADICIONANDO VÁRIOS ELEMENTOS-----");
        listaDinamica.adicionarVarios(new String[]{"Laranja", "Maracujá", "Limão", "Uva", "Banana"});
        listaDinamica.exibirElementos();

        System.out.println("\n-----OBTER ELEMENTO PELO ÍNDICE-----");
        listaDinamica.obter(3);
        listaDinamica.exibirElementos();

        System.out.println("\n-----INSERINDO ELEMENTOS-----");
        listaDinamica.inserir(2, "Melância");
        listaDinamica.exibirElementos();

        System.out.println("\n-----REMOVER POR ÍNDICE-----");
        listaDinamica.removerPorIndice(4);
        listaDinamica.exibirElementos();

        System.out.println("\n-----LIMPANDO LISTA-----");
        //listaDinamica.limpar();
        listaDinamica.exibirElementos();

        System.out.println("\n-----ÚLTIMO ÍNDICE DA OCORRÊNCIA-----");
        listaDinamica.ultimoIndiceDe("Banana");
        listaDinamica.exibirElementos();

        System.out.println("\n-----C0NTANDO OCORRÊNCIAS-----");
        listaDinamica.contarOcorrencias("Banana");
        listaDinamica.exibirElementos();

        System.out.println("\n-----SUBSTITUINDO ELEMENTOS-----");
        listaDinamica.substituir("Banana", "Melão");
        listaDinamica.exibirElementos();
    }
}
