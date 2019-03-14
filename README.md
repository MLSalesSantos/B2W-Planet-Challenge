# B2W-Planet-Challenge
### API Challenge Stars Wars B2W

## Especificando uma base de dados
- MongoDB (https://www.mongodb.com/) instalado e rodando, para correta execução da aplicação.
- versão so MongoDB 1.17.0

- Para cada planeta inserido mostra a quantidade de aparições em filmes, obtidas pela API pública do Star Wars: https://swapi.co/

- A aplicação, em sua primeira inicialização de todas, estará com a base de dados completamente zerada.
- O usuário possui as opções:
 - Listagem
   - Listará todos os planetas cadastrados no banco
 - Busca
  - Verificará se o planeta buscado consta na base de dados, caso contrário, busca na API pública (SWAPI) e, caso encontre-o, insere automaticamente no banco.
- Adição
  - Adicionar um novo planeta (desde que conste na API pública) manualmente
- Remoção
  - Remover um planeta

#### EndPoints da API :

- <b> Listar os planetas Salvos : </b>
```
(GET) http://localhost:8081/planetas
```

- <b> Buscar um planeta por id : </b>
```
(GET) http://localhost:8081/planetas/{id}
```

- <b> Busca um planeta po nome : </b>
```
(GET) http://localhost:8081/planetas/{nome}/nome
```

- <b> Salvar um determinado planteta : </b>
```
(POST) http://localhost:8081/planetas Informando um JSON:

{  
  "nome": "Terra", 
  "clima": "tropical", 
  "terreno": "arenoso" 
}
```
- <b> Remover planeta : </b>
```
(DELETE) http://localhost:8081/planetas/{id}
```

## Autor

* **Márcio Santos** - *Desenvolvedor*


## Licença

Não se aplica.
