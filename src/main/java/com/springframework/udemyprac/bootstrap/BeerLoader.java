package com.springframework.udemyprac.bootstrap;

import com.springframework.udemyprac.domain.Beer;
import com.springframework.udemyprac.repositories.BeerRepository;
import org.springframework.boot.CommandLineRunner;

import java.math.BigDecimal;

public class BeerLoader implements CommandLineRunner {

    private final BeerRepository beerRepository;

    public BeerLoader(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadBeerObjects();
    }

    private void loadBeerObjects() {
        if(beerRepository.count() == 0){
            beerRepository.save(Beer.builder()
                    .beerName("Pinehopple")
                    .beerStyle("IPA")
                    .quantityToBrew(200)
                    .upc(337010000001L)
                    .price(new BigDecimal("12.95"))
                    .build());

            beerRepository.save(Beer.builder()
                    .beerName("Hard Apple")
                    .beerStyle("PALE_ALE")
                    .quantityToBrew(200)
                    .upc(337010000001L)
                    .price(new BigDecimal("12.95"))
                    .build());

            beerRepository.save(Beer.builder()
                    .beerName("Pinehopple")
                    .beerStyle("Cider")
                    .quantityToBrew(200)
                    .upc(337010000002L)
                    .price(new BigDecimal("11.95"))
                    .build());
        }
        System.out.println("Loaded Beers: " + beerRepository.count());
    }
}
