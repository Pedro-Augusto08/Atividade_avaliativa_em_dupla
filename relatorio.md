# Trabalho de Algoritmos e Programação

### Análise da aula gravada

## Questão 1 - Por que utilizamos laços de repetição?

Utilizamos laços de repetição para executar uma mesma tarefa várias vezes, sem precisar escrever o mesmo código repetidamente. Isso facilita a programação, economiza tempo e deixa o código mais organizado.
Um exemplo apresentado na aula foi um programa que calcula o dobro de um número. Com o laço de repetição, podemos calcular vários números sem precisar iniciar o programa novamente a cada cálculo.

Referência da aula: 02:50 a 03:50 e 09:50 a 13:20.

## Questão 2 - Qual é a diferença entre while e do-while? Crie um exemplo em que essa diferença seja importante.

A diferença é que o while verifica a condição antes de executar o código. Se a condição for falsa desde o início, ele não executa nenhuma vez.
Já o do-while executa o código pelo menos uma vez, porque verifica a condição somente no final. 
Um exemplo seria um programa que pede um número ao usuário e calcula seu dobro. Com o do-while, o programa pode pedir o primeiro número antes de verificar se deve continuar. Já no while, se a condição inicial for falsa, o programa nem chega a pedir o número.

Referência da aula: 14:00 a 16:00.

## Questão 3 - No exemplo dos times em C#, por que são necessários dois laços?

São necessários dois laços porque precisamos comparar cada time com todos os outros times da lista.
O primeiro laço escolhe o time mandante e o segundo percorre os possíveis adversários.
Por exemplo, quando o primeiro laço seleciona o Atlético-MG, o segundo percorre a lista para formar os confrontos contra Cruzeiro, América-MG e Villa Nova.
Dessa forma, conseguimos gerar todos os confrontos utilizando dois laços de repetição.

Referência da aula: 31:00 a 33:00.

## Questão 4 - Qual é a função do if que impede confrontos de um time contra ele mesmo?

A função do if é verificar se os dois times são diferentes antes de mostrar o confronto.
Quando utilizamos dois laços, o programa também pode formar jogos de um time contra ele mesmo, como Atlético-MG x Atlético-MG.
Para evitar isso, utilizamos a condição if (i != j), que verifica se os índices dos times são diferentes.
Assim, o programa mostra apenas os confrontos entre times diferentes.

Referência da aula: 34:00 a 35:10.

## Questão 5 - Comparando Java, C# e Rust, indique duas diferenças de sintaxe e um conceito lógico que permanece igual.

A primeira diferença está na forma de escrever os laços de repetição. Em Java e C#, podemos utilizar o for com uma variável de controle, enquanto em Rust o professor mostrou o for in, que permite percorrer os elementos de uma coleção de maneira mais simples.
A segunda diferença está na forma de trabalhar com as coleções. No exemplo de C#, o professor utiliza uma lista de strings e a propriedade Count para consultar a quantidade de elementos. Já em Rust, ele mostra uma coleção sendo percorrida diretamente pelo for in.
O conceito lógico que permanece igual nas três linguagens é a repetição de instruções para percorrer elementos e realizar uma tarefa. Mesmo que a escrita do código seja diferente, o objetivo e o raciocínio continuam os mesmos.

Referências da aula: 18:00 a 20:50 (Java), 27:30 a 28:20 (C#), 39:00 a 41:20 (Rust) e 58:55 a 59:00 (conclusão).
