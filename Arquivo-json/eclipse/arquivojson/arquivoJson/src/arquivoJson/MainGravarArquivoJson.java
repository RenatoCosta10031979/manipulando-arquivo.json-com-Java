package arquivoJson;

	
	import java.io.FileWriter;

	import java.io.IOException;
	import java.util.ArrayList;
	import java.util.List;
	import com.google.gson.Gson;

	public class MainGravarArquivoJson {

		public static void main(String[] args) throws IOException {
			
			Usuario usuario1 = new Usuario();
			usuario1.setNome("Bartolomeu Andradas");
			usuario1.setEmail("12345@gmail.com");
			usuario1.setCpf("7654327-76");
			
			Usuario usuario2 = new Usuario();
			usuario2.setNome("Crementina Oliver");
			usuario2.setEmail("9876543@homtail.com");
			usuario2.setCpf("5432456-76");
			
			List<Usuario> usuarios = new ArrayList<Usuario>();
			usuarios.add(usuario1);
			usuarios.add(usuario2);
			
			for(Usuario iterator: usuarios) {
				System.out.println(iterator);
			}
			
			//String jsonUser = new Gson().toJson(usuarios);
			//System.out.println(jsonUser);
			
			
		}

}
