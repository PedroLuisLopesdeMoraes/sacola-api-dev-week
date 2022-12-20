package me.dio.sacola.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;

@AllArgsConstructor//atribui getters e setters para todos os objetos automaticamente
@Builder//Design patters
@Data//todos os getters e setters
@Embeddable
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@NoArgsConstructor//Contrutor vazio para construção de objetos
public class Endereco {
    private String cep;
    private String complemento;
}
