/**
 * ----------------------------------------------------------------------------
 * Autor: Kaue de Matos
 * Empresa: Nova Software
 * Propriedade da Empresa: Todos os direitos reservados
 * ----------------------------------------------------------------------------
 */
package com.order.order.modules.Price.infra.repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.order.order.modules.Price.infra.entity.PriceEntity;
import com.order.order.modules.Product.Infra.persistence.entity.ProductEntity;

@Repository
public interface PriceRepository extends JpaRepository<PriceEntity, Long> {
    Optional<PriceEntity> findByProductEntityAndStatus(ProductEntity product, int status);
    List<ProductEntity> findByPriceBetween(BigDecimal minPrice, BigDecimal maxPrice);
}