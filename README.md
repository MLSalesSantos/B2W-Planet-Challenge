# B2W-Planet-Challenge
API Challenge Stars Wars B2W

EndPoints da API :

**Negrito** Listar os planetas Salvos : 
(GET) http://localhost:8081/planetas

**Negrito** Buscar um planeta por id : 
(GET) http://localhost:8081/planetas/{id}

**Negrito** Busca um planeta po nome : 
(GET) http://localhost:8081/planetas/{nome}/nome


**Negrito** Salvar um determinado planteta : 
(POST) http://localhost:8081/planetas Informando um JSON:
```
{  
  "nome": "Terra", 
  "clima": "tropical", 
  "terreno": "arenoso" 
}
```
**Negrito** Remover planeta : 
(DELETE) http://localhost:8081/planetas/{id}

Consumindo a API de terceiro: https://swapi.co/ :

Ao salvar planeta, ele se comunica com API do Star Wars, obtem a quantidade de aparições e finaliza o processo de salvar.
