/**
 * ----------------------------------------------------------------------------
 * Autor: Kaue de Matos
 * Empresa: Nova Software
 * Propriedade da Empresa: Todos os direitos reservados
 * ----------------------------------------------------------------------------
 */

package com.order.order.modules.CustomerAddress.Application.DTO;

import com.order.order.modules.Customer.Infra.persistence.entity.CustomerEntity;
import com.order.order.modules.CustomerAddress.Infra.persistence.entity.CustomerAddressEntity;

public class CustomerAddress {

	private CustomerEntity customerEntity;

	private CustomerAddressEntity addressEntity;

	public CustomerAddress() { }

	public CustomerAddress(CustomerEntity customerEntity, CustomerAddressEntity addressEntity) {
		this.customerEntity = customerEntity;
		this.addressEntity = addressEntity;
	}

	public CustomerEntity getcustomerEntity() {
		return customerEntity;
	}

	public void setcustomerEntity(CustomerEntity customerEntity) {
		this.customerEntity = customerEntity;
	}

	public CustomerAddressEntity getAddressEntity() {
		return addressEntity;
	}

	public void setAddressEntity(CustomerAddressEntity addressEntity) {
		this.addressEntity = addressEntity;
	}
}
