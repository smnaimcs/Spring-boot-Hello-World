# 🌍 Hello World REST API

A simple Spring Boot REST API project perfect for beginners learning backend development. This project demonstrates the fundamentals of creating a web API with Spring Boot.

## 🚀 Features

- **Simple REST Endpoints**: Basic "Hello World" API
- **Multiple Greeting Methods**: Path variables, query parameters, and fixed responses
- **Built with Spring Boot**: Industry-standard Java framework
- **Zero Configuration**: Ready to run out of the box

## 🛠️ Tech Stack

- **Java 17+**
- **Spring Boot 3.2+**
- **Spring Web MVC**
- **Maven**
- **Embedded Tomcat Server**

## 📁 Project Structure

```
hello-world-api/
├── src/main/java/com/example/helloworldapi/
│   ├── HelloWorldApiApplication.java  # Main application class
│   └── HelloController.java           # REST controller with endpoints
├── src/main/resources/
│   └── application.properties         # Configuration file
└── pom.xml                           # Maven dependencies
```

## 🎯 Getting Started

### Prerequisites
- Java 17 or higher
- Maven 3.6+
- Your favorite IDE (IntelliJ, VS Code, Eclipse)

### Installation & Running

1. **Clone the repository**
   ```bash
   git clone https://github.com/smnaimcs/Spring-boot-Hello-World.git
   cd hello-world-api
   ```

2. **Run the application**
   ```bash
   # Using Maven wrapper
   ./mvnw spring-boot:run
   

3. **Test the API**
   Open your browser or use curl:
   ```bash
   # Basic greeting
   curl http://localhost:8080/
   
   # Greet with query parameter
   curl http://localhost:8080/greet?name=Alice
   
   # Greet with path variable
   curl http://localhost:8080/greet/John
   
   # Get server time
   curl http://localhost:8080/time
   ```

## 📚 API Endpoints

| Method | Endpoint | Description | Example Response |
|--------|----------|-------------|------------------|
| GET | `/` | Basic hello world | `"Hello, World!"` |
| GET | `/greet` | Greet with optional name parameter | `"Hello, Guest!"` |
| GET | `/greet?name=Alice` | Personalized greeting | `"Hello, Alice!"` |
| GET | `/greet/{name}` | Greet using path variable | `"Hello, John! Welcome!"` |
| GET | `/time` | Get server time | `"Current time: 2024-01-15T10:30:00"` |

## 💡 Learning Concepts

### Core Spring Boot Annotations
- `@RestController` - Marks class as a REST controller
- `@GetMapping` - Maps HTTP GET requests to handler methods
- `@RequestParam` - Binds query parameters to method parameters
- `@PathVariable` - Extracts values from URI path

### Key Concepts Covered
- **RESTful Web Services**: Building HTTP APIs
- **Dependency Injection**: Spring's core principle
- **Auto-configuration**: Spring Boot magic
- **Embedded Server**: No external Tomcat needed
- **Maven Build System**: Dependency management

## 🎓 What You've Learned

✅ **Project Setup** with Spring Initializr  
✅ **REST Controller** creation and annotation usage  
✅ **HTTP Method Handling** with GET requests  
✅ **Parameter Binding** with `@RequestParam` and `@PathVariable`  
✅ **Spring Boot Auto-configuration** principles  
✅ **Application Packaging** and execution  

## 🔄 Next Steps to Improve

### Beginner Enhancements
- [ ] Add POST endpoint for user creation
- [ ] Implement simple in-memory data storage
- [ ] Add basic error handling with `@ControllerAdvice`
- [ ] Create API documentation with Swagger/OpenAPI
- [ ] Add request/response logging

### Intermediate Features
- [ ] Connect to a database (H2/PostgreSQL)
- [ ] Add Spring Data JPA for data persistence
- [ ] Implement input validation with Bean Validation
- [ ] Add unit tests with JUnit and MockMvc
- [ ] Create custom exception handling

### Advanced Topics
- [ ] Add Spring Security for authentication
- [ ] Implement JWT token-based security
- [ ] Add API versioning
- [ ] Create Docker containerization
- [ ] Set up CI/CD pipeline with GitHub Actions

## 🛠️ Development Tips

### Useful Commands
```bash
# Run tests
./mvnw test

# Check dependencies
./mvnw dependency:tree

# Create executable JAR
./mvnw clean package

# Run with custom port
java -jar target/*.jar --server.port=8081
```

### Debugging Tips
- Check logs in console for startup issues
- Verify endpoint mappings in startup logs
- Use Postman or curl for API testing
- Enable debug mode: `--debug` flag or `logging.level.com.example=DEBUG`

## 📖 Resources

### Official Documentation
- [Spring Boot Official Docs](https://spring.io/projects/spring-boot)
- [Spring Web MVC Documentation](https://docs.spring.io/spring-framework/docs/current/reference/html/web.html)
- [Maven Getting Started Guide](https://maven.apache.org/guides/getting-started/)

### Learning Resources
- [Spring Boot Tutorial - Baeldung](https://www.baeldung.com/spring-boot)
- [Spring Guides](https://spring.io/guides)
- [REST API Tutorial](https://restfulapi.net/)

### Tools
- [Spring Initializr](https://start.spring.io/) - Project bootstrap
- [Postman](https://www.postman.com/) - API testing
- [HTTPie](https://httpie.io/) - CLI HTTP client

## 🤝 Contributing

This is a learning project! Feel free to:
- Fork the repository
- Add new endpoints and features
- Improve documentation
- Share your learning experience

## 📄 License

This project is open source and available under the [MIT License](LICENSE).

---

**Happy Coding!** 🎉 Build something amazing with this foundation.
