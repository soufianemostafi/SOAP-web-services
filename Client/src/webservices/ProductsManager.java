/**
 * ProductsManager.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservices;

public interface ProductsManager extends java.rmi.Remote {
    public webservices.Product getProduct(long productId) throws java.rmi.RemoteException, webservices.NoSuchProductException;
    public long addProduct(webservices.Product product) throws java.rmi.RemoteException;
    public double getProductPrice(long productId) throws java.rmi.RemoteException, webservices.NoSuchProductException;
    public webservices.Product[] getProducts() throws java.rmi.RemoteException;
    public boolean deleteAllProducts() throws java.rmi.RemoteException;
    public void updateProduct(webservices.holders.ProductHolder product) throws java.rmi.RemoteException;
    public boolean deleteProduct(long productId) throws java.rmi.RemoteException;
}
