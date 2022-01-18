# Login Signup

        Login SignUp Documentation


Save Roles--:
Post Api - https://localhoast:8080/api/auth/saveRoles 

Sign up--:
Post Api – https://localhoast:8080/api/auth/signup 

Body/raw/Json -   {
  "username": "ayush",
  "email": "ayush2202ksr@gmail.com",
  "role": [
    "user"/"admin"/"mod"/"user,mod"
  ],
  "password": "123456"
}
Sign in--:
Post Api - https://localhoast:8080/api/auth/signin

Body/raw/Json -   {
  "username": "ayush",
  "password": "123456"
} 

Admin Page--:
Post Api - https://localhoast:8080/api/auth/panel/admin

Headers –"Authorization": "Bearer "+tokenvalue

Moderator Page--:
Post Api - https://localhoast:8080/api/auth/panel/mod

Headers –"Authorization": "Bearer "+tokenvalue

User Page--:
Post Api - https://localhoast:8080/api/auth/panel/user

Headers –"Authorization": "Bearer "+tokenvalue


Dependency Used-: 

                <dependency>
			<groupId>javax.xml.bind</groupId>
			<artifactId>jaxb-api</artifactId>
			<version>2.3.0</version>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-security</artifactId>
		</dependency>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>

		<dependency>
			<groupId>mysql</groupId>
			<artifactId>mysql-connector-java</artifactId>
			<scope>runtime</scope>
		</dependency>

		<dependency>
			<groupId>io.jsonwebtoken</groupId>
			<artifactId>jjwt</artifactId>
			<version>0.9.1</version>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-websocket</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>org.projectlombok</groupId>
			<artifactId>lombok</artifactId>
		</dependency>
		<!-- https://mvnrepository.com/artifact/org.springdoc/springdoc-openapi-ui -->
		<dependency>
			<groupId>org.springdoc</groupId>
			<artifactId>springdoc-openapi-ui</artifactId>
			<version>1.5.13</version>
		</dependency>
		<dependency>
			<groupId>org.springdoc</groupId>
			<artifactId>springdoc-openapi-data-rest</artifactId>
			<version>1.5.2</version>
		</dependency>
		<dependency>
			<groupId>org.springframework.security</groupId>
			<artifactId>spring-security-test</artifactId>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>jakarta.validation</groupId>
			<artifactId>jakarta.validation-api</artifactId>
			<version>2.0.2</version>
		</dependency>


