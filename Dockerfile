# Step 1: Use a base image with JDK
FROM openjdk:17-jdk-slim AS build

# Step 2: Set the working directory
WORKDIR /app

# Step 3: Copy the Maven build output (JAR file) into the image
COPY target/springboot-demo-hello-world-0.0.1-SNAPSHOT.jar /app/my-java-app.jar

# Step 4: Expose the port the app runs on
EXPOSE 8080

# Step 5: Command to run the application
ENTRYPOINT ["java", "-jar", "my-java-app.jar"]
