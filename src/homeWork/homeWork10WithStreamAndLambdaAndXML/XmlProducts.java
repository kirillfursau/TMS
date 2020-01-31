package homeWork.homeWork10WithStreamAndLambdaAndXML;

import javax.xml.bind.JAXBException;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import java.util.List;

@XmlRootElement(name = "Store")
public class XmlProducts {
    private List<Product> productsList;

    public XmlProducts(List<Product> productList) {
        setProductsList(productList);
    }

    public XmlProducts() {

    }

    @XmlElement(name = "Product")
    public List<Product> getProductsList() {
            return productsList;
    }

    public void setProductsList(List<Product> productsList) {
        this.productsList = productsList;
    }

    @Override
    public String toString() {
        return "XmlProducts{" + productsList +
                '}';
    }
}
