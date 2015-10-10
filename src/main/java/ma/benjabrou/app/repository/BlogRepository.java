package ma.benjabrou.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.benjabrou.app.entity.Blog;

public interface BlogRepository  extends JpaRepository<Blog,Integer>{

}
