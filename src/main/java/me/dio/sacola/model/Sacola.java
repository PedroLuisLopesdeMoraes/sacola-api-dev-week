package me.dio.sacola.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.dio.sacola.enumeration.FormaPagamento;

import javax.persistence.*;
import java.util.List;


@AllArgsConstructor//atribui getters e setters para todos os objetos automaticamente
@Builder//Design patters
@Data//todos os getters e setters
@Entity//Conversao de classe para uma tabela no banco de dados
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@NoArgsConstructor//Contrutor vazio para construção de objetos
public class Sacola {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JsonIgnore
    private Cliente cliente;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Item> itens;
    private Double valorTotal;
    @Enumerated
    private FormaPagamento FormaPagamento;
    private boolean fechada;


}
