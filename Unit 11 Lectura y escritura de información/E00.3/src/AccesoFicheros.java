import java.io.File;

public class AccesoFicheros {
    public static void main(String[] args) {
        File ruta = new File ("C:\\Users\\diego\\Documents\\GitHub\\Programation\\Unit 11\\E00.3");

        System.out.println(ruta.getAbsolutePath());

        String[] nombreArchivos = ruta.list();

        for (int i = 0; i < nombreArchivos.length; i++){
            System.out.println(nombreArchivos[i]);
            File f = new File (ruta.getAbsolutePath(), nombreArchivos[i]);
            if (f.isDirectory()){
                String[] archivosSubcarpeta = f.list();
                for (int j = 0; j < archivosSubcarpeta.length; j++){
                    System.out.println(archivosSubcarpeta[j]);
                }
            }
        }

    }


}
