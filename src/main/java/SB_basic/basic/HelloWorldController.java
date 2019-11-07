package SB_basic.basic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//Controller
@RestController
public class HelloWorldController {
    //GET
    //URI -/hello-world
    //method - "Hello World"
    //we need to define this class as a controller
    //it should be handling all the http requests
    @RequestMapping(method = RequestMethod.GET, path = "/helloworld")
    public String HelloWorld(){
        return "Hello World";
    }
}
