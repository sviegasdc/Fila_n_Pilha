public interface IFila_n_Pilha {
    // 'push' das pilhas
    public void pushPilha1(Object elemento);

    public void pushPilha2(Object elemento);

    // ‘pop’ das pilhas (FIFO)
    public Object popPilha1() throws emptyQueueException;

    public Object popPilha2() throws emptyQueueException;

    // tamanho das pilhas
    public int sizePilha1();

    public int sizePilha2();

    // checagem de pilhas vazias
    public boolean isEmptyPilha1();

    public boolean isEmptyPilha2();

}
