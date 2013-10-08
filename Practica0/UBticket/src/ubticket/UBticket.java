package ubticket;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author paul
 */
public class UBticket {

    /**
     * @param args the command line arguments
     */
    
    
    /* menu de opcions */
    public static final int CREAR = 1;
    public static final int MODIFICAR = 2;
    public static final int ELIMINAR = 3;
    public static final int CONSULTAR = 4;

    
    /*menu de crear*/    
    public static final int CREAR_CATEGORIA = 1;
    public static final int CREAR_ESPECTACLE = 2;
    public static final int CREAR_ESPAI = 3;
    public static final int CREAR_SESSIO = 4;
    public static final int CREAR_ENTRADA = 5;
    public static final int CREAR_USUARI = 6;
    
    /*menu de modificar*/    
    public static final int MODIFICAR_CATEGORIA = 1;
    public static final int MODIFICAR_ESPECTACLE = 2;
    public static final int MODIFICAR_ESPAI = 3;
    public static final int MODIFICAR_SESSIO = 4;
    public static final int MODIFICAR_ENTRADA = 5;
    public static final int MODIFICAR_USUARI = 6;

    
    
    /*menu de eliminar*/    
    public static final int ELIMINAR_CATEGORIA = 1;
    public static final int ELIMINAR_ESPECTACLE = 2;
    public static final int ELIMINAR_ESPAI = 3;
    public static final int ELIMINAR_SESSIO = 4;
    public static final int ELIMINAR_ENTRADA = 5;
    public static final int ELIMINAR_USUARI = 6;
    
    
    /*menu de consultar*/    
    public static final int CONSULTAR_CATEGORIA = 1;
    public static final int CONSULTAR_ESPECTACLE = 2;
    public static final int CONSULTAR_ESPAI = 3;
    public static final int CONSULTAR_SESSIO = 4;
    public static final int CONSULTAR_ENTRADA = 5;
    public static final int CONSULTAR_USUARI = 6;

    
    /* menuModificarEspectacle */
    public static final int ESPECTACLE_MODIF_TITOL = 1;
    public static final int ESPECTACLE_MODIF_DESCRIPCIO = 2;
    
    /* menuModificarEspai */       
    public static final int ESPAI_MODIF_NOM = 1;
    public static final int ESPAI_MODIF_DADESCONTACTE = 2;
    public static final int ESPAI_MODIF_UBICACIO = 3;
            
    /* menuModificarSessio*/    
    public static final int SESSIO_MODIF_DATA = 1;
    public static final int SESSIO_MODIF_HORA = 2;
    public static final int SESSIO_MODIF_AFORAMENT = 3;
    
    
    /* menuModificarEntrada*/    
    public static final int ENTRADA_MODIF_FILA = 1;
    public static final int ENTRADA_MODIF_SEIENT = 2;
    public static final int ENTRADA_MODIF_PREU = 3;
    public static final int ENTRADA_MODIF_IVA = 4;
    public static final int ENTRADA_MODIF_IMPORTTOTAL = 5;
            
    
    /* menuModificarUsuari */
    public static final int USUARI_MODIF_DNI = 1;
    public static final int USUARI_MODIF_NOM = 2;
    public static final int USUARI_MODIF_DIRECCIO = 3;
    public static final int USUARI_MODIF_MUNICIPI = 4;
    public static final int USUARI_MODIF_PROVINCIA = 5;
    public static final int USUARI_MODIF_TELEFON = 6;
    public static final int USUARI_MODIF_DATA_ALTA = 7;
    public static final int USUARI_MODIF_DATA_DARRERA_COMPRA = 8;
    
    
    
    public  int subMenuOpcions(){
               
           Scanner sc;
	   sc = new Scanner(System.in);

           System.out.println("-----------------------------------------");
           System.out.println("            MENU DE OPCIONES             ");
           System.out.println("-----------------------------------------");
	   System.out.println("\n\t(1) Crear:");
	   System.out.println("\t(2) Modificar:");
	   System.out.println("\t(3) Eliminar:");
	   System.out.println("\t(4) Consultar:");
           System.out.println("\t(5) Salir:");                      
           System.out.println("-----------------------------------------");
	   System.out.println("Escoge una de las opciones:");

	   int opcion=sc.nextInt();
	   sc.nextLine();
	   return opcion;

    }

    
    public  int subMenuCrear(){
               
           Scanner sc;
	   sc = new Scanner(System.in);

           System.out.println("-----------------------------------------");
           System.out.println("            MENU DE CREAR                ");
           System.out.println("-----------------------------------------");
	   System.out.println("\n\t(1) Categoria:");
	   System.out.println("\t(2) Espectacle:");
	   System.out.println("\t(3) Espai:");
	   System.out.println("\t(4) Sessio:");
           System.out.println("\t(5) Entrada:");                      
           System.out.println("\t(6) Usuari:");                      
           System.out.println("\t(7) Atras:");                      
           System.out.println("-----------------------------------------");
	   System.out.println("Escoge una de las opciones:");

	   int opcion=sc.nextInt();
	   sc.nextLine();
	   return opcion;

    }
    
