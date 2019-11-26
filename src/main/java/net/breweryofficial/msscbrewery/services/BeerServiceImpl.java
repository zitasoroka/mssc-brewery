package net.breweryofficial.msscbrewery.services;

import com.fasterxml.jackson.databind.deser.std.UUIDDeserializer;
import lombok.extern.slf4j.Slf4j;
import net.breweryofficial.msscbrewery.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService {

    @Override
    public BeerDto getBeerById(UUID id) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle("Pale Ale")
                .build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
    }

    public void deleteById(UUID beerId) {
        log.debug("Deleting a beer..");
    }
}
