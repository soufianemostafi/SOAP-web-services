package webservices;

public class ProductsManagerProxy implements webservices.ProductsManager {
  private String _endpoint = null;
  private webservices.ProductsManager productsManager = null;
  
  public ProductsManagerProxy() {
    _initProductsManagerProxy();
  }
  
  public ProductsManagerProxy(String endpoint) {
    _endpoint = endpoint;
    _initProductsManagerProxy();
  }
  
  private void _initProductsManagerProxy() {
    try {
      productsManager = (new webservices.ProductsManagerImplServiceLocator()).getProductsManagerImplPort();
      if (productsManager != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)productsManager)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)productsManager)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (productsManager != null)
      ((javax.xml.rpc.Stub)productsManager)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public webservices.ProductsManager getProductsManager() {
    if (productsManager == null)
      _initProductsManagerProxy();
    return productsManager;
  }
  
  public webservices.Product getProduct(long productId) throws java.rmi.RemoteException, webservices.NoSuchProductException{
    if (productsManager == null)
      _initProductsManagerProxy();
    return productsManager.getProduct(productId);
  }
  
  public long addProduct(webservices.Product product) throws java.rmi.RemoteException{
    if (productsManager == null)
      _initProductsManagerProxy();
    return productsManager.addProduct(product);
  }
  
  public double getProductPrice(long productId) throws java.rmi.RemoteException, webservices.NoSuchProductException{
    if (productsManager == null)
      _initProductsManagerProxy();
    return productsManager.getProductPrice(productId);
  }
  
  public webservices.Product[] getProducts() throws java.rmi.RemoteException{
    if (productsManager == null)
      _initProductsManagerProxy();
    return productsManager.getProducts();
  }
  
  public boolean deleteAllProducts() throws java.rmi.RemoteException{
    if (productsManager == null)
      _initProductsManagerProxy();
    return productsManager.deleteAllProducts();
  }
  
  public void updateProduct(webservices.holders.ProductHolder product) throws java.rmi.RemoteException{
    if (productsManager == null)
      _initProductsManagerProxy();
    productsManager.updateProduct(product);
  }
  
  public boolean deleteProduct(long productId) throws java.rmi.RemoteException{
    if (productsManager == null)
      _initProductsManagerProxy();
    return productsManager.deleteProduct(productId);
  }
  
  
}