public class ListaDinamica implements ListaOperacoes{
    No inicio;

    public ListaDinamica() {
        this.inicio = new No(null);
        System.out.println("Lista dinâmica criada.");
    }

    public ListaDinamica(No inicio) {
        this.inicio = inicio;
    }

    public void adicionarElemento(String conteudo) {
        if(!this.existeInicio()) {
            this.inicio.setConteudo(conteudo);
        } else {
            No novoNo = new No(conteudo);
            No aux = this.inicio;
            while(aux.getProx() != null) {
                aux = aux.getProx();
            }
            aux.setProx(novoNo);
        }
    }

    private boolean existeInicio() {
        if(this.inicio.getConteudo() == null) {
            return false;
        } else {
            return true;
        }
    }

    public void exibirElementos() {
        if(existeInicio()) {
            No aux = this.inicio;
            while(aux.getProx() != null) {
                System.out.println(aux.getConteudo());
                aux = aux.getProx();
            }
            System.out.println(aux.getConteudo());
        } else {
            System.out.println("Não existem elementos na Lista Dinâmica.");
        }
    }

    public boolean buscarElemento(String elemento) {
        No aux = this.inicio;

        do {
            if(aux.getConteudo().equals(elemento)) {
                System.out.println("Elemento " + elemento + " encontrado.");
                return true;
            }
            aux = aux.getProx();
        } while(aux != null);
        System.out.println("Elemento " + elemento + " não encontrado!");
        return false;
    }

    @Override
    public int removerTodas(String elemento) {
        int quantidadeElementosRemovidos = 0;

        if (existeInicio()) {

            // remover todos os elementos no início
            while (inicio != null && inicio.getConteudo().equals(elemento)) {
                inicio = inicio.getProx();
                quantidadeElementosRemovidos++;
            }

            No auxiliar = inicio;

            // percorrer restante da lista
            while (auxiliar != null && auxiliar.getProx() != null) {

                if (auxiliar.getProx().getConteudo().equals(elemento)) {
                    auxiliar.setProx(auxiliar.getProx().getProx());
                    quantidadeElementosRemovidos++;
                } else {
                    auxiliar = auxiliar.getProx();
                }

            }
        }

        System.out.println("Total de elementos removidos: " + quantidadeElementosRemovidos);
        return quantidadeElementosRemovidos;
    }

    @Override
    public int contar() {
        int elementosArmazenados = 0;

        No auxiliar = inicio;

        while (auxiliar.getProx() != null){
            if (auxiliar.getConteudo() != null){
                elementosArmazenados++;
                auxiliar = auxiliar.getProx();
            }
        }
        if (auxiliar.getConteudo() != null && auxiliar.getProx() == null){
            elementosArmazenados++;
        }

        System.out.println("Total de elementos armazenados na lista: "+ elementosArmazenados);
        return elementosArmazenados;
    }

    /**
     * Adiciona múltiplos elementos à lista.
     *
     * No caso da lista baseada em vetor, deve respeitar o limite
     * de capacidade. Caso não haja espaço suficiente, apenas os
     * elementos possíveis deverão ser adicionados.
     *
     * @param elementos Vetor de Strings contendo os elementos a serem adicionados.
     * @return Quantidade de elementos que foram realmente adicionados.
     */

    @Override
    public int adicionarVarios(String[] elementos) {
        if (existeInicio()){

        }
        return 0;
    }

    @Override
    public String obter(int indice) {
        No auxiliar = inicio;
        int contador;

        if (indice < 0){
            System.out.println("Índice inválido!");
            return null;
        }

        for (contador = 0; contador <= indice; contador++){
            if (contador == indice){
                System.out.println("No índice " + indice + " está o elemento " + auxiliar.getConteudo());
            } else {
                if (auxiliar == null || auxiliar.getProx() == null){
                    System.out.println("Índice informado inválido!");
                    return null;
                } else {
                    auxiliar = auxiliar.getProx();
                }
            }
        }
        return auxiliar.getConteudo();
    }


