package test.yuhao.baffle.server;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.support.spring.annotation.ResponseJSONP;

@RestController
public class RestfulTestServer {
	
	@RequestMapping(value="/test/testGet", method=RequestMethod.GET)
	public String testGet(HttpServletRequest request,HttpServletResponse response) {
		String name = request.getParameter("name");
		return "Hello:"+name;
	}
	
	@RequestMapping(value="/test/testPost", method=RequestMethod.POST)
	@ResponseJSONP
	public JSONObject testPost(HttpServletRequest request,HttpServletResponse response) {
		String name = request.getParameter("name");
		response.addHeader("test", "testHeader");
		JSONObject json = new JSONObject();
		json.put("result", "Hello"+name);
		json.put("code", "000000");
		return json;
	}

}
