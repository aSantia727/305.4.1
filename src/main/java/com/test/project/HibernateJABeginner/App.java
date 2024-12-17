

package com.test.project.HibernateJABeginner;

import com.test.hib.controller.findUser_Hql;
public class App 
{ 
	public static void main( String[] args )
    {
      findUser_Hql u = new findUser_Hql();
    	u.findUser();
    }
}