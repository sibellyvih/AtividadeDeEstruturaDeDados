void main() {
    ListaSimples listaSimples = new ListaSimples(5);

    listaSimples.exibirElementos();
    System.out.println("---------------------");
    listaSimples.adicionarElemento("Batata");
    listaSimples.adicionarElemento("Feijão");
    listaSimples.adicionarElemento("Batata");
    listaSimples.adicionarElemento("Arroz");
    listaSimples.adicionarElemento("Batata");
    System.out.println("---------------------");
    listaSimples.removerTodas("Batata");
    System.out.println("---------------------");
    listaSimples.exibirElementos();
    System.out.println("---------------------");
    listaSimples.contar();
    System.out.println("---------------------");
    System.out.println("Falta o método adiocionar vários");
    System.out.println("---------------------");
    listaSimples.obter(0);
    System.out.println("---------------------");
    System.out.println();
    System.out.println("---------------------");
}