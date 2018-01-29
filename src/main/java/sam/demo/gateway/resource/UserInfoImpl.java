package sam.demo.gateway.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.ulisesbocchio.spring.boot.security.saml.annotation.SAMLUser;
import com.github.ulisesbocchio.spring.boot.security.saml.user.SAMLUserDetails;

@Controller
public class UserInfoImpl {
	
	
	@RequestMapping("/user")
	public String getUserInfo(@SAMLUser SAMLUserDetails user){
		return user.toString();		
		
	}

}
