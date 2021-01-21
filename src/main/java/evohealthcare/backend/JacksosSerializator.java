package evohealthcare.backend;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksosSerializator {
	/**
	 * Egy objetumrból JSON fájlt készít
	 * 
	 * @param input  Az objektum melyből JSON fájlt akarunk készíteni.
	 * @param output A fájl neve elérési úttal együtt.
	 */
	public static void getJackSON(Object input, String output) {
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			objectMapper.writeValue(new File(output), input);
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
