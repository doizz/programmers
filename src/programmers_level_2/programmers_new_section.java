package programmers_level_2;

import java.io.*;
import java.util.*;

public class programmers_new_section {

	public static void main(String[] args) {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        try {
	            System.out.println(getData(br));
	        } catch (IOException e) {
	            System.out.println("입출력 에러");
	        } catch (StringIndexOutOfBoundsException e) {
	            System.out.println("길이가 5미만");
	        }
	    }

	    private static String getData(BufferedReader br) throws IOException, StringIndexOutOfBoundsException {
	        String data = br.readLine();
	        data.substring(5, 11);
	        return data;
	    }
	}


