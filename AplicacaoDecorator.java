package io.desafios; // Define o pacote onde a classe está localizada

import java.io.FilterWriter; // Classe que permite decorar outro Writer
import java.io.Writer;       // Interface base para escrita de caracteres
import java.io.IOException;  // Exceção para operações de entrada/saída

/**
 * Classe que implementa um Writer decorador.
 * Ela intercepta o texto antes de ser escrito e o transforma em maiúsculas.
 * Demonstra o uso do padrão Decorator em Java I/O.
 */
public class UpperCaseWriter extends FilterWriter {

    /**
     * Construtor que recebe o Writer original (decorado).
     * @param out Writer base que será decorado com a funcionalidade de caixa alta.
     */
    public UpperCaseWriter(Writer out) {
        super(out); // Chama o construtor da superclasse FilterWriter
    }

    /**
     * Sobrescreve o método write(String) para interceptar e modificar o conteúdo.
     * @param str A string original a ser escrita.
     * @throws IOException Caso ocorra erro na escrita.
     */
    @Override
    public void write(String str) throws IOException {
        // Converte a string para letras maiúsculas
        String upperCaseStr = str.toUpperCase();

        // Chama o método write da superclasse, que escreve no Writer original
        // Especifica o início (0) e o comprimento da string
        super.write(upperCaseStr, 0, upperCaseStr.length());
    }

    // Observação: Para um filtro completo, seria interessante sobrescrever também
    // write(char[]), write(int), write(char[], int, int), etc.
}
