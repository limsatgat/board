plugins {
    java
    war
    id("org.springframework.boot") version "2.7.8"
    id("io.spring.dependency-management") version "1.0.15.RELEASE"
}

group = "com.study"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_1_8

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    providedRuntime("org.springframework.boot:spring-boot-starter-tomcat")
    developmentOnly("org.springframework.boot:spring-boot-devtools")
    // https://mvnrepository.com/artifact/org.apache.tomcat.embed/tomcat-emed-jasper - 톰캣의 jsp 엔진
    implementation("org.apache.tomcat.embed:tomcat-embed-jasper")
    // Mybatis
    implementation("org.mybatis.spring.boot:mybatis-spring-boot-starter:2.3.0")
    // MySql
    //runtimeOnly ("com.mysql:mysql-connector-j")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<Test> {
    useJUnitPlatform()
}
