JPA
Springboot
DEVTools
Swagger - http://localhost:8080/swagger-ui.html

A api deve ser capaz de persistir uma entidade chamada Produto com os atributos: codigo, nome e valor. 
A classe Produto está associada com a classe Categoria, que possui o atributo: nome e descricao


--API rest com comentários
https://www.youtube.com/watch?v=9GWK9A79tEc&ab_channel=AlgaWorks

--api rest com todos os métodos
https://www.youtube.com/watch?v=FLSdkP33Lwo&list=PL8iIphQOyG-D2FP9wkg12AavzmVRWEcnJ&index=7&ab_channel=MichelliBrito

--service
https://www.youtube.com/watch?v=ybUEDHilN0M&list=PLc28gaAn8GoGmkMjmdkD7ZSGl1c0-mB9A&index=14&ab_channel=TI100Censura

select 
	produto0_.codigo as codigo1_1_0_, 
	produto0_.categoria_codigo as categori5_1_0_, 
	produto0_.nome as nome2_1_0_, 
	produto0_.quantidade as quantida3_1_0_, 
	produto0_.valor as valor4_1_0_ 
from tb_produto produto0_ 
where produto0_.codigo=?