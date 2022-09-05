public class MyThread extends Thread {
    private int id;
    private static int indice = 0;

    public MyThread(int id) {
        this.id = id;
    }

    /**
     * Imprime na tela a variável compartilhada (static) indice, que varia
     * de 0 até 5 juntamente com o id da thread que está executando.
     * 
     * Exemplifica um probelam de race, ou seja, suas threads competindo
     * pela manipulação da mesma variável.
     */
    @Override
    public void run() {
        for (; indice <= 5; indice++) {
            System.out.println(indice + " from thread " + id);
        }
    }
}