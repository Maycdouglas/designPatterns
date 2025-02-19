# FACTORY METHOD

![FactoryMethod drawio](https://github.com/user-attachments/assets/ab9bb616-f21f-46b7-b8bd-481fbd1fed1b)


### DEFINIÇÃO
O padrão **Factory Method** é um padrão de criação que fornece uma interface para criar objetos em uma surperclasse, permitindo que as subclasses alterem o tipo de objetos que serão criados. Ele ajuda a desacoplar o código que cria objetos do código que os utiliza.

### VANTAGENS
- Desacoplamento
  - O código cliente não depende de classes concretas, mas apenas de abstrações. Isso reduz o acoplamento entre as partes do sistema
- Extensibilidade
  - É fácil adicionar novos tipos de produtos (objetos) ao sistema. Basta criar uma nova subclasse que implemente o método de criação.
- Princípios de Design
  - Segue o Princípio da Substituição de Liskov (LSP), permitindo que subclasses sejam usadas de forma intercambiável com suas superclasses.
  - Adere ao Princípio Aberto/Fechado: o código está aberto para extensão, mas fechado para modificação.
- Reutilização de código
  - O código de criação de objetos pode ser isolado em uma fábrica e reutilizado em diferentes partes do sistema.
- Facilidade de Testes
  - Testar o cliente é mais fácil, pois você pode usar fábricas simuladas (mocks) para criar objetos.
### DESVANTAGENS
- Complexidade Adicional
  - Adicionar uma hierarquia de classes para as fábricas e os produtos pode complicar o design, especialmente em sistemas simples.
- Sobrecarga de código
  - Para cada novo tipo de produto, é necessário criar uma nova classe de fábrica, o que pode levar a um número elevado de classes.
- Menor Visibilidade
  - O fluxo de execução pode se tornar menos óbvio, porque a criação de objetos está oculta em fábricas.
- Risco de Subclasses Mal Planejadas
  - O uso inadequado do padrão pode levar a designs onde há muitas subclasses que não fazem muito além de criar um único tipo de objeto.
### QUANDO USAR O FACTORY METHOD
- Necessidade de Extensibilidade
  - Quando você precisa criar objetos e prevê que novos tipos poderão ser adicionados no futuro.
- Desacoplamento
  - Quando deseja separar a lógica de criação de objetos do código que os utiliza.
- Polimorfismo
  - Quando diferentes implementações de um mesmo produto precisam ser criadas dinamicamente, sem que o cliente saiba sobre os detalhes.
### PASSO A PASSO
1) Criar uma `Interface` ou `Classe Abstrata`
2) Criar uma `Classe` que será a nossa `fábrica`. Ela deve possuir um `método static`, ou seja, um método que para ser utilizado não precisa instanciar um objeto daquela classe, basta usar o próprio nome da classe
3) Criar as classes que deseja sendo implementadas a partir da `Interface` ou `Classe Abstrata` criada no **passo 1**.
4) Para usar, deve-se criar um `objeto` a partir da `Interface` ou `Classe Abstrata`, porém ao invés de usar o `NEW`, essa variável receberá o retorno do `método Static` da `classe FACTORY`

### OBVERVAÇÕES
- Originalmente existiria classes que herdam da `ProcessedFoodFactory` e ela seria uma `classe Abstrata`. Assim, a criação do `Chocolate` e `Snack` seriam por lá. Entretanto, no `JAVA` é possível criar uma classe diretamente dessa classe, enviando como parâmetro o nome da classe e não sendo necessária a utilização de `IF/ELSE`.