    public  int subMenuModificar(){
               
           Scanner sc;
	   sc = new Scanner(System.in);

           System.out.println("-----------------------------------------");
           System.out.println("            MENU DE MODIFICAR            ");
           System.out.println("-----------------------------------------");
	   System.out.println("\n\t(1) Categoria:");
	   System.out.println("\t(2) Espectacle:");
	   System.out.println("\t(3) Espai:");
	   System.out.println("\t(4) Sessio:");
           System.out.println("\t(5) Entrada:");                      
           System.out.println("\t(6) Usuari:");                      
           System.out.println("\t(7) Atras:");                      
           System.out.println("-----------------------------------------");
	   System.out.println("Escoge una de las opciones:");

	   int opcion=sc.nextInt();
	   sc.nextLine();
	   return opcion;

    }
    
    public  int subMenuEliminar(){
               
           Scanner sc;
	   sc = new Scanner(System.in);

           System.out.println("-----------------------------------------");
           System.out.println("            MENU DE ELIMINAR             ");
           System.out.println("-----------------------------------------");
	   System.out.println("\n\t(1) Categoria:");
	   System.out.println("\t(2) Espectacle:");
	   System.out.println("\t(3) Espai:");
	   System.out.println("\t(4) Sessio:");
           System.out.println("\t(5) Entrada:");                      
           System.out.println("\t(6) Usuari:");                      
           System.out.println("\t(7) Atras:");                      
           System.out.println("-----------------------------------------");
	   System.out.println("Escoge una de las opciones:");

	   int opcion=sc.nextInt();
	   sc.nextLine();
	   return opcion;

    }
    
    public  int subMenuConsultar(){
               
           Scanner sc;
	   sc = new Scanner(System.in);

           System.out.println("-----------------------------------------");
           System.out.println("            MENU DE CONSULTAR            ");
           System.out.println("-----------------------------------------");
	   System.out.println("\n\t(1) Categoria:");
	   System.out.println("\t(2) Espectacle:");
	   System.out.println("\t(3) Espai:");
	   System.out.println("\t(4) Sessio:");
           System.out.println("\t(5) Entrada:");                      
           System.out.println("\t(6) Usuari:");                      
           System.out.println("\t(7) Atras:");                      
           System.out.println("-----------------------------------------");
	   System.out.println("Escoge una de las opciones:");

	   int opcion=sc.nextInt();
	   sc.nextLine();
	   return opcion;

    }
    public static void main(String[] args) {
        // TODO code application logic here
   
        UBticket ubticket = new UBticket();
        ubticket.menuOpcions();
    }
    
    
    public void menuOpcions(){
            Usuari us = new Usuari("123456", "Paul", "C\barcelona", "Barcelona", "barcelona", "1234567", "091013", "091013");
        
            Session session = null;
            Transaction tx = null;
            try {
                session = ConnectorHB.getSession();
                //tx = session.beginTransaction();
                //session.save(us);

            }catch(Exception ex){

            }
        
           int opcion = subMenuOpcions();

           while (opcion!=5) {

                    switch (opcion) {

                            case CREAR:

                                menuCrear();

                                break;

                            case MODIFICAR:

                                menuModificar();

                                break;

                            case ELIMINAR:

                                menuEliminar();

                                break;

                            case CONSULTAR:

                                menuConsultar();

                                break;
                                
                            default:

                                System.out.println("opcion erronia");

                                break;
                    }
                    opcion = subMenuOpcions();
           }
           System.out.println("El programa ha acabado correctamente!");
    }
    
   
    public void menuCrear(){
           
           int opcion = subMenuCrear();

           while (opcion!=7) {

                    switch (opcion) {

                            case CREAR_CATEGORIA:

                                menuCrearCategoria();

                                break;

                            case CREAR_ESPECTACLE:

                                menuCrearEspectacle();

                                break;

                            case CREAR_ESPAI:

                                menuCrearEspai();

                                break;

                            case CREAR_SESSIO:

                                menuCrearSessio();

                                break;
                            case CREAR_ENTRADA:

                                menuCrearEntrada();

                                break;
                            case CREAR_USUARI:

                                menuCrearUsuari();

                                break;
                                
                            default:

                                System.out.println("opcion erronia");

                                break;
                    }
                    opcion = subMenuCrear();
           }
        
    }
    
