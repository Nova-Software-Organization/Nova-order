/**
 * ----------------------------------------------------------------------------
 * Autor: Kaue de Matos
 * Empresa: Nova Software
 * Propriedade da Empresa: Todos os direitos reservados
 * ----------------------------------------------------------------------------
 */
package com.order.order.modules.Delivery.infra.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.order.order.modules.Delivery.infra.persistence.entity.DeliveryEntity;

@Repository
public interface DeliveryRepository extends JpaRepository<DeliveryEntity, Long> {
    
}
