/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package enterprise.web_jpa_war.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Tanya
 */
@Entity
@Table(name = "CATALOGUE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Catalogue.findAll", query = "SELECT c FROM Catalogue c"),
    @NamedQuery(name = "Catalogue.findByProductId", query = "SELECT c FROM Catalogue c WHERE c.productId = :productId"),
    @NamedQuery(name = "Catalogue.findByProductName", query = "SELECT c FROM Catalogue c WHERE c.productName = :productName"),
    @NamedQuery(name = "Catalogue.findByInfo", query = "SELECT c FROM Catalogue c WHERE c.info = :info"),
    @NamedQuery(name = "Catalogue.findByPrice", query = "SELECT c FROM Catalogue c WHERE c.price = :price"),
    @NamedQuery(name = "Catalogue.findByReleaseDate", query = "SELECT c FROM Catalogue c WHERE c.releaseDate = :releaseDate"),
    @NamedQuery(name = "Catalogue.findByQty", query = "SELECT c FROM Catalogue c WHERE c.qty = :qty")})
public class Catalogue implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "product_id")
    private Integer productId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "product_name")
    private String productName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1000)
    @Column(name = "info")
    private String info;
    @Basic(optional = false)
    @NotNull
    @Column(name = "price")
    private float price;
    @Basic(optional = false)
    @NotNull
    @Column(name = "release_date")
    @Temporal(TemporalType.DATE)
    private Date releaseDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "qty")
    private int qty;

    public Catalogue() {
    }

    public Catalogue(Integer productId) {
        this.productId = productId;
    }

    public Catalogue(Integer productId, String productName, String info, float price, Date releaseDate, int qty) {
        this.productId = productId;
        this.productName = productName;
        this.info = info;
        this.price = price;
        this.releaseDate = releaseDate;
        this.qty = qty;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productId != null ? productId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Catalogue)) {
            return false;
        }
        Catalogue other = (Catalogue) object;
        if ((this.productId == null && other.productId != null) || (this.productId != null && !this.productId.equals(other.productId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "enterprise.web_jpa_war.entity.Catalogue[ productId=" + productId + " ]";
    }
    
}