    public void menuModificar(){
           
           int opcion = subMenuModificar();

           while (opcion!=7) {

                    switch (opcion) {

                            case MODIFICAR_CATEGORIA:

                                menuModificarCategoria();

                                break;

                            case MODIFICAR_ESPECTACLE:

                                menuModificarEspectacle();

                                break;

                            case MODIFICAR_ESPAI:

                                menuModificarEspai();

                                break;

                            case MODIFICAR_SESSIO:

                                menuModificarSessio();

                                break;
                            case MODIFICAR_ENTRADA:

                                menuModificarEntrada();

                                break;
                            case MODIFICAR_USUARI:

                                menuModificarUsuari();

                                break;
                                
                            default:

                                System.out.println("opcion erronia");

                                break;
                    }
                    opcion = subMenuModificar();
           }
        
    }
    
    public void menuEliminar(){
           
           int opcion = subMenuEliminar();

           while (opcion!=7) {

                    switch (opcion) {

                            case ELIMINAR_CATEGORIA:

                                menuEliminarCategoria();

                                break;

                            case ELIMINAR_ESPECTACLE:

                                menuEliminarEspectacle();

                                break;

                            case ELIMINAR_ESPAI:

                                menuEliminarEspai();

                                break;

                            case ELIMINAR_SESSIO:

                                menuEliminarSessio();

                                break;
                            case ELIMINAR_ENTRADA:

                                menuEliminarEntrada();

                                break;
                            case ELIMINAR_USUARI:

                                menuEliminarUsuari();

                                break;
                                
                            default:

                                System.out.println("opcion erronia");

                                break;
                    }
                    opcion = subMenuEliminar();
           }
        
    }
    
    public void menuConsultar(){
           
           int opcion = subMenuConsultar();

           while (opcion!=7) {

                    switch (opcion) {

                            case CONSULTAR_CATEGORIA:

                                menuConsultarCategoria();

                                break;

                            case CONSULTAR_ESPECTACLE:

                                menuConsultarEspectacle();

                                break;

                            case CONSULTAR_ESPAI:

                                menuConsultarEspai();

                                break;

                            case CONSULTAR_SESSIO:

                                menuConsultarSessio();

                                break;
                            case CONSULTAR_ENTRADA:

                                menuConsultarEntrada();

                                break;
                            case CONSULTAR_USUARI:

                                menuConsultarUsuari();

                                break;
                                
                            default:

                                System.out.println("opcion erronia");

                                break;
                    }
                    opcion = subMenuConsultar();
           }
        
    }
    
    
    /***************************************************************************************************************/
    
    public void menuCrearCategoria(){
           Scanner sc = new Scanner(System.in);
           String nom;
           Integer idEspectacle;
           
           System.out.print("Nombre:");
           nom = sc.nextLine();
           
           
           System.out.print("Elegir un id de espectacle:");
           idEspectacle = sc.nextInt();
           

    }
    
    /*
    public void menuCrearCategoria(){
           //        
    }*/
    
    
    public void menuCrearEspectacle(){
           Scanner sc = new Scanner(System.in);
           String titol;
           String descripcio;
           
           Integer idCategoria;
           
           System.out.print("Titol:");
           titol = sc.nextLine();

           while(titol.equals(" ")){
               System.out.print("Titol:");
               titol = sc.nextLine();    
           }
           
           System.out.print("Descripcio:");
           descripcio = sc.nextLine();
                                 
           /* Se obtiene la categoria */
           System.out.print("Elegir un id de la categoria:");
           idCategoria = sc.nextInt();
           
           /* Se crea el espectacle */
           
    }
    
    public void menuCrearEspai(){
               
           Scanner sc = new Scanner(System.in);
           String nom;
           String dades_contacte;
           String ubicacio;
           
           Integer idEspectacle;
           Integer idSessio;
           
           System.out.print("Nom:");
           nom = sc.nextLine();
           
           
           System.out.print("Dades contacte:");
           nom = sc.nextLine();
           
           
           System.out.print("Ubicacio:");
           nom = sc.nextLine();
           
      
           /* Se obtiene un espectacle */
           System.out.print("Elegir un id de espectacle:");
           idEspectacle = sc.nextInt();
           
           /* Se obtiene una sessio */
           System.out.print("Elegir un id de sessio:");
           idSessio = sc.nextInt();
           
           /* Se crea la sessio */
    }
   
