package me.dio.sacola.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor//atribui getters e setters para todos os objetos automaticamente
@Builder//Design patters
@Data//todos os getters e setters
@Entity//Conversao de classe para uma tabela no banco de dados
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@NoArgsConstructor//Contrutor vazio para construção de objetos
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private double valorUnitario;
    @Builder.Default
    private Boolean disponivel = true;
    @ManyToOne
    @JsonIgnore
    private Restaurante restaurante;
}
