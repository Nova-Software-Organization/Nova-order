/**
 * ----------------------------------------------------------------------------
 * Autor: Kaue de Matos
 * Empresa: Nova Software
 * Propriedade da Empresa: Todos os direitos reservados
 * ----------------------------------------------------------------------------
 */

package com.order.order.modules.CustomerAddress.Domain.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.order.order.modules.Customer.Infra.persistence.entity.CustomerEntity;
import com.order.order.modules.Customer.Infra.persistence.repository.CustomerRepository;
import com.order.order.modules.CustomerAddress.Infra.persistence.entity.CustomerAddressEntity;

@Service
public class CustomerAddAddressService {
    
	@Autowired
    private CustomerRepository clientRepository;

	public CustomerEntity addAddressToClient(Long clientId, CustomerAddressEntity addressEntity) {
		CustomerEntity client = clientRepository.findById(clientId).orElse(null);

		if (client != null) {
			client.setAddress(addressEntity);
			CustomerEntity updatedClient = clientRepository.save(client);

			return updatedClient;
		} else {
			return null;
		}
	}
}