    public void menuCrearSessio(){
             
           Scanner sc = new Scanner(System.in);
           String data;
           String hora;
           Integer aforament;
           
           Integer idEspectacle;
           Integer idEspai;
           Integer idEntrada;
           
           System.out.print("Data:");
           data = sc.nextLine();
           
           
           System.out.print("Hora:");
           hora = sc.nextLine();
           
           
           System.out.print("Aforament:");
           aforament = sc.nextInt();
           
           /* se obtiene un espectacle */
           System.out.print("Elegir un id de espectacle:");
           idEspectacle = sc.nextInt();
           
           /* se obtiene un espai */
           System.out.print("Elegir un id de espai:");
           idEspai = sc.nextInt();
           
           /* se obtiene entradas */
           System.out.print("Elegir un id de entrada:");
           idEntrada = sc.nextInt();
           
           
           
           /* se crea la sessio */
           
    }
    
    public void menuCrearEntrada(){
           Scanner sc = new Scanner(System.in);
           Integer fila;
           Integer seient;
           double preu;
           Integer iva;
           double import_total;
           
           Integer idSessio;
           Integer idUsuari;
           
           System.out.print("Fila:");
           fila = sc.nextInt();
           
           System.out.print("Seient:");
           seient = sc.nextInt();
           
           System.out.print("Preu:");
           preu = sc.nextDouble();
           
           System.out.print("Iva:");
           iva = sc.nextInt();
           
           System.out.print("Import total:");
           import_total = sc.nextDouble();
           
           /* obtener la sessio */
           System.out.print("Elegir un id de sessio:");
           idSessio = sc.nextInt();
           
           /* obtener usuario */
           System.out.print("Elegir un id de usuari:");
           idUsuari = sc.nextInt();
           
           
           /* crear entrada */

    }
    
    public void menuCrearUsuari(){
           Scanner sc = new Scanner(System.in);
           String dni;
           String nom;
           String direccio;
           String municipi;
           String provincia;
           
           Integer telefon;
           
           String data_alta;
           String data_darrera_compra;
           
           Integer idEntrada;
                                 
           System.out.print("Dni:");
           dni = sc.nextLine();
           
           System.out.print("Nom:");
           nom = sc.nextLine();
                      
           System.out.print("Direccio:");
           direccio = sc.nextLine();
                      
           System.out.print("Municipi:");
           municipi = sc.nextLine();
                      
           System.out.print("Provincia:");
           provincia = sc.nextLine();
                      
           System.out.print("Telefon:");
           telefon = sc.nextInt();
                      
           System.out.print("Data alta:");
           data_alta = sc.nextLine();
                      
           System.out.print("Data darrera compra:");
           data_darrera_compra = sc.nextLine();
           
           /* obtener entradas */
           System.out.print("Elegir un id de entrada:");
           idEntrada = sc.nextInt();
           
           
           
           /* crear usuari*/
           
    }
    
    /***************************************************************************************************/
    
    
    public void menuModificarCategoria(){
           Scanner sc = new Scanner(System.in);
           String nuevoNom;
           
           Integer idCategoria;
           
           
           System.out.print("Elegir un id de categoria:");
           idCategoria = sc.nextInt();
           
           System.out.print("Ingresa el nuevo nombre de Categoria:");
           nuevoNom = sc.nextLine();
           
           /* agregar el nuevo nombre a la categoria con "idCategoria" */


    }
    
    public int subMenuModifEspectacle(){
               
           Scanner sc;
	   sc = new Scanner(System.in);

           System.out.println("-----------------------------------------");
           System.out.println("           MODIFICAR ESPECTACLE          ");
           System.out.println("-----------------------------------------");
	   System.out.println("\n\t(1) Titol:");
	   System.out.println("\t(2) Descripcio:");	   
           System.out.println("\t(3) Atras");
           System.out.println("-----------------------------------------");
	   System.out.println("Escoge una de las opciones:");

	   int opcion=sc.nextInt();
	   sc.nextLine();
	   return opcion;

    }
               
