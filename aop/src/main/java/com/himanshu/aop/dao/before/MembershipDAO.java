package com.himanshu.aop.dao.before;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {

	public boolean accountMemmbershipDao() {
		System.out.println(getClass()+": is called for accountDao() method.");
		return false;
	}
	
}
