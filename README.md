# Build
mvn clean package && docker build -t com.mycompany/Esercizio .

# RUN

docker rm -f Esercizio || true && docker run -d -p 8080:8080 -p 4848:4848 --name Esercizio com.mycompany/Esercizio 