package Rest.example.demo1.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	@RequestMapping(method=RequestMethod.GET ,path="/helloworld")
	public String Helloworld()
	{
		return "helloworld";
	}
	@RequestMapping(method=RequestMethod.GET ,path="/helloworldbean")
	public helloworld1 helloworldbean ()
	{
		return new helloworld1("hello world1");
	}
}
