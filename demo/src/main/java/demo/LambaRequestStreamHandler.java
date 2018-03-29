package demo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.commons.io.IOUtils;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestStreamHandler;

public class LambaRequestStreamHandler  implements RequestStreamHandler {

	public void handleRequest(InputStream inputStream, OutputStream outputStream, Context arg2) throws IOException {
		// TODO Auto-generated method stub
		 String input = IOUtils.toString(inputStream, "UTF-8");
	        outputStream.write(("Hello World - " + input).getBytes());
	}

	
	 
}
