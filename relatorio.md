# Trabalho de Algoritmos e Programação

### 1 Análise da aula gravada

## Questão 1 - Por que utilizamos laços de repetição?

Utilizamos laços de repetição para executar uma mesma tarefa várias vezes, sem precisar escrever o mesmo código repetidamente. Isso facilita a programação, economiza tempo e deixa o código mais organizado.
Um exemplo apresentado na aula foi um programa que calcula o dobro de um número. Com o laço de repetição, podemos calcular vários números sem precisar iniciar o programa novamente a cada cálculo.

Referência da aula: 02:50 a 03:50 e 09:50 a 13:20.

## Questão 2 - Qual é a diferença entre while e do-while? Crie um exemplo em que essa diferença seja importante.

A diferença é que o while verifica a condição antes de executar o código. Se a condição for falsa desde o início, ele não executa nenhuma vez.
Já o do-while executa o código pelo menos uma vez, porque verifica a condição somente no final. 
Um exemplo seria um programa que pede um número ao usuário e calcula seu dobro. Com o do-while, o programa pode pedir o primeiro número antes de verificar se deve
continuar. Já no while, se a condição inicial for falsa, o programa nem chega a pedir o número.

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
O conceito lógico que permanece igual nas três linguagens é a repetição de instruções para percorrer elementos e realizar uma tarefa. Mesmo que a escrita do código seja
diferente, o objetivo e o raciocínio continuam os mesmos.

Referências da aula: 18:00 a 20:50 (Java), 27:30 a 28:20 (C#), 39:00 a 41:20 (Rust) e 58:55 a 59:00 (conclusão).



## 2 Leitura em relação com o livro 

## Questão 1 - Como os elementos de um array são organizados e acessados?

Os elementos de um array são organizados em sequência, ocupando posições consecutivas na memória. Cada elemento possui um índice, começando pelo 0. Por exemplo, se colocarmos o Cruzeiro como primeiro time, ele terá o índice 0, e assim sucessivamente. Para acessar um elemento específico, basta utilizar o índice da posição em que ele se encontra.

“Arrays e listas encadeadas”, “Arrays” e “Terminologia”	49–55

## Questão 2 - Como os elementos de uma lista encadeada são organizados? Apresentem um desenho simples.

Os elementos de uma lista encadeada são organizados em uma sequência, em que cada elemento guarda uma referência para o próximo. Diferentemente de um array, eles não precisam estar armazenados em posições consecutivas da memória. Para encontrar um elemento, precisamos seguir as referências a partir do primeiro.

Atlético-MG → Cruzeiro → América-MG → Villa Nova

As setas representam as referências que ligam um elemento ao próximo.

“Listas encadeadas”	51–54

## Questão 3 - Por que inserir ou excluir elementos pode exigir operações diferentes nessas duas estruturas?

Inserir ou excluir elementos pode exigir operações diferentes porque, em um array, pode ser necessário deslocar os elementos para outras posições. Por exemplo, ao inserir o Tombense entre Cruzeiro e América-MG, precisamos abrir espaço para ele, deslocando os times seguintes. Já em uma lista encadeada, podemos alterar as referências entre os elementos, sem precisar deslocar os outros.

“Inserindo algo no meio da lista” e “Deleções”	55–58

## Questão 4 - Uma coleção chamada “lista” em uma linguagem é necessariamente uma lista encadeada?

Não. Uma coleção chamada lista não é necessariamente uma lista encadeada, pois ela pode ser baseada em um array e permitir o acesso aos elementos por índices. Por exemplo, a List<string> do C# e o Vec<String> do Rust são estruturas baseadas em arrays dinâmicos. Elas permitem adicionar novos elementos e aumentar de tamanho conforme necessário, sem precisar criar manualmente outro array.

Comparação com arrays e listas encadeadas	49–58

## Questão 5 - Para guardar os times e percorrê-los repetidamente, quais vantagens vocês identificam em uma estrutura baseada em array?

Uma estrutura baseada em array torna mais prático acessar e percorrer os times por índices, sem precisar seguir as referências dos elementos anteriores, como em uma lista encadeada. Isso facilita a utilização dos laços de repetição para analisar os times e gerar os confrontos do campeonato.

“Arrays” e “Terminologia”	53–55

## 3 - Desafio prático — Gerador de confrontos

Explicação do código em Java

O programa em Java utiliza um array para armazenar quatro times de futebol. O método mostrarTimes exibe os times e seus índices. Para gerar os confrontos, usamos dois laços for: um escolhe o mandante e o outro, o visitante.
A condição if (i != j) impede que um time jogue contra ele mesmo, gerando 12 confrontos de ida e volta. Já if (i < j) evita confrontos repetidos, gerando 6 jogos de turno único.
O programa também utiliza contadores para mostrar o total de confrontos. Para adicionar o Tombense, criamos um array maior e copiamos os times anteriores, pois os arrays em Java possuem tamanho fixo.

Com cinco times, o programa passa a gerar 20 confrontos de ida e volta e 10 de turno único, reutilizando os mesmos métodos.

<img width="852" height="804" alt="image" src="https://github.com/user-attachments/assets/da99cb31-991f-4fe4-a11b-aaf8f7ef35f5" />

<img width="836" height="762" alt="image" src="https://github.com/user-attachments/assets/86f46554-cf63-46dc-a7fc-cf647546fc60" />

<img width="877" height="819" alt="image" src="https://github.com/user-attachments/assets/c1b47e97-b0b1-40ab-95c8-28a77928ff65" />

<img width="872" height="803" alt="image" src="https://github.com/user-attachments/assets/345f358f-a849-4b8e-bcc5-bd5215bbbe8e" />

<img width="818" height="798" alt="image" src="https://github.com/user-attachments/assets/ad2aa9d5-732b-4715-a58d-caad6b28ea2d" />

<img width="894" height="777" alt="image" src="https://github.com/user-attachments/assets/a45af25d-1784-4efc-9bc3-2b7e88e19252" />







