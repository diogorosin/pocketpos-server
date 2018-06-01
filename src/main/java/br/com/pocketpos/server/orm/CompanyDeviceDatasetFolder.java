package br.com.pocketpos.server.orm;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(name="\"CompanyDeviceDatasetFolder\"")
public class CompanyDeviceDatasetFolder implements Serializable {

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CompanyDeviceDatasetFolderPK identifier;
	
	@NotNull
	private Boolean active;

	@NotNull
	@Column(name="\"position\"", nullable=false)
	private Integer position;

	@NotNull
	@Size(min=1,max=20)
	@Column(name="\"denomination\"", nullable=false)
	private String denomination;

	@OneToMany(
			fetch=FetchType.LAZY,
			mappedBy="identifier.companyDeviceDatasetFolder",
			cascade={CascadeType.ALL}, 
			orphanRemoval=true)
	private List<CompanyDeviceDatasetFolderProduct> products;

	public CompanyDeviceDatasetFolderPK getIdentifier() {

		return identifier;

	}

	public void setIdentifier(CompanyDeviceDatasetFolderPK identifier) {

		this.identifier = identifier;

	}

	public Boolean getActive() {

		return active;

	}

	public void setActive(Boolean active) {

		this.active = active;

	}	

	public Integer getPosition() {

		return position;

	}

	public void setPosition(Integer position) {

		this.position = position;

	}

	public String getDenomination() {

		return denomination;

	}

	public void setDenomination(String denomination) {

		this.denomination = denomination;

	}

	public List<CompanyDeviceDatasetFolderProduct> getProducts() {

		return products;

	}

	public void setProducts(List<CompanyDeviceDatasetFolderProduct> products) {

		this.products = products;

	}

	public int hashCode() {

		final int prime = 31;
		int result = 1;
		result = prime * result + ((identifier == null) ? 0 : identifier.hashCode());
		return result;

	}

	public boolean equals(Object obj) {

		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CompanyDeviceDatasetFolder other = (CompanyDeviceDatasetFolder) obj;
		if (identifier == null) {
			if (other.identifier != null)
				return false;
		} else if (!identifier.equals(other.identifier))
			return false;
		return true;

	}

}