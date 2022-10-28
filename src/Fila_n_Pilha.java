public class Fila_n_Pilha implements IFila_n_Pilha {
    // junção dos métodos da pilha com a fila
    // FIFO, duplicação de tamanho de array, sem método circular porque não faz sentido para mim e não estava escrito no enunciado

    // criando os topos das pilhas
    public int topo1;
    public int topo2;

    // criando os starts (objetos a serem retirados nos 'pops'
    public int start1 = 0;
    public int start2;

    // criando o array
    public Object FilaP[];

    public Fila_n_Pilha(int sizeArray){
        this.FilaP = new Object[sizeArray];
        this.topo1 = -1; // topo da pilha1 = começo do array
        this.topo2 = sizeArray; // topo da pilha2 = "final do array" (no começo e dps topo--)
        this.start2 = sizeArray - 1;

    }
    public void pushPilha1(Object elemento) {
        if (topo1 + 1 != topo2) {
            topo1++; // indo para próxima posição para depois inserir
            this.FilaP[topo1] = elemento; // agora inserindo
        }
        else {
            System.out.println("Pilha 1 chegou ao topo, hora de duplicar");
            duplicaArray();
        }

    }
    public void pushPilha2(Object elemento) {
        if (topo2 - 1 == topo1) {
            System.out.println("Pilha 2 chegou ao topo, hora de duplicar");
            duplicaArray();
        }
            topo2--; // indo para próxima posição para depois inserir
            this.FilaP[topo2] = elemento; // topo da pilha 2 é o final do array
    }
    public Object popPilha1() throws emptyQueueException {
        // já que o 'pop' ficou com o start é necessário checar se o começo n é igual ao final da outra pilha
        if (start1 == topo2){ // if isEmpty
            throw new emptyQueueException("Não foi possível remover nenhum elemento pois a pilha 1 está vazia");
        }
        // substitui o elemento removido por 'null' só para ficar fácil a visualização
        // e como é uma "fila pilha" vai remover o primeiro elemento e não o último
        this.FilaP[start1] = null;
        this.start1 = start1 + 1; // andando uma "casa" para frente ter um novo start
        return FilaP;
    }

    public Object popPilha2() throws emptyQueueException {
        // já que o 'pop' ficou com o start é necessário checar se o começo n é igual ao final da outra pilha
        if (start2 == topo1 ){ // if isEmpty
            throw new emptyQueueException("Não foi possível remover nenhum elemento pois a pilha 2 está vazia");
        }
        // substitui o elemento removido por 'null' só para ficar fácil a visualização
        // e como é uma "fila pilha" vai remover o primeiro elemento e não o último
        this.FilaP[start2] = null;
        this.start2--; // andando uma "casa" para trás ter um novo start
        return FilaP;
    }

    public void topPilha1() {
        System.out.println(this.topo1 + 1);
    }

    public void topPilha2() {
        System.out.println(this.topo2 + 1);
    }

    // duplicando o array quando as pilhas estiverem cheias
    private void duplicaArray(){
        int novoSize = this.FilaP.length * 2;
        Object novoArray[] = new Object[novoSize];

        // copiar elementos da pilha 1
        for(int i=0; i<=this.topo1; i++){
            novoArray[i] = this.FilaP[i];
        }
        novoSize--;
        // copiar elementos da pilha 2
        for(int i=this.FilaP.length - 1; i>=this.topo2; i--){
            novoArray[novoSize--] = this.FilaP[i];
        }
        this.FilaP = novoArray; // FilaP agora com o novo tamanho
        this.topo2 = novoSize + 1; // topo 2 começando no fina do array (resetando o topo 2)
        // não sei exatamente o porquê do "+ 1" porem sem isso ele fica dando uns null aleatório no meio da pilha 2
    }

    // escrever o array com os elementos das pilhas
    @Override
    public String toString() {
        String saida = "[ ";
        for (Object elemento : this.FilaP) {
            saida += String.format("%s, ", elemento);
        }
        saida += "]";
        return saida;
    }
}
