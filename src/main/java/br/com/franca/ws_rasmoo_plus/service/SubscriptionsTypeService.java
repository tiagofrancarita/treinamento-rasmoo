package br.com.franca.ws_rasmoo_plus.service;

import br.com.franca.ws_rasmoo_plus.model.SubscriptionsType;

import java.util.List;

public interface SubscriptionsTypeService {

    List<SubscriptionsType> findAllSubscriptionsType();

    SubscriptionsType findById(Long id);

    SubscriptionsType create(SubscriptionsType subscriptionsType);

    SubscriptionsType update(Long id, SubscriptionsType subscriptionsType);

    void delete(Long id);

}