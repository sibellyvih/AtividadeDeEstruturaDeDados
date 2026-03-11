void main() {
    ListaSimples listaSimples = new ListaSimples(5);

    listaSimples.exibirElementos();
    System.out.println("---------------------");
    listaSimples.adicionarElemento("Batata");
    listaSimples.adicionarElemento("Feijão");
    //listaSimples.adicionarElemento("Batata2");
    listaSimples.adicionarElemento("Arroz");

    System.out.println("\n-----MÉTODO REMOVER TODAS-----");
    //listaSimples.removerTodas("Batata");

    System.out.println("\n-----MÉTODO EXIBIR ELEMENTOS-----");
    //listaSimples.exibirElementos();

    System.out.println("\n-----MÉTODO CONTAR-----");
    //listaSimples.contar();
    listaSimples.exibirElementos();

    System.out.println("\n-----MÉTODO ADICIONAR VÁRIOS-----");
    listaSimples.adicionarVarios(new String[]{"Salsicha", "Salsa"});

    System.out.println("\n-----MÉTODO OBTER-----");
    //listaSimples.obter(0);
    listaSimples.exibirElementos();

    System.out.println("\n-----MÉTODO INSERIR-----");
    //listaSimples.inserir(4, "Suco");
    //listaSimples.exibirElementos();

    System.out.println("\n-----MÉTODO REMOVER POR ÍNDICE-----");
    //listaSimples.removerPorIndice(3);

    System.out.println("\n-----MÉTODO LIMPAR-----");
    //listaSimples.limpar();

    System.out.println("\n-----MÉTODO ÚLTIMO ÍNDICE DA OCORRÊNCIA-----");
    //listaSimples.ultimoIndiceDe("Arroz");

    System.out.println("\n-----MÉTODO CONTAR OCORRÊNCIAS-----");
    //.contarOcorrencias("Arroz");

    System.out.println("\n-----MÉTODO SUBSTITUIR-----");
    //listaSimples.substituir("Batata", "Água");


}