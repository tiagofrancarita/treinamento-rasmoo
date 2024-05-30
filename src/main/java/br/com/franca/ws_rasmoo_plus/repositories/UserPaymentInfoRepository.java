package br.com.franca.ws_rasmoo_plus.repositories;

import br.com.franca.ws_rasmoo_plus.model.UserPaymentInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserPaymentInfoRepository extends JpaRepository<UserPaymentInfo, Long> {
}
