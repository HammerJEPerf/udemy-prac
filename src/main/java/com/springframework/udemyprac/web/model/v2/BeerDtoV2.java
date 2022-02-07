package com.springframework.udemyprac.web.model.v2;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author joshua.hammer
 * on 02-07-22
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDtoV2 {
    private UUID id;
    private String beerName;
    private String beerStyle;
    private BeerStyleEnum beerStyleEnum;
    private Long upc;

}
