package org.example;



import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Biblioteca {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Canciones> listaDeCanciones = new ArrayList<>();
        Canciones cancion1 = new Canciones("eres mia","Romeo Santos",new Date(114,10,5), new Time(0,3,15),"Bachate","XXX","una pareja rompe y ella rehace su vida. Él, lejos de asumir la ruptura, decide acosarla, intimidarla");
        Canciones cancion2 = new Canciones("Destino o Casualidad ","Melendi",new Date(116,6,22),new Time(0,2,15),"pop","XXX","Ella iba caminando sola por la calle Pensando,Dios, ¡qué complicado es esto del amor!");
        Canciones cancion3 = new Canciones("Las locuras mia","Silvestre",new Date(120,5,15),new Time(0,3,00),"Vallenato","XXX","Por Dios, que no quisiera sentir esta ilusión Tal vez podría cometer un grave error Porque tú eres prohibida para mí");
        Canciones cancion4 = new Canciones("El precio del error","Luis Alberto Posada",new Date(98,4,15),new Time(0,4,00),"Despecho","XXX","No lo puedo creer Que esto le esté pasando a usted Que después de tanto alarde Después de tantos desaires Seas tú la tenga que volver");
        Canciones cancion5 = new Canciones("las estrellas","Manuel medrano",new Date(116,6,22),new Time(0,4,00),"pop","XXX","Buscando en las estrellas encontré unos ojos tan brillantes como nada que conozcas más allá que el sol porque eres tan bella Más que el cielo y las estrellas tú eres lo que faltaba y siempre quise que estuviera");
            ArrayList<Canciones> playList  = new ArrayList<>();


        listaDeCanciones.add(cancion1);
        listaDeCanciones.add(cancion2);
        listaDeCanciones.add(cancion3);
        listaDeCanciones.add(cancion4);
        listaDeCanciones.add(cancion5);
        int opcion = 0;
        int numeroC;
        String cancion;

        do{
            System.out.println("menu de opciones elige la opcion a realizar");
            System.out.println(" 1- Crear playList");
            System.out.println(" 2- filtrar Canciones Mismo Genero");
            System.out.println(" 3- filtrar Canciones en el mismo año");
            System.out.println(" 4- duracion y fecha de las Canciones");
            System.out.println(" 5- salir");
            System.out.println("INGRESA LA OPCION:");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                   System.out.println("TENEMOS LAS DIGIENTES CANCIONES DISPONIBLES");
                    System.out.println(""+cancion1.titulo);
                    System.out.println(""+cancion2.titulo);
                    System.out.println(""+cancion3.titulo);
                    System.out.println(""+cancion4.titulo);
                    System.out.println(""+cancion5.titulo);

                    /*for (int i = 0; i < listaDeCanciones.size(); i++) {
                        System.out.println("Cancion: " + listaDeCanciones.get(i).getTitulo());
                    }*/
                    System.out.println("INDIQUE LA CANTIDAD DE CANCIONES QUE  DESEAS AGREGAR A LA PLAYLIST");
                    numeroC = scanner.nextInt();
                    if (numeroC <= 5) {
                        for (int i = 1; i <= numeroC; i++) {
                            Canciones newSong = new Canciones();
                            addNewSong(newSong);
                            playList.add(newSong);
                            }
                          for (int i = 0; i < playList.size(); i++) {
                        System.out.println("Canciones en la Playlist: " + playList.get(i).getTitulo());
                    }
                        }else{
                        System.out.println("HAS AGREGADO EL MAXIMO DE CANCIONES * 5 *");
                    }



                    break;
                case 2:
                    System.out.println("GENERO DE LAS CANCIONES DISPONIBLES");

                    for (int i = 0; i <listaDeCanciones.size() ; i++) {
                        System.out.println("Cancion: " +listaDeCanciones.get(i).getGenero());
                    }
                    System.out.println("Ingrese el genero para filtrar canciones");
                    genderFilter(listaDeCanciones, scanner.next());
                    break;
                case 3:
                    System.out.println("FECHA DE LAS CANCIONES ");

                    for (int i = 0; i <listaDeCanciones.size() ; i++) {
                        System.out.println("Cancion: " +listaDeCanciones.get(i).getFecha());
                    }
                    System.out.println("Ingrese el año para filtrar canciones! ");
                    filterByYear(listaDeCanciones, scanner.nextInt());
                    break;
                case 4:
                    for (int i = 0; i <listaDeCanciones.size() ; i++) {
                        System.out.println("genero: "+ listaDeCanciones.get(i).getDuracion()+" ---" + listaDeCanciones.get(i).getFecha());
                    }
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("***OPCION NO DISPONIBLE INGRESA OTRA OPCION***");
                    break;
            }
        }while(opcion !=4);

    }
    public static void addNewSong(Canciones newSong) {
        Scanner scanner = new Scanner(System.in);
        //Datos generales
        System.out.println("Ingrese el nombre de la canción: ");
        newSong.setTitulo(scanner.nextLine());
       /* System.out.println("Ingrese el nombre del artista: ");
        newSong.setIdentificador(scanner.nextLine());
        System.out.println("Ingrese una descripción para la canción: ");
        newSong.setDescripcion(scanner.nextLine());


        //Toma de datos para la fecha.
        System.out.println("Ingrese el día del lanzamiento de la canción (dd): ");
        int dia = scanner.nextInt();
        System.out.println("Ingrese el mes del lanzamiento de la canción (MM): ");
        int mes = scanner.nextInt();
        System.out.println("Ingrese el año del lanzamiento de la canción (yyyy): ");
        int anio = scanner.nextInt();
        newSong.setFecha(new Date(dia, mes, anio));

        //Toma de datos para la duración.
        System.out.println("Ingrese la cantidad de segundos que tiene la canción: (mm)");
        int segundosTotal = scanner.nextInt();
        int mins = segundosTotal / 60;
        int segundos = segundosTotal % 60;
        System.out.println(mins + ":" + segundos);
        newSong.setDuracion(new Time(0, mins, segundos));*/

    }

    public static void genderFilter(ArrayList<Canciones> listOfSongs, String genre) {
        System.out.println("Lista de canciones del género " + genre);
        for(Canciones song: listOfSongs) {
            if (song.getGenero().toUpperCase().equals(genre.toUpperCase())) {
                System.out.println(song.toString());
            }
        }
    }
    public static void filterByYear( ArrayList<Canciones> listOfSongs, int year) {
        System.out.println("Lista de canciones del año " + year + "!");
        for(Canciones song: listOfSongs) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy"); //Para obtener solamente el año de la fecha del nodo actual
            int songYear = Integer.parseInt(dateFormat.format(song.getFecha()));
            if (songYear == year) {
                System.out.println(song.toString());
            }
        }
    }

}
