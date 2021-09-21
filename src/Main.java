import java.io.IOException;

import com.dataman.*;

import com.member.*;
import com.member.Customer.FIELDS;


public class Main {
static DataManOp  dataManOp;
	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		
		Customer lCus = new Individual("name","2121233");
		lCus.changeFieldValue(FIELDS.PHONE_NUMBER, "3453");
		lCus.changeFieldValue(FIELDS.ADDRESS, "kasdjkaj");
		dataManOp.loadIt(lCus);
		dataManOp.add();
		

	}

}
