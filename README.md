# B2W-Planet-Challenge
### API Challenge Stars Wars B2W

- A aplicação, em sua primeira inicialização estará com a base zerada.
- O usuário possui as opções:
     - Listagem
         - Listará todos os planetas cadastrados no banco.
     - Busca
         - Verificará se o planeta buscado consta na base de dados.
     - Adição
         - Adicionar um novo planeta.
     - Remoção
        - Remover um planeta.
        

### EndPoints da API :

- Listar os planetas Salvos :
    - Tipo de Request: GET
         - http://localhost:8081/planetas

- Buscar um planeta por id :
    - Tipo de Request: GET
         - http://localhost:8081/planetas/{id}

- Busca um planeta por nome :
     - Tipo de Request: GET
          - http://localhost:8081/planetas/{nome}/nome
     
- Salvar um determinado planteta :
     - Tipo de Request: POST
       - http://localhost:8081/planetas
```
{  
  "nome": "Terra", 
  "clima": "tropical", 
  "terreno": "arenoso" 
}
```

- Remover planeta :
     - Tipo de Request: DELETE
         - http://localhost:8081/planetas/{id}

