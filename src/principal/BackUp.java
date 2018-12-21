package principal;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class BackUp {

	//Este programa faz o backup de todos os arquivos do diretório escolhido
	public static void main(String[] args) throws Exception {
		Path home = Paths.get("/home/valdeci/eclipse-workspace/java-entrada-saida/src/principal/");
		
		String filtro = "*.java";
		DirectoryStream<Path> stream = Files.newDirectoryStream(home,filtro);
		for(Path p:stream) {
			Path txt = home.resolve(p);
			Path backup = home.resolve(p+".bac");
			Files.copy(txt,backup, StandardCopyOption.REPLACE_EXISTING);
		}
	}

}
