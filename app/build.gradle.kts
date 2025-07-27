plugins {
    application
    id("com.github.ben-manes.versions") version "0.39.0"
    checkstyle
}

application {
    mainClass = "hexlet.code.App"
}

tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}

plugins {
    id("org.sonarqube") version "6.2.0.5505"
}

sonar {
    properties {
        property("sonar.projectKey", "Timster-Lipkens_java-project-61")
        property("sonar.organization", "timster-lipkens")
        property("sonar.host.url", "https://sonarcloud.io")
    }
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}