    @Override
    public boolean inserir(int indice, String elemento) {
        No auxiliar = inicio;
        No novo = new No(elemento);
        int contador;

        if (indice < 0){
            System.out.println("Índice inválido!");
            return false;
        }

        // se for o indice 0, muda o inicio
        if (indice == 0){

            novo.setProx(inicio);
            inicio = novo;

            System.out.println("Elemento " + elemento + " inserido na posição " + indice);
            return true;
        } else {
            for (contador = 0; contador <= indice; contador++){
                if (contador == indice-1){

                    novo.setProx(auxiliar.getProx());
                    auxiliar.setProx(novo);

                    System.out.println("Elemento " + elemento + " inserido na posição " + indice);

                    return true;
                } else {
                    if (auxiliar == null || auxiliar.getProx() == null){
                        System.out.println("Índice informado inválido!");
                        return false;
                    } else {
                        auxiliar = auxiliar.getProx();
                    }
                }
            }

        }
        return false;
    }

    @Override
    public String removerPorIndice(int indice) {
        No auxiliar = inicio;
        int contador;
        String elementoRemovido;

        if (indice < 0){
            System.out.println("Índice inválido!");
            return null;
        }

        // se for o indice 0, muda o inicio
        if (indice == 0){

            elementoRemovido = inicio.getConteudo();
            inicio = inicio.getProx();
            System.out.println("Elemento " + elementoRemovido + " removido da posição " + indice);

            return elementoRemovido;
        } else {
            for (contador = 0; contador <= indice; contador++){
                if (contador == indice-1){
                    if (auxiliar.getProx() != null){
                        elementoRemovido = auxiliar.getConteudo();
                        auxiliar.setProx(auxiliar.getProx().getProx());
                    } else {
                        System.out.println("Valor inválido!");
                        return null;
                    }

                    System.out.println("Elemento " + elementoRemovido + " inserido na posição " + indice);

                    return elementoRemovido;
                } else {
                    if (auxiliar == null || auxiliar.getProx() == null){
                        System.out.println("Índice informado inválido!");
                        return null;
                    } else {
                        auxiliar = auxiliar.getProx();
                    }
                }
            }
            }
        return null;
    }

    @Override
    public void limpar() {

        if (existeInicio()){
            inicio.setConteudo(null);
            inicio.setProx(null);
        } else {
            System.out.println("Lista já está vazia!");
        }
    }

    @Override
    public int ultimoIndiceDe(String elemento) {
        No auxiliar = inicio;
        int indice = 0;
        int ultimaOcorrencia = -1;

        if (existeInicio()){
            while (auxiliar != null){
                if (auxiliar.getConteudo().equals(elemento)){
                    ultimaOcorrencia = indice;
                }
                indice++;
                auxiliar = auxiliar.getProx();
            }
        }
        if (ultimaOcorrencia == -1){
            System.out.println("Não foi possível encontrar a última ocorrência!");
        } else {
            System.out.println("A última ocorrência do elemento " + elemento + " é a posição " + ultimaOcorrencia);
        }
        return ultimaOcorrencia;
    }

    @Override
    public int contarOcorrencias(String elemento) {
        No auxiliar = inicio;
        int quantidadeOcorrencias = 0;

        if (existeInicio()){
            do {
                if (auxiliar.getConteudo().equals(elemento)) {
                    quantidadeOcorrencias++;
                }
                auxiliar = auxiliar.getProx();
            } while (auxiliar != null);
        }

        System.out.println("O elemento " + elemento + " aparece " + quantidadeOcorrencias + " vez(es) na lista.");
        return quantidadeOcorrencias;
    }

    @Override
    public int substituir(String antigo, String novo) {
        No auxiliar = inicio;
        int quatidadeSubstituicao = 0;

        if (existeInicio()){
            do {
                if (auxiliar.getConteudo().equals(antigo)) {
                    auxiliar.setConteudo(novo);
                    quatidadeSubstituicao++;
                }
                auxiliar = auxiliar.getProx();
            } while (auxiliar != null);
        } else {
        System.out.println("Elemento " + antigo + " não encontrado!");
    }
        System.out.println("Substituindo " + antigo + " por " + novo + ".");
        System.out.println("Quantidade total de substituições: " + quatidadeSubstituicao);
        return quatidadeSubstituicao;
    }
}
