void main() {
    ListaSimples listaSimples = new ListaSimples(5);

    listaSimples.exibirElementos();
    System.out.println("---------------------");
    listaSimples.adicionarElemento("Chocolate");
    listaSimples.adicionarElemento("Morango");
    listaSimples.adicionarElemento("Morango");
    listaSimples.adicionarElemento("Baunilha");

    System.out.println("\n-----MÉTODO REMOVER TODAS-----");
    listaSimples.removerTodas("Baunilha");
    listaSimples.exibirElementos();

    System.out.println("\n-----MÉTODO CONTAR-----");
    listaSimples.contar();
    listaSimples.exibirElementos();

    System.out.println("\n-----MÉTODO ADICIONAR VÁRIOS-----");
    listaSimples.adicionarVarios(new String[]{"Abacaxi", "Flocos", "Chocolate", "Baunilha"});
    listaSimples.exibirElementos();

    System.out.println("\n-----MÉTODO OBTER-----");
    listaSimples.obter(3);
    listaSimples.exibirElementos();

    System.out.println("\n-----MÉTODO INSERIR-----");
    listaSimples.inserir(2, "Uva");
    listaSimples.exibirElementos();

    System.out.println("\n-----MÉTODO REMOVER POR ÍNDICE-----");
    listaSimples.removerPorIndice(0);
    listaSimples.exibirElementos();

    System.out.println("\n-----MÉTODO ÚLTIMO ÍNDICE DA OCORRÊNCIA-----");
    listaSimples.ultimoIndiceDe("Morango");
    listaSimples.exibirElementos();

    System.out.println("\n-----MÉTODO CONTAR OCORRÊNCIAS-----");
    listaSimples.contarOcorrencias("Morango");
    listaSimples.exibirElementos();

    System.out.println("\n-----MÉTODO SUBSTITUIR-----");
    listaSimples.substituir("Flocos", "Abacaxi com vinho");
    listaSimples.exibirElementos();

    System.out.println("\n-----MÉTODO LIMPAR-----");
    listaSimples.limpar();
    listaSimples.exibirElementos();


}