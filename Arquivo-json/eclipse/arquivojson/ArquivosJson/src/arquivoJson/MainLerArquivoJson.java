package arquivoJson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;

public class MainLerArquivoJson {

	public static void main(String[] args) throws FileNotFoundException {
		
		
		FileReader jsonReader = new FileReader("/home/cafecomjava/eclipse/arquivojson/ArquivosJson/src/arquivoJson/arquivo.json");
	
		JsonArray jsonArray = (JsonArray) JsonParser.parseReader(jsonReader);
		
		List<Usuario> listUsuarios = new ArrayList<Usuario>();
		
		for(JsonElement jsonElement: jsonArray) {
			
			Usuario usuario = new Gson().fromJson(jsonElement, Usuario.class);
			listUsuarios.add(usuario);
			
		}
		System.out.println("Lendo arquivo Json\n "+ listUsuarios);
	}

}
