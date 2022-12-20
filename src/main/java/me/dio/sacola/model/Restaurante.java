package me.dio.sacola.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor//atribui getters e setters para todos os objetos automaticamente
@Builder//Design patters
@Data//todos os getters e setters
@Entity//Conversao de classe para uma tabela no banco de dados
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@NoArgsConstructor//Contrutor vazio para construção de objetos
public class Restaurante {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Produto> cardapio;
    @Embedded
    private Endereco endereco;
}
