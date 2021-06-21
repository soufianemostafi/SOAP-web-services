/**
 * ProductsManagerImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservices;

public class ProductsManagerImplServiceLocator extends org.apache.axis.client.Service implements webservices.ProductsManagerImplService {

    public ProductsManagerImplServiceLocator() {
    }


    public ProductsManagerImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ProductsManagerImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ProductsManagerImplPort
    private java.lang.String ProductsManagerImplPort_address = "http://localhost:2021/webservices/ProductsManager";

    public java.lang.String getProductsManagerImplPortAddress() {
        return ProductsManagerImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ProductsManagerImplPortWSDDServiceName = "ProductsManagerImplPort";

    public java.lang.String getProductsManagerImplPortWSDDServiceName() {
        return ProductsManagerImplPortWSDDServiceName;
    }

    public void setProductsManagerImplPortWSDDServiceName(java.lang.String name) {
        ProductsManagerImplPortWSDDServiceName = name;
    }

    public webservices.ProductsManager getProductsManagerImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ProductsManagerImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getProductsManagerImplPort(endpoint);
    }

    public webservices.ProductsManager getProductsManagerImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            webservices.ProductsManagerImplPortBindingStub _stub = new webservices.ProductsManagerImplPortBindingStub(portAddress, this);
            _stub.setPortName(getProductsManagerImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setProductsManagerImplPortEndpointAddress(java.lang.String address) {
        ProductsManagerImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (webservices.ProductsManager.class.isAssignableFrom(serviceEndpointInterface)) {
                webservices.ProductsManagerImplPortBindingStub _stub = new webservices.ProductsManagerImplPortBindingStub(new java.net.URL(ProductsManagerImplPort_address), this);
                _stub.setPortName(getProductsManagerImplPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ProductsManagerImplPort".equals(inputPortName)) {
            return getProductsManagerImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webservices/", "ProductsManagerImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webservices/", "ProductsManagerImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ProductsManagerImplPort".equals(portName)) {
            setProductsManagerImplPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
