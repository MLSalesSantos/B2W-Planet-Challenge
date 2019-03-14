# B2W-Planet-Challenge
API Challenge Stars Wars B2W

###EndPoints da API :

<b> Listar os planetas Salvos : </b>
```
(GET) http://localhost:8081/planetas
```

<b> Buscar um planeta por id : </b>
(GET) http://localhost:8081/planetas/{id}

<b> Busca um planeta po nome : </b>
(GET) http://localhost:8081/planetas/{nome}/nome


<b> Salvar um determinado planteta : </b>
(POST) http://localhost:8081/planetas Informando um JSON:
```
{  
  "nome": "Terra", 
  "clima": "tropical", 
  "terreno": "arenoso" 
}
```
<b> Remover planeta : </b>
(DELETE) http://localhost:8081/planetas/{id}

Consumindo a API de terceiro: https://swapi.co/ :

Ao salvar planeta, ele se comunica com API do Star Wars, obtem a quantidade de aparições e finaliza o processo de salvar.
