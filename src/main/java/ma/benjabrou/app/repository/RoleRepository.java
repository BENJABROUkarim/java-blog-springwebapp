package ma.benjabrou.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.benjabrou.app.entity.Role;



public interface RoleRepository  extends JpaRepository<Role, Integer>{

}
