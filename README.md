# B2W-Planet-Challenge
### API Challenge Stars Wars B2W

## Especificando uma base de dados
- A aplicação, em sua primeira inicialização estará com a base zerada.
- O usuário possui as opções:
     - Listagem
         - Listará todos os planetas cadastrados no banco
     - Busca
         - Verificará se o planeta buscado consta na base de dados
     - Adição
         - Adicionar um novo planeta
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
