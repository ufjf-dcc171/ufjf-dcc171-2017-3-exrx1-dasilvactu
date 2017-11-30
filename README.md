Marcus Vinicius da Silva - 201365178C - Ciência da Computação

Trabalho 02 - Persistência de Dados em Arquivo Texto

Protocolo de Persistência de Arquivo: 

Registro de Mesas, Pedidos e Itens

1 Linha do arquivo: Quantidade de Mesas Existentes

2 Linha do arquivo: Identificador da Mesa 1

3 Linha do arquivo: Quantidade de Pedidos

4 Linha do arquivo: Idenficação do Pedido na forma : ID Data_inicio Hora_inicio Status Data_fim Hora_fim

5 Linha do arquivo: Quantidade de Itens

6 Linha do arquivo: Identificação do primeiro Item na forma: Nome Quantidade Preço


A sequência é repetida a partir daí com o controle de leitura a partir das quantidades Me mesa, Pedidos da Mesa e Itens do Pedido


Pontos de Melhoria: Adicionar acesso aleatório ao arquivo, para escrita em determinada linha, evitando escrever e 
ler tudo cada vez que uma mudança é feita nos dados.
