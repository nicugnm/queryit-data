package ro.nicolaemariusghergu.queryitdata.model;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode(callSuper = false)
public class Product extends BaseEntity {

    private BigDecimal price;

    private Integer quantity;

    private String iconPath;

    private Category category;

    private Promotion promotion;
}
