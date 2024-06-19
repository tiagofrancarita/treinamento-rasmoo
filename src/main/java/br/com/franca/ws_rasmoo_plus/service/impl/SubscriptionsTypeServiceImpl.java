package br.com.franca.ws_rasmoo_plus.service.impl;

import br.com.franca.ws_rasmoo_plus.model.SubscriptionsType;
import br.com.franca.ws_rasmoo_plus.repositories.SubscriptionTypeRepository;
import br.com.franca.ws_rasmoo_plus.service.SubscriptionsTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubscriptionsTypeServiceImpl implements SubscriptionsTypeService {

    private SubscriptionTypeRepository subscriptionTypeRepository;

    @Autowired
    public SubscriptionsTypeServiceImpl(SubscriptionTypeRepository subscriptionTypeRepository) {
        this.subscriptionTypeRepository = subscriptionTypeRepository;
    }

    @Override
    public List<SubscriptionsType> findAllSubscriptionsType() {
        return subscriptionTypeRepository.findAll();
    }

    @Override
    public SubscriptionsType findById(Long id) {
        return null;
    }

    @Override
    public SubscriptionsType create(SubscriptionsType subscriptionsType) {
        return null;
    }

    @Override
    public SubscriptionsType update(Long id, SubscriptionsType subscriptionsType) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
