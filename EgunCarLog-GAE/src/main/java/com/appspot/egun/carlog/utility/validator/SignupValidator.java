package com.appspot.egun.carlog.utility.validator;

import com.appspot.egun.carlog.utility.StringU;

public class SignupValidator {

	public static boolean hasRequiredSingupParams(String userId, String userEmail, String password) {
		if (StringU.isEmptyOrNull(userId) || StringU.isEmptyOrNull(userEmail) || StringU.isEmptyOrNull(password)) {
			return false;
		}

		return true;
	}
}