    public void menuModificarEspectacle(){
           Scanner sc = new Scanner(System.in);
           Integer idCategoria;
           Integer idEspectacle;
           
           System.out.println("Elegir un id de categoria:");
           idCategoria = sc.nextInt();
           
           System.out.println("Elegir un id de Espectacle:");
           idCategoria = sc.nextInt();
           
           
           int opcion = subMenuModifEspectacle();
           
           while(opcion!=3){
               
               switch(opcion){
                   
                   case ESPECTACLE_MODIF_TITOL:
                       System.out.println("Actualiza el titol de espectacle:");
                       String titol;
                       titol = sc.nextLine();
                       
                       /* espectacle.setTitol(titol) */
                       
                       break;
                   case ESPECTACLE_MODIF_DESCRIPCIO:
                       System.out.println("Actualiza la descripcio de espectacle:");
                       String descripcio;
                       descripcio = sc.nextLine();
                       
                       /* espectacle.setDescripcio(titol) */
                       
                       break;
                       
                   default:
                       System.out.println("opcion erronia");
                       break;                                                                  
               }               
               opcion = subMenuModifEspectacle();               
           }           
    }
    
    
    public int subMenuModifEspai(){
               
           Scanner sc;
	   sc = new Scanner(System.in);

           System.out.println("-----------------------------------------");
           System.out.println("           MODIFICAR ESPAI               ");
           System.out.println("-----------------------------------------");
	   System.out.println("\n\t(1) Nom:");
	   System.out.println("\t(2) Dades de contacte:");	   
           System.out.println("\t(3) Ubicacio:");
           System.out.println("\t(4) Atras");
           System.out.println("-----------------------------------------");
	   System.out.println("Escoge una de las opciones:");

	   int opcion=sc.nextInt();
	   sc.nextLine();
	   return opcion;

    }
   
    public void menuModificarEspai(){
           Scanner sc = new Scanner(System.in);
           
           Integer idCategoria;
           Integer idEspectacle;
           Integer idEspai;
           
           System.out.println("Elegir un id de la lista de categoria:");
           idCategoria = sc.nextInt();
           
           System.out.println("Elegir un id de espectacle:");
           idEspectacle = sc.nextInt();
           
           System.out.println("Elegir un id de espai:");
           idEspai = sc.nextInt();
           
           int opcion = subMenuModifEspai();
           
           while(opcion!=4){
               
               switch(opcion){
                   
                   case ESPAI_MODIF_NOM:
                       System.out.println("Actualiza el nom de espai:");
                       String nom;
                       nom = sc.nextLine();
                       
                       /* espai.setNom(nom) */
                       
                       break;
                   case ESPAI_MODIF_DADESCONTACTE:
                       System.out.println("Actualiza dades de contacte de espai:");
                       String dadesContacte;
                       dadesContacte = sc.nextLine();
                       
                       /* espai.setDadesContacte(dadesContacte) */
                       
                       break;
                   case ESPAI_MODIF_UBICACIO:
                       System.out.println("Actualiza la ubicacio de espai:");
                       String ubicacio;
                       ubicacio = sc.nextLine();
                       
                       /* espai.setUbicacio(ubicacio) */
                       
                       break;
                       
                   default:
                       System.out.println("opcion erronia");
                       break;                                                                  
               }               
               opcion = subMenuModifEspai();               
           }           
    }
    
    
    public int subMenuModifSessio(){
               
           Scanner sc;
	   sc = new Scanner(System.in);

           System.out.println("-----------------------------------------");
           System.out.println("           MODIFICAR SESSIO              ");
           System.out.println("-----------------------------------------");
	   System.out.println("\n\t(1) Data:");
	   System.out.println("\t(2) Hora:");	   
           System.out.println("\t(3) Aforament:");
           System.out.println("\t(4) Atras");
           System.out.println("-----------------------------------------");
	   System.out.println("Escoge una de las opciones:");

	   int opcion=sc.nextInt();
	   sc.nextLine();
	   return opcion;

    }
    
    
    public void menuModificarSessio(){
           Scanner sc = new Scanner(System.in);
           
           
           Integer idCategoria;
           Integer idEspectacle;
           Integer idSessio;
           
           System.out.println("Elegir un id de la lista de categoria:");
           idCategoria = sc.nextInt();
           
           System.out.println("Elegir un id de espectacle:");
           idEspectacle = sc.nextInt();
           
           System.out.println("Elegir un id de sessio:");
           idSessio = sc.nextInt();
           
           int opcion = subMenuModifSessio();
           
           while(opcion!=4){
               
               switch(opcion){
                   
                   case SESSIO_MODIF_DATA:
                       System.out.println("Actualiza data de sessio:");
                       String data;
                       data = sc.nextLine();
                       
                       /* sessio.setData(data) */
                       
                       break;
                   case SESSIO_MODIF_HORA:
                       System.out.println("Actualiza hora de sessio:");
                       String hora;
                       hora = sc.nextLine();
                       
                       /* sessio.setHora(hora) */
                       
                       break;
                   case SESSIO_MODIF_AFORAMENT:
                       System.out.println("Actualiza aforament de sessio:");
                       Integer aforament;
                       aforament = sc.nextInt();
                       
                       /* sessio.setAforament(aforament) */
                       
                       break;
                       
                   default:
                       System.out.println("opcion erronia");
                       break;                                                                  
               }               
               opcion = subMenuModifSessio();               
           }           
    }
    
    
    public int subMenuModifEntrada(){
               
           Scanner sc;
	   sc = new Scanner(System.in);

           System.out.println("-----------------------------------------");
           System.out.println("           MODIFICAR ENTRADA             ");
           System.out.println("-----------------------------------------");
	   System.out.println("\n\t(1) Fila:");
	   System.out.println("\t(2) Seient:");	   
           System.out.println("\t(3) Preu:");
           System.out.println("\t(4) Iva:");	   
           System.out.println("\t(5) Import total:");
           System.out.println("\t(6) Atras");
           System.out.println("-----------------------------------------");
	   System.out.println("Escoge una de las opciones:");

	   int opcion=sc.nextInt();
	   sc.nextLine();
	   return opcion;

    }
    
   
    
