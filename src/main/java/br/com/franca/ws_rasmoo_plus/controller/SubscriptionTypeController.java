package br.com.franca.ws_rasmoo_plus.controller;


import br.com.franca.ws_rasmoo_plus.model.SubscriptionsType;
import br.com.franca.ws_rasmoo_plus.service.SubscriptionsTypeService;
import br.com.franca.ws_rasmoo_plus.usecases.SubscriptionsTypeUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/v1/subscriptions-types")
public class SubscriptionTypeController {

    private final SubscriptionsTypeUseCase subscriptionsTypeUseCase;
    private final SubscriptionsTypeService subscriptionsTypeService;

    public SubscriptionTypeController(SubscriptionsTypeUseCase subscriptionsTypeUseCase, SubscriptionsTypeService subscriptionsTypeService) {
        this.subscriptionsTypeUseCase = subscriptionsTypeUseCase;
        this.subscriptionsTypeService = subscriptionsTypeService;
    }

    @RequestMapping("/findAllSubscriptionsType")
   public ResponseEntity<List<SubscriptionsType>> findAllSubscriptionsType() {

        try {
            List<SubscriptionsType> subscriptionsTypes = subscriptionsTypeService.findAllSubscriptionsType();
            return ResponseEntity.ok(subscriptionsTypes);
        } catch (Exception eNotFound) {
            return ResponseEntity.notFound().build();
        }
   }
}
