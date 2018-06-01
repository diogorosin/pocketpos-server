package br.com.pocketpos.server.orm;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="\"CompanyDeviceDatasetTariffProduct\"")
public class CompanyDeviceDatasetTariffProduct implements Serializable {

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CompanyDeviceDatasetTariffProductPK identifier;

	@NotNull
	@Column(name="\"active\"", nullable=false)
	private Boolean active;

	@NotNull
	@Column(name="\"price\"", nullable=false)
	private BigDecimal price;

	public CompanyDeviceDatasetTariffProductPK getIdentifier() {

		return identifier;

	}

	public void setIdentifier(CompanyDeviceDatasetTariffProductPK identifier) {

		this.identifier = identifier;

	}

	public Boolean getActive() {

		return active;

	}

	public void setActive(Boolean active) {

		this.active = active;

	}

	public BigDecimal getPrice() {

		return price;

	}

	public void setPrice(BigDecimal price) {

		this.price = price;

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
		CompanyDeviceDatasetTariffProduct other = (CompanyDeviceDatasetTariffProduct) obj;
		if (identifier == null) {
			if (other.identifier != null)
				return false;
		} else if (!identifier.equals(other.identifier))
			return false;
		return true;

	}

}