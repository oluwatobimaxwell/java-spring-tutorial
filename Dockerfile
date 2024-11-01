FROM openjdk:17-jdk-slim
WORKDIR /app
COPY . .
ENV JAVA_OPTS="-Xmx256m -Xms128m"
RUN ./gradlew build --no-daemon
EXPOSE 8080
CMD ["./gradlew", "bootRun"]
