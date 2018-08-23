package com.camsoft.resources;

import java.util.HashMap;
import java.util.Map;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 * @author chhaichivon on May Jun 30, 2018
 */
@RestController
public class UserResource {

	
	
	@RequestMapping("/users")
	public Map<String,Object> findAll(){
		
		Map<String,Object> map = new HashMap<>();
		
			for(int i=0;i<10;i++) {
				map.put("key"+i, "Value"+i);
			}
			System.out.println("Hello");
		
		return map;
		
	}
}
