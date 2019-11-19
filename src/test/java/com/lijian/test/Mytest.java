package com.lijian.test;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.lijian.DateUtils;
import com.lijian.StringUtils;
import com.lijian.Domain.Company;
import com.lijian.service.CompanyService;
@RunWith(SpringRunner.class)
@ContextConfiguration("classpath:spring-beans.xml")
public class Mytest {
	@Autowired
	private CompanyService ss;
	@Test
	public void add(){
		Company company=new Company();
		for (int i = 0; i < 10000; i++) {
			company.setName("北京"+StringUtils.getRandomCnn(4)+"有限公司");
			company.setCname(StringUtils.getChineseName());
			company.setAddress("北京市"+StringUtils.getRandomCnn(20-40));
			company.setCapital(StringUtils.getNum(100000, 100000000));
			int s=StringUtils.getNum(1, 9);
			company.setRegist("1001"+s+s+s+s+s+s+s+s+s+s+s);
			company.setTid(StringUtils.getNum(1, 11));
			company.setCread(DateUtils.randomDate("1980-01-01", "2019-11-18"));
			Date randomDate = DateUtils.randomDate("1980-01-01", "2019-11-18");
			/*company.setPeriod(randomDate.setYear(randomDate.getYear()+50)));*/
			
			
			
		}
	}
	
}
