package samplecamelproject;

import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;

public class MainApp {

	public static void main(String[] args) {
		SimpleRouteBuilder routeBuilder = new SimpleRouteBuilder();
		CamelContext ctx = new DefaultCamelContext();
		try {
			ctx.addRoutes(routeBuilder);
			System.out.println("Starting router");
			ctx.start();
			Thread.sleep(1 * 60 * 1000);
			System.out.println("Stopping router");
            ctx.stop();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
}
