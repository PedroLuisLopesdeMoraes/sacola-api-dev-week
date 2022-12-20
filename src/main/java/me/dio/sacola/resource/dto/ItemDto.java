package me.dio.sacola.resource.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@AllArgsConstructor//atribui getters e setters para todos os objetos automaticamente
@Builder//Design patters
@Data//todos os getters e setters
@Embeddable
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@NoArgsConstructor//Contrutor vazio para construção de objetos

public class ItemDto {

    private Long produtoId;
    private int quantidade;
    private Long idSacola;

    public Long getSacolaId() {
        return null;
    }
}
