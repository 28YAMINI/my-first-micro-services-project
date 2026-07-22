# ---------- Build Stage ----------
FROM eclipse-temurin:21-jdk AS builder

WORKDIR /app

COPY pom.xml .
COPY .mvn .mvn
COPY mvnw .
COPY src src

RUN chmod +x mvnw
RUN ./mvnw clean package -DskipTests

# ---------- Runtime Stage ----------
FROM eclipse-temurin:21-jre

WORKDIR /app

COPY --from=builder /app/target/hello-service-0.0.1-SNAPSHOT.jar hello-service.jar

EXPOSE 8083

ENTRYPOINT ["java","-jar","hello-service.jar"]