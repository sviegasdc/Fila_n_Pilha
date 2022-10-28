public class TestFila_n_Pilha {
    public static void main(String[] args) {
        Fila_n_Pilha FilaP = new Fila_n_Pilha(6);
        //inserir elementos na pilha 1
        FilaP.pushPilha1("pilha1-1");
        FilaP.pushPilha1("pilha1-2");
        FilaP.pushPilha1("pilha1-3");

        System.out.println(FilaP);

        // inserir elementos na pilha 2
        FilaP.pushPilha2("pilha2-1");
        FilaP.pushPilha2("pilha2-2");
        FilaP.pushPilha2("pilha2-3");
        FilaP.pushPilha2("pilha2-4");
//        FilaP.pushPilha2("pilha2-5");
//        FilaP.pushPilha2("pilha2-6");
//        FilaP.pushPilha2("pilha2-7");
//        FilaP.pushPilha2("pilha2-8");
//        FilaP.pushPilha2("pilha2-9");
//        FilaP.pushPilha2("pilha2-10");

        System.out.println(FilaP);

        // deletar elementos da pilha 1
//      FilaP.popPilha1();
//      FilaP.popPilha1();
//      FilaP.popPilha1();
        // causando a exceção de pilha vazia
//       FilaP.popPilha1();

//
//        System.out.println(FilaP);
        // deletar elementos da pilha 2
//        FilaP.popPilha2();
//        FilaP.popPilha2();
//        FilaP.popPilha2();
        // causando a exceção de pilha vazia
//        FilaP.popPilha2();


        // mostrar o array com elementos
//        System.out.println(FilaP);

        // tamanho dos topos
        FilaP.topPilha1();
        FilaP.topPilha2();

    }
}
