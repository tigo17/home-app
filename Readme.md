### Gerar Build do java ###
./mvnw package && java -jar target/validarCpf.jar

### Gerar o build do docker ###
docker build -t didox/validador-cpf-turma-devops -f Dockerfile .

### Rodar imagem docker e gravar localmente ###
docker run -d -p 8081:8080 --name validador-cpf-turma-devops didox/validador-cpf-turma-devops
### Rodar imagem docker em modo iterativo localmente ###
docker run -it -p 8081:8080 --name validador-cpf-turma-devops didox/validador-cpf-turma-devops

### Para parar o seriviço rodar ###
docker stop validador-cpf-turma-devops

### Para startar o seriviço rodar ###
docker start validador-cpf-turma-devops

### Para remover o seriviço rodar ###
docker rm validador-cpf-turma-devops

### Para fazer login no dockerhub ###
docker login

### Criar a tag apontando para o repositório do docker hub ###
docker tag didox/validador-cpf-turma-devops hub.docker.com/r/didox/validador-cpf-turma-devops

### Fazer o push da imagem para a docker hub ###
docker push didox/validador-cpf-turma-devops