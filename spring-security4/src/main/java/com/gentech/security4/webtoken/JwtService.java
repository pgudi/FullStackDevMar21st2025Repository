package com.gentech.security4.webtoken;

import java.time.Instant;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import javax.crypto.SecretKey;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
@Service
public class JwtService {
	private static final String secret="38ABDD3B17AA1F18543662F3B1F076DC09C63D5D1AFBC630D22FF277F62A8C997CF7C9DEAAA40EF95A8A230D2AFFDE3F910E00E4951217043F8694C3D7C1877E";
    private static final long validity=TimeUnit.MINUTES.toMillis(30);
	
	public String generateToken(UserDetails userDetails)
	{
		Map<String,String> claims=new HashMap<>();
		claims.put("issuer", "http://www.gentechacademy.com");
		return Jwts.builder()
		.claims(claims)
		.subject(userDetails.getUsername())
		.issuedAt(Date.from(Instant.now()))
		.expiration(Date.from(Instant.now().plusMillis(validity)))
		.signWith(generateKey())
		.compact();
	}
	
	public SecretKey generateKey()
	{
		byte[] decodedKey=Base64.getDecoder().decode(secret);
		return Keys.hmacShaKeyFor(decodedKey);
	}

	public String extractUser(String jwt) {
		Claims claims=Jwts.parser()
				.verifyWith(generateKey())
				.build()
				.parseSignedClaims(jwt)
				.getPayload();
			return claims.getSubject();
		
	}

	public boolean isTokenValid(String jwt) {
		Claims claims=Jwts.parser()
				.verifyWith(generateKey())
				.build()
				.parseSignedClaims(jwt)
				.getPayload();
		return claims.getExpiration().after(Date.from(Instant.now()));
	}
}
