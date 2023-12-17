package fci.swe.advanced.webappdemo.repos;

import fci.swe.advanced.webappdemo.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepo extends JpaRepository<User, String> {
}
