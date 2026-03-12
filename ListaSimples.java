public class ListaSimples implements ListaOperacoes {
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

        if (!estaVazio()) {
            for (int i = 0; i < this.lista.length; i++) {
                if (lista[i] != null && lista[i].equals(elemento)) {
                    this.lista[i] = null;
                    System.out.println("Elemento " + elemento + " removido com sucesso!");
                    qntElementoRemovido++;
                }
            }
        }

        System.out.println("Total de elementos removidos: " + qntElementoRemovido);
        return qntElementoRemovido;
    }

    @Override
    public int contar() {
        int contadorDeElementos = 0;
        for (int i = 0; i < this.lista.length; i++) {
            if (lista[i] != null) {
                contadorDeElementos++;
            }
        }
        System.out.println("Quantidade total de elementos: " + contadorDeElementos);
        return contadorDeElementos;
    }


    @Override
    public int adicionarVarios(String[] elementos) {
        int quatidadeElementosAdicionados = 0;
        if (!estaCheia()) {
            for (int j = 0; j < elementos.length; j++) {

                for (int i = 0; i < lista.length; i++) {

                    if (lista[i] == null) {
                        lista[i] = elementos[j];
                        quatidadeElementosAdicionados++;
                        System.out.println("Elemento "+ lista[i] + " adicionado com sucesso!");
                        break;
                    }
                }
            }
        }
        System.out.println("Total de elementos que foram adicionados: " + quatidadeElementosAdicionados);
        return quatidadeElementosAdicionados;
    }

    @Override
    public String obter(int indice) {
        if (indice >= 0 && indice < lista.length) {
            System.out.println("No índice " + indice + " foi encontrado o elemento " + lista[indice]);
            return lista[indice];
        } else {
            System.out.println("Número de índice inválido!");
            return null;
        }
    }

    @Override
    public boolean inserir(int indice, String elemento) {
        if (indice >= 0 && indice < lista.length){
            if (!estaCheia()){
                for (int i = lista.length-1; i > indice; i--){
                    lista[i] = lista[i-1];
                }

                System.out.println("Inserindo elemento "+ elemento + ", na posição " + indice);
                lista[indice] = elemento;

                System.out.println("Inserção realizada com sucesso!");
                return true;
            }
        }

        System.out.println("Lista cheia! Não é possível realizar a inserção.");
        return false;
    }

    @Override
    public String removerPorIndice(int indice) {
        String itemRemovidoPorIndice;

        if (indice >= 0 && indice < lista.length){
            itemRemovidoPorIndice = lista[indice];
            System.out.println("Índice válido!");
        } else {
            System.out.println("Índice inválido!");
            return null;
        }

        if (!estaVazio()){
            lista[indice] = null;
            System.out.println("Item "+ itemRemovidoPorIndice + " removido do índice "+ indice);

            for (int i = indice; i < this.lista.length-1; i++){
                    lista[i] = lista[i+1];
            }
            lista[lista.length-1] = null;
        }
        return "Item removido: " + itemRemovidoPorIndice;
    }

    @Override
    public void limpar() {
        if (!estaVazio()) {
            System.out.println("Limpando lista...");

            for (int i = 0; i < lista.length; i++) {
                lista[i] = null;
            }
            System.out.println("Lista limpada com sucesso!");

        } else {
            System.out.println("A lista já está vazia!");
        }
    }

    @Override
    public int ultimoIndiceDe(String elemento) {
        int ultimaOcorrencia;
        for (int i = lista.length-1; i >= 0; i--){
            if (lista[i] != null && lista[i].equals(elemento)){
                ultimaOcorrencia = i;
                System.out.println("O elemento "+ elemento + " está na posição "+ ultimaOcorrencia + " em sua última acorrência.");
                return ultimaOcorrencia;
            }
        }
            System.out.println("Não há elemento na última ocorrência.");
            return -1;
    }

    @Override
    public int contarOcorrencias(String elemento) {
        int quantidadeOcorrencias = 0;

        for (int i = 0; i < this.lista.length; i++){
            if (lista[i] != null && lista[i].equals(elemento)){
                quantidadeOcorrencias++;
            }
        }

        if (quantidadeOcorrencias > 0){
            System.out.println("Foram encontrados " + quantidadeOcorrencias + " ocorrências de "+ elemento);
        } else{
            System.out.println("Não há o elemento "+ elemento + " na lista");
        }
        return quantidadeOcorrencias;
    }

    @Override
    public int substituir(String antigo, String novo) {
        int quantidadeSubstituicao = 0;

        if (!estaVazio()) {
            for (int i = 0; i < this.lista.length; i++) {
                if (lista[i] != null && lista[i].equals(antigo)) {
                    this.lista[i] = novo;
                    quantidadeSubstituicao++;
                    System.out.println("Elemento " + antigo + " foi substituído para " + novo);
                }
            }
            if (quantidadeSubstituicao == 0){
                System.out.println("Elemento para substituição não encontrado!");
            }
        }
        System.out.println("Quantidade de substituições: " + quantidadeSubstituicao);
        return quantidadeSubstituicao;
    }
}

