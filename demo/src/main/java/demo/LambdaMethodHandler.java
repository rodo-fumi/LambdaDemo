package demo;

import java.util.Map;

import com.amazonaws.services.lambda.runtime.Context;

public class LambdaMethodHandler {
	public String handleRequest(Map<String,Object> input, Context context) {
	    
	//public String handleRequest(String input, Context context) {
        context.getLogger().log("Input: " + input);
        return "Hello World - " + input;
    }
}


