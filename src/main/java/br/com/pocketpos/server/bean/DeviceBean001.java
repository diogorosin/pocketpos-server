package br.com.pocketpos.server.bean;

public class DeviceBean001 {

	private Integer identifier;	

	private Boolean active;

	private String serialNumber;

	private String manufacturer;

	private String model;

	private String alias;

	public Integer getIdentifier() {

		return identifier;

	}

	public void setIdentifier(Integer identifier) {

		this.identifier = identifier;

	}

	public Boolean getActive() {

		return active;

	}

	public void setActive(Boolean active) {

		this.active = active;

	}

	public String getSerialNumber() {

		return serialNumber;

	}

	public void setSerialNumber(String serialNumber) {

		this.serialNumber = serialNumber;

	}

	public String getManufacturer() {

		return manufacturer;

	}

	public void setManufacturer(String manufacturer) {

		this.manufacturer = manufacturer;

	}

	public String getModel() {

		return model;

	}

	public void setModel(String model) {

		this.model = model;

	}

	public String getAlias() {

		return alias;

	}

	public void setAlias(String alias) {

		this.alias = alias;

	}

}