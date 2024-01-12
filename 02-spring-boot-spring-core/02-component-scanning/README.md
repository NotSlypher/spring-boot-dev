###Annotations:-

Spring boot automatically scans for annotations and makes beans for them./

**@SpringBootApplication** annotation is composed of the following:-/
1. @EnableAutoConfiguration - Enables Spring boot's auto-configuration support
2. @ComponentScan - Enables component scanning of current package. Also recursively scans sub-packages.
3. @Configuration - Able to register extra beans with @Bean or import other configuration classes

**Spring application** creates application context and registers all the beans as well as starts tomcat server.

###Component scanning:-
Spring boot starts component scanning from the same package as the main spring boot application and scans sub-packages recursively.

Component scanning is done in main package by default, for other packages it can be mentioned in

@SpringBootApplication annotation as
(

    #canBasePackages = {package names}

)