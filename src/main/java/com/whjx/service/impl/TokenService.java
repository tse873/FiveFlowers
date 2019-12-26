package com.whjx.service.impl;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.whjx.pojo.AdminInfo;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service("TokenService")
public class TokenService {

	public String getToken(AdminInfo adminInfo) {
		Date start = new Date();
		long currentTime = System.currentTimeMillis() + 60* 60 * 1000 * 7;//七天有效时间
		Date end = new Date(currentTime);
		String token = "";
		
		token = JWT.create().withAudience(adminInfo.getAdminName()).withIssuedAt(start).withExpiresAt(end)
				.sign(Algorithm.HMAC256(adminInfo.getAdminPassword()));
		return token;
	}
}
