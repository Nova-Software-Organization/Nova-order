/**
 * ----------------------------------------------------------------------------
 * Autor: Kaue de Matos
 * Empresa: Nova Software
 * Propriedade da Empresa: Todos os direitos reservados
 * ----------------------------------------------------------------------------
 * Representa uma entidade de item do pedido dentro da empresa.
 */
package com.order.order.modules.OrderItem.infra.persistence.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import org.springframework.context.annotation.Lazy;

import com.order.order.modules.Order.infra.persistence.entity.OrderEntity;
import com.order.order.modules.Product.Infra.persistence.entity.ProductEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Representa uma entidade de item de pedido no sistema.
 */
@Lazy
@Data
@Entity
@Table(name = "pedido_item")
@EqualsAndHashCode(of = "id")
public class OrderItemEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * Identificador único do item de pedido.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ped_item")
    private Long id;

    /**
     * Entidade de pedido associada ao item.
     */
    @ManyToOne
    @JoinColumn(name = "id_num_ped")
    private OrderEntity order;

    /**
     * Entidade de produto associada ao item.
     */
    @ManyToOne
    @JoinColumn(name = "id_produto")
    private ProductEntity product;

    /**
     * Quantidade do produto no item.
     */
    @Column(name = "quantidade")
    private int quantity;

    /**
     * Preço unitário do produto no item.
     */
    @Column(name = "preco_uni")
    private BigDecimal unitPrice;
}
