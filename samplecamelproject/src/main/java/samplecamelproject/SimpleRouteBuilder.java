package samplecamelproject;

import org.apache.camel.builder.RouteBuilder;

public class SimpleRouteBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("file:/Users/Pawel/Desktop/inputFolder").to("file:/Users/Pawel/Desktop/outputFolder");
	}

}
