public class TestFila_n_Pilha {
    public static void main(String[] args) {
        Fila_n_Pilha FilaP = new Fila_n_Pilha(6);
        //inserir elementos na pilha 1
        FilaP.pushPilha1("pilha1-1");
        FilaP.pushPilha1("pilha1-2");
        FilaP.pushPilha1("pilha1-3");


        // inserir elementos na pilha 2
        FilaP.pushPilha2("pilha2-1");
        FilaP.pushPilha2("pilha2-2");
        FilaP.pushPilha2("pilha2-3");

        // mostrar o array com elementos
        System.out.println(FilaP);
    }
}
