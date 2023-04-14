package com.bank.app.security;

import java.util.Collection;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;

@SuppressWarnings("serial")
public class UsernamePasswordAuthentication extends UsernamePasswordAuthenticationToken {

	public UsernamePasswordAuthentication(Object principal, Object credentials) {
		super(principal, credentials);
	}

	public UsernamePasswordAuthentication(Object principal, Object credentials, Collection<? extends GrantedAuthority> authorities) {
		super(principal, credentials, authorities);
	}


}
