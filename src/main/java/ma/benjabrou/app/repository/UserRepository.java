package ma.benjabrou.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.benjabrou.app.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
