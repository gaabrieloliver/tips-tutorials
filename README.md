# Casting
Na linguagem Java, é possível se atribuir o valor de um tipo de variável a outro tipo de variável, 
porém para tal é necessário que esta operação seja apontada ao compilador. A este apontamento damos o nome de casting.

É possível fazer conversões de tipos de ponto flutuante para inteiros, e inclusive entre o tipo caractere, 
porém estas conversões podem ocasionar a perda de valores, quando se molda um tipo de maior tamanho, como um double dentro de um int.


> ## O tipo de dado boolean é o único tipo primitivo que não suporta casting.
Segue abaixo uma tabela com todos os tipos de casting possíveis:

![image](https://user-images.githubusercontent.com/74208625/155878174-c1898f0b-2789-4f14-9eea-cf0c5f0a3337.png)

Para fazer um casting, basta sinalizar o tipo para o qual se deseja converter entre parênteses, da seguinte forma:

```~~~java

//Conversão do double 5.0 para float.
float a  = (float) 5.0;

//Conversão de double para int.
int b = (int) 5.1987;

//Conversão de int para float é implícito, não precisa de casting.
float c = 100;

//Conversão de char para int é implícito, não precisa de casting.
int d = 'd';
```

O casting ocorre implicitamente quando adiciona uma variável de um tipo menor que o tipo que receberá esse valor.

Exemplo:
```~~~java
/**
 * Exemplo de conversão de tipos primitivos utilizando casting.
 */
public class ExemploCasting {
  public static void main(String[] args) {
    /* Casting feito implicitamente, pois o valor possui um
       tamanho menor que o tipo da variavel que irá recebe-lo. */
    char a = 'a';
    int b = 'b';
    float c = 100;

    System.out.println(a); //Imprime a
    System.out.println(b); //Imprime 98
    System.out.println(c); //Imprime 100.0
    
    /* Casting feito explicitamente, pois o valor possui um tamanho
       maior que o tipo da variavel que irá recebe-lo. */
    int d = (int) 5.1987;
    float e  = (float) 5.0;
    int f = (char) (a + 5);
    char g = (char) 110.5;

    System.out.println(d); //Imprime 5
    System.out.println(e); //Imprime 5.0
    System.out.println(f); //Imprime 102
    System.out.println(g); //Imprime n
  }
}
```
Quando executamos a classe ExemploCasting temos a seguinte saída no console:
```~~~java
a
98
100.0
5
5.0
102
n
```

[Fonte](http://www.universidadejava.com.br/materiais/java-casting-tipos-primitivos/)


