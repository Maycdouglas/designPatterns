# SINGLETON

### DEFINIÇÃO
O padrão Singleton é um padrão de projeto de criação que garante que uma classe tenha apenas uma única instância em todo o sistema e fornece um ponto de global de acesso a essa instância.

### VANTAGENS
- Controle global
    - Garante um ponto único de acesso ao sistema.
- Economia de recursos
    - Reduz o consumo de memória, já que apenas uma instância é criada.
- Consistência
    - Mantém o estado compartilhado de maneira centralizada.
- Fácil de implementar
    - é relativamente simples criar e usar.
### DESVANTAGENS
- Dificuldade em testes unitários
    - Pode dificultar a criação de testes, pois introduz dependências globais e dificulta o uso de mocks.
- Possível acoplamento
    - O uso excessivo pode levar a um código fortemente acoplado.
- Problemas em ambientes multithread
    - Sem uma implementação adequada, pode haver problemas de concorrência ao criar a instância.
### CARACTERÍSTICAS DO SINGLETON
- Única instância
  - A classe garante que apenas uma instância será criada durante a execução do programa.
- Controle global de acesso
  - Fornece um método estático para acessar a instância única.
- Conexão com recursos compartilhados
  - Ideal para gerenciar conexões a bancos de dados, gerenciadores de configuração, ou sistemas que devem ser únicos por natureza.
### QUANDO USAR O SINGLETON
- Gerenciamento de Recursos Compartilhados
    - Quando há um recurso único que precisa ser compartilhado entre várias partes do sistema.
    - Exemplo: 
      - Gerenciamento de conexão com banco de dados, que garante que apenas uma instância controla as conexões.
- Controle Global de Acesso
    - Quando um componente precisa ser acessado de qualquer lugar do sistema, mas você quer arantir que haja uma única instância.
    - Exemplo:
      - Um registrador de logs(logger) que coleta mensagens de diferentes partes do sistema.
- Configuração Centralizada
    - Quando há configurações globais ou estados que precisam ser consistentes em toda a aplicação.
    - Exemplo:
      - Um sistema de configuração que armazena propriedades como URL de APIs, chaves de autenticação, etc.
- Gerenciamento de Cache
  - Quando você precisa manter dados armazenados temporariamente e garantir que eles sejam acessíveis de forma consistente.
  - Exemplo:
    - Um cache compartilhado para armazenar resultados de consultas a banco de dados.
- Coordenador de Subsistemas
  - Quando é necessário um componente único para coordenar ações entre diferentes subsistemas
  - Exemplo:
    - Um gerenciador de fila em um sistema de mensagens.
- Ambientes Multithread ou Distribuídos
  - Quando você precisa evitar múltiplas instâncias em cenários paralelos ou distribuídos.
  - Exemplo:
    - Em sistemas de microserviços, para gerenciar um ID de sessão global ou uma instância única de serviços.
### PASSO A PASSO
1) --
2) --
3) --
4) --