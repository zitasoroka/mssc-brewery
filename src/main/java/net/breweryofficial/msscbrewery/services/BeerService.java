package net.breweryofficial.msscbrewery.services;

import net.breweryofficial.msscbrewery.web.model.BeerDto;


import java.util.UUID;

public interface BeerService {

    BeerDto getBeerById(UUID id);

    BeerDto saveNewBeer(BeerDto beerDto);

    void updateBeer(UUID beerId, BeerDto beerDto);

    void deleteById(UUID beerId);
}
