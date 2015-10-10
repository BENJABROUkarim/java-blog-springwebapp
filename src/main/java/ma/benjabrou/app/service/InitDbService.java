package ma.benjabrou.app.service;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.benjabrou.app.entity.Blog;
import ma.benjabrou.app.entity.Item;
import ma.benjabrou.app.entity.Role;
import ma.benjabrou.app.entity.User;
import ma.benjabrou.app.repository.BlogRepository;
import ma.benjabrou.app.repository.ItemRepository;
import ma.benjabrou.app.repository.RoleRepository;
import ma.benjabrou.app.repository.UserRepository;
@Transactional
@Service
public class InitDbService {
	@Autowired
	private RoleRepository rolerepository;
	
	@Autowired
	private UserRepository userrepository;
	
	@Autowired
	private ItemRepository itemrepository;
	
	@Autowired
	private BlogRepository blogrepository;
	
	
	@PostConstruct
	public void init(){
		Role roleuser=new Role();
		roleuser.setName("ROLE_USER");	
		rolerepository.save(roleuser);
		
		Role roleadmin=new Role();
		roleadmin.setName("ROLE_ADMIN");	
		rolerepository.save(roleadmin);
		
		 User useradmin = new User();
		useradmin.setName("admin");
		List<Role> roles= new ArrayList<Role>();
		roles.add(roleadmin);
		roles.add(roleuser);
		useradmin.setRoles(roles);
		userrepository.save(useradmin);
		
		Blog blogjavavids=new Blog();
		blogjavavids.setName("javavids");
		//blogjavavids.setUrl("http://feeds.feedsburner.com/javavids?format=xml");
		blogjavavids.setUser(useradmin);
		blogrepository.save(blogjavavids);
		
		Item item1=new Item();
		item1.setBlog(blogjavavids);
		item1.setTitle("first");
		//item1.setLink("http://www.javavids.com");
		item1.setPublishedDate(new Date(0));
		itemrepository.save(item1);
		
		Item item2=new Item();
		item2.setBlog(blogjavavids);
		item2.setTitle("second");
		//item2.setLink("http://www.javavids.com");
		item2.setPublishedDate(new Date(0));
		itemrepository.save(item2);
	}
}