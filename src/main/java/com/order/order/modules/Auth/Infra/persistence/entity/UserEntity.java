/**
 * ----------------------------------------------------------------------------
 * Autor: Kaue de Matos
 * Empresa: Nova Software
 * Propriedade da Empresa: Todos os direitos reservados
 * ----------------------------------------------------------------------------
 * Representa uma entidade de usuario dentro da empresa.
 */
package com.order.order.modules.Auth.Infra.persistence.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Representa uma entidade de usuário no sistema.
 */
@Data
@Entity(name = "usuario")
@EqualsAndHashCode(of = "id")
public class UserEntity {

    private static final long serialVersionUID = 1L;

    /**
     * Identificador único do usuário.
     */
    @Id
    @Column(name = "iduser")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Nome de usuário.
     */
    @NotBlank(message = "O nome de usuário não pode estar em branco")
    @Column(name = "apelido", unique = true)
    private String username;

    /**
     * Senha do usuário.
     */
    @NotBlank(message = "A senha não pode estar em branco")
    @Column(name = "senha")
    private String password;

    /**
     * Email do usuário.
     */
    @NotBlank(message = "O email não pode estar em branco")
    @Size(max = 100, message = "O email deve ter no máximo 100 caracteres")
    @Column(name = "email", unique = true)
    private String email;

    /**
     * Token de redefinição de senha do usuário.
     */
    @Column(name = "token_redefinicao_senha")
    private String resetPasswordToken;

    /**
     * Expiração do token de renovação de senha do usuário.
     */
    @Column(name = "reset_password_token_expiration")
    private LocalDateTime resetPasswordTokenExpiration;
}
