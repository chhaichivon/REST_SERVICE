package com.camsoft.resources;

import java.util.HashMap;
import java.util.Map;


/**
 * @author chhaichivon on May Jun 30, 2018
 */

public class UserResource {

	
	public Map<String,Object> findAll(){
		
		Map<String,Object> map = new HashMap<>();
		
			for(int i=0;i<10;i++) {
				map.put("key"+i, "Value"+i);
			}
		
		return map;
		
	}
}