    public void menuModificarEntrada(){
           Scanner sc = new Scanner(System.in);
           
            
           Integer idCategoria;
           Integer idEspectacle;
           Integer idSessio;
           Integer idEntrada;
           
           System.out.println("Elegir un id de la lista de categoria:");
           idCategoria = sc.nextInt();
           
           System.out.println("Elegir un id de espectacle:");
           idEspectacle = sc.nextInt();
           
           System.out.println("Elegir un id de sessio:");
           idSessio = sc.nextInt();
           
           System.out.println("Elegir un id de entrada:");
           idEntrada = sc.nextInt();
           
           int opcion = subMenuModifEntrada();
           
           while(opcion!=6){
               
               switch(opcion){
                   
                   case ENTRADA_MODIF_FILA:
                       System.out.println("Actualiza fila de entrada:");
                       Integer fila;
                       fila = sc.nextInt();
                       
                      
                       
                       break;
                   case ENTRADA_MODIF_SEIENT:
                       System.out.println("Actualiza seient de entrada:");
                       Integer seient;
                       seient = sc.nextInt();
                       
                       
                       
                       break;
                   case ENTRADA_MODIF_PREU:
                       System.out.println("Actualiza preu de entrada:");
                       double preu;
                       preu = sc.nextDouble();
                       
                       
                       
                       break;
                   
                   case ENTRADA_MODIF_IVA:
                       System.out.println("Actualiza iva de entrada:");
                       Integer iva;
                       iva = sc.nextInt();
                       
                       
                       
                       break;
                   
                   case ENTRADA_MODIF_IMPORTTOTAL:
                       System.out.println("Actualiza aforament de sessio:");
                       double importTotal;
                       importTotal = sc.nextDouble();
                       
                       
                       
                       break;
                       
                   default:
                       System.out.println("opcion erronia");
                       break;                                                                  
               }               
               opcion = subMenuModifEntrada();               
           }           
    }
     
    
    public int subMenuModifUsuari(){
               
           Scanner sc;
	   sc = new Scanner(System.in);

           System.out.println("-----------------------------------------");
           System.out.println("           MODIFICAR USUARI              ");
           System.out.println("-----------------------------------------");
	   System.out.println("\n\t(1) Dni:");
	   System.out.println("\t(2) Nom:");	   
           System.out.println("\t(3) Direccio:");
           System.out.println("\t(4) Municipi:");	   
           System.out.println("\t(5) Provincia:");
           System.out.println("\t(6) Telefon:");	   
           System.out.println("\t(7) Data alta:");
           System.out.println("\t(8) Data darrera compra:");           
           System.out.println("\t(9) Atras");
           System.out.println("-----------------------------------------");
	   System.out.println("Escoge una de las opciones:");

	   int opcion=sc.nextInt();
	   sc.nextLine();
	   return opcion;

    }
           
                        
                        
           
                    
            
    
