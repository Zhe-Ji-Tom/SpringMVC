package springmvc;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class StringToDateConverter implements Converter<String,Date>{

	public Date convert(String source) {
		// TODO Auto-generated method stub
		if(source == null) {
			throw new RuntimeException("need date");
		}
		
		DateFormat df = new SimpleDateFormat("yyyy-mm-dd");
		try {
			return df.parse(source);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException("converter error");
		}
	}

}
