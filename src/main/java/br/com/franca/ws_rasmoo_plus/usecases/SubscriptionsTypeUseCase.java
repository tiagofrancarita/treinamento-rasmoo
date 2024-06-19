package br.com.franca.ws_rasmoo_plus.usecases;

import br.com.franca.ws_rasmoo_plus.model.SubscriptionsType;
import br.com.franca.ws_rasmoo_plus.repositories.SubscriptionTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@Service
public class SubscriptionsTypeUseCase {

    private Logger log = Logger.getLogger(SubscriptionsTypeUseCase.class.getName());

    private final SubscriptionTypeRepository subscriptionTypeRepository;

    @Autowired
    public SubscriptionsTypeUseCase(SubscriptionTypeRepository subscriptionTypeRepository) {
        this.subscriptionTypeRepository = subscriptionTypeRepository;
    }

    public List<SubscriptionsType> findAllSubscriptionsType() {

        log.info("Finding all subscription types");

        List<SubscriptionsType> findAll = subscriptionTypeRepository.findAll();

        if (findAll.isEmpty()) {
            log.warning("No subscription types found");
            throw new RuntimeException("No subscription types found");
        }
        log.info("Subscription types found");
        return findAll;
    }
}