    public void menuModificarUsuari(){
           Scanner sc = new Scanner(System.in);
           
           
           Integer idCategoria;
           Integer idEspectacle;
           Integer idSessio;
           Integer idEntrada;
           Integer idUsuari;
           
           System.out.println("Elegir un id de la lista de categoria:");
           idCategoria = sc.nextInt();
           
           System.out.println("Elegir un id de espectacle:");
           idEspectacle = sc.nextInt();
           
           System.out.println("Elegir un id de sessio:");
           idSessio = sc.nextInt();
           
           System.out.println("Elegir un id de entrada:");
           idEntrada = sc.nextInt();
           
           System.out.println("Elegir un dni de usuari:");
           idUsuari = sc.nextInt();
           
           int opcion = subMenuModifUsuari();
           
           while(opcion!=9){
               
               switch(opcion){
                   
                   case USUARI_MODIF_DNI:
                       System.out.println("Actualiza dni de usuari:");
                       String dni;
                       dni = sc.nextLine();
                                                                                           
                       break;
                   case USUARI_MODIF_NOM:
                       System.out.println("Actualiza nom de usuari:");
                       String nom;
                       nom = sc.nextLine();
                       
                       
                       
                       break;
                   case USUARI_MODIF_DIRECCIO:
                       System.out.println("Actualiza direccio de usuari:");
                       String direccio;
                       direccio = sc.nextLine();
                       
                       
                       
                       break;
                   
                   case USUARI_MODIF_MUNICIPI:
                       System.out.println("Actualiza municipi de usuari:");
                       String municipi;
                       municipi = sc.nextLine();
                       
                       
                       break;
                   
                   case USUARI_MODIF_PROVINCIA:
                       System.out.println("Actualiza provincia de usuari:");
                       String provincia;
                       provincia = sc.nextLine();
                       
                       
                       break;
                   case USUARI_MODIF_TELEFON:
                       System.out.println("Actualiza telefon de usuari:");
                       Integer telefon;
                       telefon = sc.nextInt();
                       
                       
                       
                       break;
                   case USUARI_MODIF_DATA_ALTA:
                       System.out.println("Actualiza data de alta de usuari:");
                       String dataAlta;
                       dataAlta = sc.nextLine();
                       
                       
                       break;
                   case USUARI_MODIF_DATA_DARRERA_COMPRA:
                       System.out.println("Actualiza data de darrera compra de usuari:");
                       String dataDarreraCompra;
                       dataDarreraCompra = sc.nextLine();
                                              
                       break;
                   default:
                       System.out.println("opcion erronia");
                       break;                                                                  
               }               
               opcion = subMenuModifUsuari();               
           }           
    }
    
    
    
    
    /************************************************************************************************************************************/   
    /*
    public void menuCrearCategoria(){
           //        
    }*/
    
       
    
    public void menuEliminarCategoria(){
           
           Scanner sc = new Scanner(System.in);
           Integer idCategoria;
           
           System.out.println("Elegir un id de categoria para eliminarla de la lista:");
           idCategoria = sc.nextInt();
           
    }
    
    public void menuEliminarEspectacle(){
           
           Scanner sc = new Scanner(System.in);
           
           Integer idCategoria;
           Integer idEspectacle;
           
           System.out.println("Elegir un id de la lista de categoria:");
           idCategoria = sc.nextInt();
           
           System.out.println("Elegir un id de espectacle para eliminarla de la lista:");
           idEspectacle = sc.nextInt();
           
           
    }
    
    public void menuEliminarEspai(){
           
           Scanner sc = new Scanner(System.in);
           
           Integer idCategoria;
           Integer idEspectacle;
           
           System.out.println("Elegir un id de la lista de categoria:");
           idCategoria = sc.nextInt();
           
           System.out.println("Elegir un id de espectacle:");
           idEspectacle = sc.nextInt();
           
           System.out.println("Eliminar el espai:");
           
           
           
    }
    
    
    public void menuEliminarSessio(){
           
           Scanner sc = new Scanner(System.in);
           
           Integer idCategoria;
           Integer idEspectacle;
           Integer idSessio;
           
           System.out.println("Elegir un id de la lista de categoria:");
           idCategoria = sc.nextInt();
           
           System.out.println("Elegir un id de espectacle:");
           idEspectacle = sc.nextInt();
           
           System.out.println("Elegir un id de sessio para eliminarla de la lista:");
           idSessio = sc.nextInt();
           
           
    }
    
