FROM gradle:8.4.0-jdk17 as builder
WORKDIR /app
RUN apt-get update && apt-get install -y git && rm -rf /var/lib/apt/lists/*
RUN git clone https://github.com/ramjangatisetty/selenium-gradle-framework-docker-image.git
WORKDIR /app/selenium-gradle-framework-docker-image
RUN chmod +x ./gradlew
CMD ["./gradlew", "test"]