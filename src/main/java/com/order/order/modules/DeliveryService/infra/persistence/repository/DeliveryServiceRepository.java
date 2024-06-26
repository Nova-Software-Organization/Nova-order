/**
 * ----------------------------------------------------------------------------
 * Autor: Kaue de Matos
 * Empresa: Nova Software
 * Propriedade da Empresa: Todos os direitos reservados
 * ----------------------------------------------------------------------------
 */
package com.order.order.modules.DeliveryService.infra.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.order.order.modules.DeliveryService.infra.persistence.entity.DeliveryServiceEntity;

public interface DeliveryServiceRepository extends JpaRepository<DeliveryServiceEntity, Long> { }
