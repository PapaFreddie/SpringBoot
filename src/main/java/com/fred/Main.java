package com.fred;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication // combination of @configuration, @EnableAutoConfiguration & @componentScan.
                       //@Configuration - used for configuring classes. Also called AppConfig
                       //@EnableAutoConfiguration -
                       //@ComponentScan - tells spring where to look for components
           //without this annotation, the application will not work
@RestController //this indicates class is controller and all methods in marked class will return json response
@RequestMapping("api/v1/customers")
public class Main {
    private final CustomerRepository customerRepository;
    public Main(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }

    public static void main(String[]args){
        SpringApplication.run(Main.class, args);

    }

    @GetMapping
    public List<Customer> getCustomers(){
        return customerRepository.findAll();
    }
//    @GetMapping()
//    public GreetResponse greet(){
//        GreetResponse response =  new GreetResponse(
//                "Hello",
//                List.of("Html", "Java", "python", "Angular"),
//                new Person("Kevin", 29, 30_000)
//        );
//        return  response;
//    }

//    record Person(String name, int age, double savings){
//
//    }
//
//    record GreetResponse(
//            String greet,
//            List<String> favProgrammingLanguages,
//            Person person
//    ){
//
//    }




    //servlets - process that handles http request and gets a response
}


/*
Model =
 */