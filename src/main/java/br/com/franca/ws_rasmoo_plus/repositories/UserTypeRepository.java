package br.com.franca.ws_rasmoo_plus.repositories;

import br.com.franca.ws_rasmoo_plus.model.UserType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserTypeRepository  extends JpaRepository<UserType, Long> {
}
