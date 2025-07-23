# Use imagem base com Java 17
FROM openjdk:17-jdk-slim

# Define o diretório de trabalho no container
WORKDIR /app

# Copia o arquivo JAR gerado para o container
COPY target/solid-demo-0.0.1-SNAPSHOT.jar app.jar

# Expõe a porta que a aplicação vai rodar
EXPOSE 8080

# Comando para rodar a aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]
