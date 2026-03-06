public class ListaSimples implements ListaOperacoes{
    String[] lista;

    public ListaSimples(int tamanho) {
        this.lista = new String[tamanho];
    }

    public void exibirElementos() {
        for (int i = 0; i < this.lista.length; i++) {
            System.out.println("Lista[" + i + "] = " + this.lista[i]);
        }
    }

    private boolean estaVazio() {
        for (int i = 0; i < this.lista.length; i++) {
            if (this.lista[i] != null) {
                return false;
            }
        }
        return true;
    }

    public int buscarElemento(String elemento){
        int i;
        if (!estaVazio()) {
            for (i = 0; i < this.lista.length; i++) {
                if (this.lista[i].equals(elemento)) {
                    return i;
                }
            }
        }
        System.out.println("Elemento não encontrado na lista.");
        return -1;
    }

    public void adicionarElemento(String elemento) {
        if (!estaCheia()) {
            this.lista[encontrarPosicaoVazia()] = elemento;
            System.out.println("Elemento " + elemento + " adicionado com sucesso!");
        }
    }

    private int encontrarPosicaoVazia() {
        int i;
        for (i = 0; i < this.lista.length; i++) {
            if (this.lista[i] == null) {
                return i;
            }
        }
        return i;
    }

    private boolean estaCheia() {
        for (int i = 0; i < this.lista.length; i++) {
            if (this.lista[i] == null) {
                return false;
            }
        }
        System.out.println("A lista está cheia!");
        return true;
    }


    @Override
    public int removerTodas(String elemento) {
        int qntElementoRemovido = 0;

        if (!estaVazio()){
            for (int i=0; i < this.lista.length; i++){
                if (lista[i] == elemento){
                    this.lista[i] = null;
                    System.out.println("Elemento " + elemento + " removido com sucesso!");

                }
            }

        }
        for (int i=0; i < this.lista.length; i++){
            if (lista[i] == null) {
                qntElementoRemovido++;
            }
        }

        System.out.println("Total de elementos removidos: " + qntElementoRemovido);
        return qntElementoRemovido;
    }

    @Override
    public int contar() {
        int contadorDeElementos = 0;
        for (int i=0; i < this.lista.length; i++){
            if (lista[i] != null){
                contadorDeElementos++;
            }
        }
        System.out.println("Quantidade total de elementos: " + contadorDeElementos);
        return contadorDeElementos;
    }

    @Override
    public int adicionarVarios(String[] elementos) {
        return 0;
    }

    @Override
    public String obter(int indice) {
        if (indice >= 0){
            System.out.println("No índice "+ indice + " foi encontrado o elemento "+ lista[indice]);
        return lista[indice];
       } else{
            System.out.println("Número de índice inválido!");
            return null;
        }
    }

    @Override
    public boolean inserir(int indice, String elemento) {
        String auxiliar;
        if (!estaCheia()){
            for (int i = indice; i < lista.length; i++){
                if (lista[i] == null){

                }
            }
            auxiliar = lista[indice];
            lista[indice] = elemento;

            for (int i = indice + 1; i < lista.length-indice; i++){
                lista[i] = auxiliar;
                auxiliar = lista[i+1];
                lista[i+1] = lista[i];
            }
        } else {
            return false;
        }
    }

    @Override
    public String removerPorIndice(int indice) {
        return "";
    }

    @Override
    public void limpar() {

    }

    @Override
    public int ultimoIndiceDe(String elemento) {
        return 0;
    }

    @Override
    public int contarOcorrencias(String elemento) {
        return 0;
    }

    @Override
    public int substituir(String antigo, String novo) {
        return 0;
    }
}


