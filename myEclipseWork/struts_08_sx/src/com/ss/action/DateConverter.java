package com.ss.action;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

import com.opensymphony.xwork2.conversion.TypeConversionException;

public class DateConverter extends StrutsTypeConverter {

	private final DateFormat[] dfs={
			new SimpleDateFormat("yyyy-MM-dd"),
			new SimpleDateFormat("yyyy/MM/dd")
			
	};
	@Override
	public Object convertFromString(Map arg0, String[] arg1, Class arg2) {
		// TODO Auto-generated method stub
		String dateStr=arg1[0];
		for(int i=0;i<dfs.length;i++){
			try {
				return dfs[i].parse(dateStr);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				continue;
			}
		}
		throw new TypeConversionException();
	}

	@Override
	public String convertToString(Map arg0, Object arg1) {
		// TODO Auto-generated method stub
		Date date=(Date) arg1;
		return new SimpleDateFormat("yyyy-MM-dd").format(date);
	}

}
