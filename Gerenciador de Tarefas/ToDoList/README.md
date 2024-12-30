## Resumo do Projeto: Gerenciador de Tarefas em Java
O objetivo foi criar um programa simples em Java que permite gerenciar tarefas (adicionar, listar e atualizar o status). Aqui estão os passos de forma resumida:

### Estrutura do Projeto
O projeto contém 3 principais componentes:

Classe Tarefa:
- Representa uma tarefa com os atributos:
- id: Identificador único.
- titulo: Nome da tarefa.
- descricao: Detalhe sobre a tarefa.
- concluida: Indica se a tarefa está concluída (true/false).
- Contém métodos para:
- Obter e atualizar os atributos.
- Um toString() para exibir a tarefa de forma legível.

Classe GerenciadorDeTarefas:
- Gerencia as tarefas usando uma ArrayList.
- Métodos principais:
- adicionarTarefa(String titulo, String descricao): Adiciona uma tarefa à lista.
- listarTarefas(): Exibe todas as tarefas (concluídas ou pendentes).
- atualizarTarefa(int id): Atualiza o status da tarefa entre "Pendente" e "Concluída".

 Classe Main:
- Controla o fluxo do programa.
- Mostra um menu interativo que permite o usuário:
- Adicionar tarefas.
- Listar tarefas.
- Atualizar o status de uma tarefa (Pendente/Concluída).

### Como o Programa Funciona:
1. Adicionar Tarefa (Opção 1):
Insira um título e uma descrição. A tarefa será salva e marcada como "Pendente".

2.Listar Tarefas (Opção 2):
Exibe todas as tarefas no formato:

3.Atualizar Tarefa (Opção 3):
Escolha o ID da tarefa para alternar seu status entre "Pendente" e "Concluída".

4.Sair (Opção 0): 
encerra o programa


### Exemplo de Execução:
== Gerenciador de Tarefas ==
1. Adicionar Tarefa
2. Listar Tarefas
3. Atualizar Tarefa
0. Sair
Escolha uma opção: 1
Título: Estudar Java
Descrição: Aprender o básico de programação orientada a objetos
Tarefa adicionada!

Escolha uma opção: 2
1 - Estudar Java [Pendente]

Escolha uma opção: 3
ID da tarefa para atualizar: 1
Status da tarefa atualizado!

Escolha uma opção: 2
1 - Estudar Java [Concluída]

Escolha uma opção: 0
Saindo...
