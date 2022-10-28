public class Fila_n_Pilha implements IFila_n_Pilha {

    // criando os topos das pilhas
    public int topo1;
    public int topo2;

    // criando os starts (objetos a serem retirados nos 'pops'
    public int start1;
    public int start2;

    // criando o array
    public Object FilaP[];

    public Fila_n_Pilha(int sizeArray){
        this.FilaP = new Object[sizeArray];
        this.topo1 = -1; // topo da pilha1 = começo do array
        this.topo2 = sizeArray; // topo da pilha2 = "final do array" (no começo e dps topo--)

    }
    public void pushPilha1(Object elemento) {
        if (topo1 + 1 != topo2) {
            topo1++; // indo para próxima posição para depois inserir
            this.FilaP[topo1] = elemento; // agora sim inserindo
        }
        else {
            System.out.println("Pilha 1 chegou ao topo, hora de duplicar");
//            duplicaArray();
        }

    }

    public void pushPilha2(Object elemento) {
        if (topo2 - 1 == topo1) {
            System.out.println("Pilha 1 chegou ao topo, hora de duplicar");
//            duplicaArray();
        }
        topo2--; // indo para próxima posição para depois inserir
        this.FilaP[topo2] = elemento; // topo da pilha 2 é o final do array
    }

    public Object popPilha1() throws emptyQueueException {
        return null;
    }

    public Object popPilha2() throws emptyQueueException {
        return null;
    }

    public int sizePilha1() {
        return 0;
    }

    public int sizePilha2() {
        return 0;
    }

    public boolean isEmptyPilha1() {
        return false;
    }

    public boolean isEmptyPilha2() {
        return false;
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
