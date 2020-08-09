package org.abhishek.RESTfull.messanger_application.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

@Path("/injectdemo")
@Consumes(MediaType.TEXT_PLAIN)
@Produces(MediaType.TEXT_PLAIN)

public class InjectDemoResource {
	@GET
	@Path("annotations")
	public String getParamUsingAnnotations(@MatrixParam("param") String matrixParam,
			                               @HeaderParam("contentHeaderValue") String header) {
		return "MatrixParam:" +matrixParam +" "+"Header:" +header;

	}
	@GET
	@Path("context")
    public String getContextUsingAnnotation(@Context UriInfo uriInfo,@Context HttpHeaders header) {
	String uri =	uriInfo.getAbsolutePath().toString();
	String cookies = header.getCookies().toString();
	return "URI :" + uri + " " + "Cookies:" + cookies;
	}
}
