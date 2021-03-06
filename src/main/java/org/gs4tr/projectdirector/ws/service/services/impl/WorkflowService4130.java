
package org.gs4tr.projectdirector.ws.service.services.impl;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.2.4-b01 Generated
 * source version: 2.2
 * 
 */
@WebServiceClient(name = "WorkflowService_4130", targetNamespace = "http://impl.services.service.ws.projectdirector.gs4tr.org")
public class WorkflowService4130 extends Service {

	private static URL WORKFLOWSERVICE4130_WSDL_LOCATION;
	private static WebServiceException WORKFLOWSERVICE4130_EXCEPTION;
	private final static QName WORKFLOWSERVICE4130_QNAME = new QName(
			"http://impl.services.service.ws.projectdirector.gs4tr.org", "WorkflowService_4130");

	public WorkflowService4130() {
		super(__getWsdlLocation(), WORKFLOWSERVICE4130_QNAME);
	}

	public WorkflowService4130(WebServiceFeature... features) {
		super(__getWsdlLocation(), WORKFLOWSERVICE4130_QNAME, features);
	}

	public WorkflowService4130(URL wsdlLocation) {
		super(wsdlLocation, WORKFLOWSERVICE4130_QNAME);
		WORKFLOWSERVICE4130_WSDL_LOCATION = wsdlLocation;
		WORKFLOWSERVICE4130_EXCEPTION = null;
	}

	public WorkflowService4130(URL wsdlLocation, WebServiceFeature... features) {
		super(wsdlLocation, WORKFLOWSERVICE4130_QNAME, features);
		WORKFLOWSERVICE4130_WSDL_LOCATION = wsdlLocation;
		WORKFLOWSERVICE4130_EXCEPTION = null;
	}

	public WorkflowService4130(URL wsdlLocation, QName serviceName) {
		super(wsdlLocation, serviceName);
		WORKFLOWSERVICE4130_WSDL_LOCATION = wsdlLocation;
		WORKFLOWSERVICE4130_EXCEPTION = null;
	}

	public WorkflowService4130(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
		super(wsdlLocation, serviceName, features);
		WORKFLOWSERVICE4130_WSDL_LOCATION = wsdlLocation;
		WORKFLOWSERVICE4130_EXCEPTION = null;
	}

	/**
	 * 
	 * @return returns WorkflowServicePortType
	 */
	@WebEndpoint(name = "WorkflowServiceHttpSoap11Endpoint")
	public WorkflowServicePortType getWorkflowServiceHttpSoap11Endpoint() {
		return super.getPort(new QName("http://impl.services.service.ws.projectdirector.gs4tr.org",
				"WorkflowServiceHttpSoap11Endpoint"), WorkflowServicePortType.class);
	}

	/**
	 * 
	 * @param features
	 *            A list of {@link javax.xml.ws.WebServiceFeature} to configure
	 *            on the proxy. Supported features not in the
	 *            <code>features</code> parameter will have their default
	 *            values.
	 * @return returns WorkflowServicePortType
	 */
	@WebEndpoint(name = "WorkflowServiceHttpSoap11Endpoint")
	public WorkflowServicePortType getWorkflowServiceHttpSoap11Endpoint(WebServiceFeature... features) {
		return super.getPort(new QName("http://impl.services.service.ws.projectdirector.gs4tr.org",
				"WorkflowServiceHttpSoap11Endpoint"), WorkflowServicePortType.class, features);
	}

	/**
	 * 
	 * @return returns WorkflowServicePortType
	 */
	@WebEndpoint(name = "WorkflowServiceHttpSoap12Endpoint")
	public WorkflowServicePortType getWorkflowServiceHttpSoap12Endpoint() {
		return super.getPort(new QName("http://impl.services.service.ws.projectdirector.gs4tr.org",
				"WorkflowServiceHttpSoap12Endpoint"), WorkflowServicePortType.class);
	}

	/**
	 * 
	 * @param features
	 *            A list of {@link javax.xml.ws.WebServiceFeature} to configure
	 *            on the proxy. Supported features not in the
	 *            <code>features</code> parameter will have their default
	 *            values.
	 * @return returns WorkflowServicePortType
	 */
	@WebEndpoint(name = "WorkflowServiceHttpSoap12Endpoint")
	public WorkflowServicePortType getWorkflowServiceHttpSoap12Endpoint(WebServiceFeature... features) {
		return super.getPort(new QName("http://impl.services.service.ws.projectdirector.gs4tr.org",
				"WorkflowServiceHttpSoap12Endpoint"), WorkflowServicePortType.class, features);
	}

	private static URL __getWsdlLocation() {
		if (WORKFLOWSERVICE4130_EXCEPTION != null) {
			throw WORKFLOWSERVICE4130_EXCEPTION;
		}
		return WORKFLOWSERVICE4130_WSDL_LOCATION;
	}

}
