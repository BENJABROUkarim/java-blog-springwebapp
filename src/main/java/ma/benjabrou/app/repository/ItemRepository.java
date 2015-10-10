package ma.benjabrou.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.benjabrou.app.entity.Item;

public interface ItemRepository extends JpaRepository<Item,Integer>{

}
