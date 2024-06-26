/**
 * ----------------------------------------------------------------------------
 * Autor: Kaue de Matos
 * Empresa: Nova Software
 * Propriedade da Empresa: Todos os direitos reservados
 * ----------------------------------------------------------------------------
 * Representa uma entidade de cliente dentro da empresa.
 */
package com.order.order.modules.Customer.Infra.persistence.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.order.order.modules.Auth.Infra.persistence.entity.UserEntity;
import com.order.order.modules.Cart.Infra.persistence.entity.CartEntity;
import com.order.order.modules.CustomerAddress.Infra.persistence.entity.CustomerAddressEntity;
import com.order.order.modules.Order.infra.persistence.entity.OrderEntity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@Table(name = "cliente")
@EqualsAndHashCode(of = "id_cliente")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomerEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * Identificador único do cliente.
     */
    @Id
    @Column(name = "id_cliente")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Endereço associado ao cliente.
     */
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_endereco")
    @JsonManagedReference
    private CustomerAddressEntity address;

    /**
     * Nome do cliente.
     */
    @NotBlank(message = "O nome não pode estar em branco")
    @Size(max = 50, message = "O nome deve ter no máximo 50 caracteres")
    @Column(name = "nome")
    private String name;

    /**
     * Sobrenome do cliente.
     */
    @Size(max = 100, message = "O sobrenome deve ter no máximo 100 caracteres")
    @Column(name = "sobrenome")
    private String lastName;

    /**
     * CPF do cliente.
     */
    @NotBlank(message = "O cpf não pode estar em branco")
    @Size(max = 100, message = "O CPF deve ter no máximo 11 caracteres")
    @Column(name = "cpf", length = 100)
    private String cpf;

    /**
     * Número de telefone do cliente.
     */
    @Size(max = 20, message = "O telefone deve ter no máximo 20 caracteres")
    @Column(name = "telefone")
    private String phone;

    /**
     * Idade do cliente.
     */
    @Max(value = 150, message = "A idade deve ser menor ou igual a 150")
    @Column(name = "idade")
    private int age;

    /**
     * Gênero do cliente.
     */
    @Size(max = 20, message = "O gênero deve ter no máximo 20 caracteres")
    @Column(name = "genero")
    private String gender;

    /**
     * Email do cliente.
     */
    @NotBlank(message = "O email não pode estar em branco")
    @Size(max = 100, message = "O email deve ter no máximo 100 caracteres")
    @Column(name = "email", unique = true)
    private String email;

    /**
     * Usuário associado ao cliente.
     */
    @OneToOne
    @JoinColumn(name = "iduser")
    private UserEntity user;

    /**
     * Lista de pedidos feitos pelo cliente.
     */
    @OneToMany(mappedBy = "client")
    private List<OrderEntity> orders;

    /**
     * Data de criação da conta do cliente
     */
    @DateTimeFormat(pattern= "dd-MM-yyyy")
    @Column(name = "date_criacao")
    private Date dateCreate;
    
    /**
     * Data de nascimento do cliente
     */
    @Column(name = "data_nascimento")
    private Date birthDate;

    /**
     * Lista de carrinhos associados ao cliente.
     */
    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<CartEntity> cartEntity;

    public CustomerEntity() {}
}
