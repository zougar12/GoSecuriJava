package MSPR;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public class Programme {
    public static void main(String[] args) throws IOException {
    	
    	String path = "CHEMIN VERS TXT FILES\\web\\txtfiles\\";
    	String chsavehtml = "CHEMIN VERS WEB\\web\\";
        String chsavepasswd = "CHEMIN VERS WEB\\web\\";

        List<MSPRs> equipementss = Utilitaire.lireDepuisFichier(path, chsavehtml, chsavepasswd);
    }
}
