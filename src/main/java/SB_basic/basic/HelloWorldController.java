package SB_basic.basic;

import org.springframework.web.bind.annotation.*;

//Controller
@RestController
public class HelloWorldController {

    //we need to define this class as a controller
    //it should be handling all the http requests
    @GetMapping(path = "/hello-world")
    public String HelloWorld(){
        return "Hello World";
    }

    //hello-world-bean
    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean HelloWorldBean(){
        return new HelloWorldBean("Hello World");
    }

    //hello-world-bean/path-variable
    @GetMapping(path = "/hello-world-bean/path-variable/{name}")
    public HelloWorldBean HelloWorldPathVar(@PathVariable String name){
        return new HelloWorldBean(String.format("Hello World, %s", name));
    }
}
