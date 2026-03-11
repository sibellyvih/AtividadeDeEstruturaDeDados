public class ListaDinamica implements ListaOperacoes{
    No inicio;

    public ListaDinamica() {
        this.inicio = new No(null);
        System.out.println("Lista dinâmica criada.");
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
        return 0;
    }

    @Override
    public int adicionarVarios(String[] elementos) {
        return 0;
    }

    @Override
    public String obter(int indice) {
        return "";
    }

    @Override
    public boolean inserir(int indice, String elemento) {
        return false;
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
