/**
 * ----------------------------------------------------------------------------
 * Autor: Kaue de Matos
 * Empresa: Nova Software
 * Propriedade da Empresa: Todos os direitos reservados
 * ----------------------------------------------------------------------------
 * Representa uma entidade de carrinho associado a um cliente.
 */
package com.order.order.modules.Cart.Infra.persistence.entity;

import java.io.Serializable;
import java.util.List;

import com.order.order.modules.CartItem.Infra.persistence.entity.CartItemEntity;
import com.order.order.modules.Customer.Infra.persistence.entity.CustomerEntity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "carrinho")
public class CartEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_carrinho")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private CustomerEntity customer;

    @OneToMany(mappedBy = "cartEntity", cascade = CascadeType.ALL)
    private List<CartItemEntity> cartItems;
}