    public void menuEliminarEntrada(){
           
           Scanner sc = new Scanner(System.in);
           
           Integer idCategoria;
           Integer idEspectacle;
           Integer idSessio;
           Integer idEntrada;
           
           System.out.println("Elegir un id de la lista de categoria:");
           idCategoria = sc.nextInt();
           
           System.out.println("Elegir un id de espectacle:");
           idEspectacle = sc.nextInt();
           
           System.out.println("Elegir un id de sessio:");
           idSessio = sc.nextInt();
           
           System.out.println("Elegir un id de entrada para eliminarla de la lista:");
           idEntrada = sc.nextInt();
           
    }
    
    public void menuEliminarUsuari(){
           
           Scanner sc = new Scanner(System.in);
           
           Integer idCategoria;
           Integer idEspectacle;
           Integer idSessio;
           Integer idEntrada;
           Integer idUsuari;
           
           System.out.println("Elegir un id de la lista de categoria:");
           idCategoria = sc.nextInt();
           
           System.out.println("Elegir un id de espectacle:");
           idEspectacle = sc.nextInt();
           
           System.out.println("Elegir un id de sessio:");
           idSessio = sc.nextInt();
           
           System.out.println("Elegir un id de entrada:");
           idEntrada = sc.nextInt();
           
           System.out.println("Elegir un dni de usuari para eliminarlo de la lista:");
           idUsuari = sc.nextInt();
           
    }
    
    /****************************************************************************************************************************/
    
    
    
    public void menuConsultarCategoria(){
           
           Scanner sc = new Scanner(System.in);
           Integer idCategoria;
           
           System.out.println("Elegir un id de categoria para consultar:");
           idCategoria = sc.nextInt();
           
    }
    
    public void menuConsultarEspectacle(){
           
           Scanner sc = new Scanner(System.in);
           
           Integer idCategoria;
           Integer idEspectacle;
           
           System.out.println("Elegir un id de la lista de categoria:");
           idCategoria = sc.nextInt();
           
           System.out.println("Elegir un id de espectacle para consultar:");
           idEspectacle = sc.nextInt();
           
           
    }
    
    public void menuConsultarEspai(){
           
           Scanner sc = new Scanner(System.in);
           
           Integer idCategoria;
           Integer idEspectacle;
           Integer idEspai;
           
           System.out.println("Elegir un id de la lista de categoria:");
           idCategoria = sc.nextInt();
           
           System.out.println("Elegir un id de espectacle:");
           idEspectacle = sc.nextInt();
           
           System.out.println("Elegir un id de espai para consultar:");
           idEspai = sc.nextInt();
           
           
    }
    
    
    public void menuConsultarSessio(){
           
           Scanner sc = new Scanner(System.in);
           
           Integer idCategoria;
           Integer idEspectacle;
           Integer idSessio;
           
           System.out.println("Elegir un id de la lista de categoria:");
           idCategoria = sc.nextInt();
           
           System.out.println("Elegir un id de espectacle:");
           idEspectacle = sc.nextInt();
           
           System.out.println("Elegir un id de sessio para consultar:");
           idSessio = sc.nextInt();
           
           
    }
    
    public void menuConsultarEntrada(){
           
           Scanner sc = new Scanner(System.in);
           
           Integer idCategoria;
           Integer idEspectacle;
           Integer idSessio;
           Integer idEntrada;
           
           System.out.println("Elegir un id de la lista de categoria:");
           idCategoria = sc.nextInt();
           
           System.out.println("Elegir un id de espectacle:");
           idEspectacle = sc.nextInt();
           
           System.out.println("Elegir un id de sessio:");
           idSessio = sc.nextInt();
           
           System.out.println("Elegir un id de entrada para consultar:");
           idEntrada = sc.nextInt();
           
    }
    
    public void menuConsultarUsuari(){
           
           Scanner sc = new Scanner(System.in);
           
           Integer idCategoria;
           Integer idEspectacle;
           Integer idSessio;
           Integer idEntrada;
           Integer idUsuari;
           
           System.out.println("Elegir un id de la lista de categoria:");
           idCategoria = sc.nextInt();
           
           System.out.println("Elegir un id de espectacle:");
           idEspectacle = sc.nextInt();
           
           System.out.println("Elegir un id de sessio:");
           idSessio = sc.nextInt();
           
           System.out.println("Elegir un id de entrada:");
           idEntrada = sc.nextInt();
           
           System.out.println("Elegir un dni de usuari para consultar:");
           idUsuari = sc.nextInt();
           
    }
    
 


}
