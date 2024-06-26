/**
 * ----------------------------------------------------------------------------
 * Autor: Kaue de Matos
 * Empresa: Nova Software
 * Propriedade da Empresa: Todos os direitos reservados
 * ----------------------------------------------------------------------------
 */
package com.order.order.modules.Shipping.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.order.order.modules.Shipping.persistence.entity.ShippingEntity;

@Repository
public interface ShippingRepository extends JpaRepository<ShippingEntity, Long> {
    
}
