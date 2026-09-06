public class App {
    public static void main(String[] args) throws Exception {
        NumeroComplexo meuNumeroComplexo = new NumeroComplexo(-2, -3);
        System.out.println(meuNumeroComplexo.somar(-1, 4));
        System.out.println(meuNumeroComplexo.subtrair(-1, 4));
        System.out.println(meuNumeroComplexo.multiplicar(-1, 4));
        System.out.println(meuNumeroComplexo.dividir(-1, 4));
    }
}
