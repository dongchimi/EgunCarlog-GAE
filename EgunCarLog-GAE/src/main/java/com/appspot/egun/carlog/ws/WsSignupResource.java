package com.appspot.egun.carlog.ws;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

import com.appspot.egun.carlog.utility.JSONResponse;
import com.appspot.egun.carlog.utility.ResponseBuilder;
import com.appspot.egun.carlog.utility.validator.SignupValidator;
import com.sun.jersey.spi.resource.Singleton;

/**
 * 회원가입 Resource
 * 
 * @author dongkyu
 * @since 2011.1.25
 */
@Component
@Singleton
@Path("/ws/auth/signup")
public class WsSignupResource {

	@POST
	@Path("/register")
	@Produces(MediaType.APPLICATION_JSON)
	public JSONResponse register(@FormParam("userEmail") String userEmail,
								@FormParam("egunUserId") String userId,
									@FormParam("password") String password) {
		
		if (!SignupValidator.hasRequiredSingupParams(userId, userEmail, password)) {
			return ResponseBuilder.buildFailResponse("회원 가입에 필요한 항목이 없습니다.");
		}
//		boolean existUserEmail = egunUserProcess.existEmail(userEmail);
//		if (existUserEmail) {
//			return ResponseBuilder.buildFailResponse("이미 존재하는 이메일입니다.");
//		}
//		boolean existNickName = egunUserProcess.existNickName(nickName);
//		if (existNickName) {
//			return ResponseBuilder.buildFailResponse("이미 존재하는 이름입니다.");
//		}
//		
//		// 토큰 생성
//		String authToken = EgunU.generateAuthToken(userEmail, password, nickName);
//		
//		EgunUser user = new EgunUser();
//		user.setUserEmail(userEmail);
//		user.setNickName(nickName);
//		user.setPassword(password);
//		user.setAuthToken(authToken);
//		
//		Long oid = egunUserProcess.registerUser(user);
//		user.setOid(oid);

		return ResponseBuilder.buildFailResponse("not enough implement!!");
	}
}
