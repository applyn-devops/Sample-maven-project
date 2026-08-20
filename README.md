# sample-maven-app-demo
hi...
Jenkins file
[![Maven CI](https://github.com/your-username/sample-maven-app/actions/workflows/maven.yml/badge.svg)](https://github.com/your-username/sample-maven-app/actions/workflows/maven.yml)

A sample Java 17 Maven project that demonstrates a minimal application, JUnit 5 tests, and a GitHub Actions CI pipeline.

## Project Description

This project is a starter Java application packaged as a JAR. It prints a greeting to the console and includes automated tests and continuous integration configuration so it is ready to upload to GitHub.

## Folder Structure

```
sample-maven-app/
├── .github/
│   └── workflows/
│       └── maven.yml
├── .mvn/
│   └── wrapper/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/
│   │   │       └── App.java
│   │   └── resources/
│   └── test/
│       ├── java/
│       │   └── com/example/
│       │       └── AppTest.java
│       └── resources/
├── .gitignore
├── LICENSE
├── README.md
├── pom.xml
├── mvnw
└── mvnw.cmd
```

## Prerequisites

- Java Development Kit (JDK) 17 or later
- Git (optional, for version control)

Maven is bundled through the Maven Wrapper (`mvnw` / `mvnw.cmd`), so a separate Maven installation is not required.

## Build Instructions

On Linux or macOS:

```bash
./mvnw clean install
```

On Windows:

```cmd
mvnw.cmd clean install
```

The build compiles the application, runs tests, and packages the JAR into the `target/` directory.

## Test Instructions

Run the test suite with:

```bash
./mvnw test
```

Or on Windows:

```cmd
mvnw.cmd test
```

## Run Instructions

After building the project, run the packaged JAR:

```bash
java -jar target/sample-maven-app-1.0.0.jar
```

Expected output:

```
Hello Maven Project!
```

You can also run the application directly during development:

```bash
./mvnw exec:java -Dexec.mainClass="com.example.App"
```

## GitHub Actions

The workflow in `.github/workflows/maven.yml` runs on every push and pull request. It sets up Java 17, caches Maven dependencies, executes `mvn clean verify`, and uploads the generated JAR as a workflow artifact.

Replace `your-username` in the badge URL above after publishing the repository to GitHub.

## License

This project is licensed under the MIT License. See [LICENSE](LICENSE) for details.
