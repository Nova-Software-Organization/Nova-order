/**
 * ----------------------------------------------------------------------------
 * Autor: Kaue de Matos
 * Empresa: Nova Software
 * Propriedade da Empresa: Todos os direitos reservados
 * ----------------------------------------------------------------------------
 */
package com.order.order.modules.Unity.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.order.order.modules.Unity.persistence.entity.UnityEntity;

@Repository
public interface UnityRepository extends JpaRepository<UnityEntity, Long>{ }
