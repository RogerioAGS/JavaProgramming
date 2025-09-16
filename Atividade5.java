public class Atividade5 {
    public static void main(String[] args) {
        boolean estudanteAprovado = true;
        boolean temAtestado = false;

        boolean condicao1 = estudanteAprovado && !temAtestado;
        System.out.println("Ele foi Aprovado E não tem atestado: " +condicao1);

        boolean condicao2 = estudanteAprovado || temAtestado;
        System.err.println("Ele foi Aprovado OU tem atestado: " + condicao2);

        boolean condicao3 = !estudanteAprovado;
        System.err.println ("Ele Não foi aprovado: "+condicao3);
    }
}
