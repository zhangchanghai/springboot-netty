package com.boot;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@SpringBootApplication
@RestController
public class Application implements CommandLineRunner{

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
	}
	
	@GetMapping("/")
	public Object page(ModelAndView mv) {
		mv.addObject("name", "sSssss");
		mv.setViewName("index");
		return mv;
	}
	@GetMapping("page/{page}")
	public Object page(ModelAndView mv,@PathVariable String page) {
		mv.setViewName(page);
		return mv;
	}
	@GetMapping("page/{page}/{name}")
	public Object page2(ModelAndView mv,@PathVariable String page,@PathVariable String name) {
		Map<String,Object> map =new HashMap<>();
		map.put("code", 1);
		map.put("name", name);
		map.put("message", "");
		mv.addObject("user", map);
		mv.setViewName(page);
		return mv;
	}
	@PostMapping("/test")
	public Object test(@RequestParam(defaultValue="test")String val) {
		Map<String,Object> map =new HashMap<>();
		map.put("id", 123);
		map.put("name", "小哈哈");
		map.put("val", val);
		return map;
	}

	@Override
	public void run(String... arg0) throws Exception {
	//	new NettyService();
	}
}
