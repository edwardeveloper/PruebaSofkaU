package com.mycompany.db;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

public class Vista extends javax.swing.JFrame {
    int posxRaton,posyRaton; 
    static String nombreJugador; 
    static Categoria[] categorias = new Categoria[5]; 
    static List<Pregunta> preguntas = new ArrayList<>();
    static List<Pregunta> preguntas1 = new ArrayList<>();
    static List<Pregunta> preguntas2 = new ArrayList<>();
    static List<Pregunta> preguntas3 = new ArrayList<>();
    static List<Pregunta> preguntas4 = new ArrayList<>();
    static Random rando = new Random();
    static int numeroRand;
    static int numeroRonda;
    static int premio = 0;
    static int[] premioss = {500,1000,1800,2500,6000};
    
    public Categoria[] bancoPreguntas(){
        Pregunta[] preguntasCategoria0 = new Pregunta[5];
                List<Respuesta> respuestaPreguntas0Categoria0 = new ArrayList<>(); 
                respuestaPreguntas0Categoria0.add(new Respuesta("Un lenguaje de programacion",false));
                respuestaPreguntas0Categoria0.add(new Respuesta("Un lenguaje de marcacion de hipertexto",true));
                respuestaPreguntas0Categoria0.add(new Respuesta("Estilos en cascada",false));
                respuestaPreguntas0Categoria0.add(new Respuesta("una pagina web",false));
                    preguntasCategoria0[0] = new Pregunta("¿Que es HTML?",respuestaPreguntas0Categoria0);
            preguntas.add(preguntasCategoria0[0]); 
                
                List<Respuesta> respuestaPreguntas1Categoria0 = new ArrayList<>();
                respuestaPreguntas1Categoria0.add(new Respuesta("Error en el servidor",false));
                respuestaPreguntas1Categoria0.add(new Respuesta("Demasiado tiempo de espera",false));
                respuestaPreguntas1Categoria0.add(new Respuesta("No autorizado",false));
                respuestaPreguntas1Categoria0.add(new Respuesta("Pagina no encontrada",true));
                    preguntasCategoria0[1] = new Pregunta("¿que significa el error 404?",respuestaPreguntas1Categoria0);
            preguntas.add(preguntasCategoria0[1]); 
               
                ArrayList<Respuesta> respuestaPreguntas2Categoria0 = new ArrayList<>();
                respuestaPreguntas2Categoria0.add(new Respuesta("int",false));
                respuestaPreguntas2Categoria0.add(new Respuesta("float",false));
                respuestaPreguntas2Categoria0.add(new Respuesta("float",false));
                respuestaPreguntas2Categoria0.add(new Respuesta("String",true));
                    preguntasCategoria0[2] = new Pregunta("¿Cual de los siguientes no es un tipo de dato primitivo?",respuestaPreguntas2Categoria0);
            preguntas.add(preguntasCategoria0[2]);
                
                ArrayList<Respuesta> respuestaPreguntas3Categoria0 = new ArrayList<>();
                respuestaPreguntas3Categoria0.add(new Respuesta("NodeJS",true));
                respuestaPreguntas3Categoria0.add(new Respuesta("Laravel",false));
                respuestaPreguntas3Categoria0.add(new Respuesta("Cake",false));
                respuestaPreguntas3Categoria0.add(new Respuesta("Django",false));
                    preguntasCategoria0[3] = new Pregunta("¿cual de los siguientes es un framework de javascript?",respuestaPreguntas3Categoria0);
            preguntas.add(preguntasCategoria0[3]);   
                
                List<Respuesta> respuestaPreguntas4Categoria0 = new ArrayList<>();
                respuestaPreguntas4Categoria0.add(new Respuesta("saturar un metodo con paramentros",false));
                respuestaPreguntas4Categoria0.add(new Respuesta("metodos con el mismo nombre pero parametros distintos",true));
                respuestaPreguntas4Categoria0.add(new Respuesta("llamar a un metodo varias veces",false));
                respuestaPreguntas4Categoria0.add(new Respuesta("renombrar a un metodo",false));
                    preguntasCategoria0[4] = new Pregunta("¿que es la sobrecarga de metodos?",respuestaPreguntas4Categoria0);
            preguntas.add(preguntasCategoria0[4]);
            categorias[0] = new Categoria("Categoria 1", "Facil",1,preguntas);
            
            //// Categoria 2
            
            Pregunta[] preguntasCategoria1 = new Pregunta[5];
                List<Respuesta> respuestaPreguntas0Categoria1 = new ArrayList<>(); 
                respuestaPreguntas0Categoria1.add(new Respuesta("echo(\"Hello World\");",false));
                respuestaPreguntas0Categoria1.add(new Respuesta("print(\"Hello World\");",false));
                respuestaPreguntas0Categoria1.add(new Respuesta(" System.out.println(\"Hello World\");",true));
                respuestaPreguntas0Categoria1.add(new Respuesta("Console.WriteLine(\"Hello World\");",false));
                    preguntasCategoria1[0] = new Pregunta("¿Cuál es la sintaxis correcta para generar \"Hello World\" en Java?",respuestaPreguntas0Categoria1);
            preguntas1.add(preguntasCategoria1[0]); 
                
                List<Respuesta> respuestaPreguntas1Categoria1 = new ArrayList<>();
                respuestaPreguntas1Categoria1.add(new Respuesta("int x = 2.8f;",false));
                respuestaPreguntas1Categoria1.add(new Respuesta("float x = 2.8f;",true));
                respuestaPreguntas1Categoria1.add(new Respuesta("byte x = 2.8f",false));
                respuestaPreguntas1Categoria1.add(new Respuesta("x = 2.8f;",false));
                    preguntasCategoria1[1] = new Pregunta("¿Cómo se crea una variable con el número flotante 2.8?",respuestaPreguntas1Categoria1);
            preguntas1.add(preguntasCategoria1[1]); 
               
                List<Respuesta> respuestaPreguntas2Categoria1 = new ArrayList<>();
                respuestaPreguntas2Categoria1.add(new Respuesta("len()",false));
                respuestaPreguntas2Categoria1.add(new Respuesta("getLength()",false));
                respuestaPreguntas2Categoria1.add(new Respuesta("getSize()",false));
                respuestaPreguntas2Categoria1.add(new Respuesta("length()",true));
                    preguntasCategoria1[2] = new Pregunta("¿Qué método se puede utilizar para encontrar la longitud de una cadena?",respuestaPreguntas2Categoria1);
            preguntas1.add(preguntasCategoria1[2]);
                
                List<Respuesta> respuestaPreguntas3Categoria1 = new ArrayList<>();
                respuestaPreguntas3Categoria1.add(new Respuesta("MyClass myObj = new MyClas();",true));
                respuestaPreguntas3Categoria1.add(new Respuesta("class myObj = new MyClass();",false));
                respuestaPreguntas3Categoria1.add(new Respuesta("class MyClass = new myObj();",false));
                respuestaPreguntas3Categoria1.add(new Respuesta("new myObj = MyClass();",false));
                    preguntasCategoria1[3] = new Pregunta("¿Cuál es la forma correcta de crear un objeto llamado myObj of MyClass?",respuestaPreguntas3Categoria1);
            preguntas1.add(preguntasCategoria1[3]);   
                
                List<Respuesta> respuestaPreguntas4Categoria1 = new ArrayList<>();
                respuestaPreguntas4Categoria1.add(new Respuesta("package",false));
                respuestaPreguntas4Categoria1.add(new Respuesta("getlib",false));
                respuestaPreguntas4Categoria1.add(new Respuesta("lib",false));
                respuestaPreguntas4Categoria1.add(new Respuesta("import",true));
                    preguntasCategoria1[4] = new Pregunta("¿Qué palabra clave se utiliza para importar un paquete de la biblioteca API de Java?",respuestaPreguntas4Categoria1);
            preguntas1.add(preguntasCategoria1[4]);
            categorias[1] = new Categoria("Categoria 2", "Normal",2,preguntas1);
            
            //// categoria 3
            
            Pregunta[] preguntasCategoria2 = new Pregunta[5];
                List<Respuesta> respuestaPreguntas0Categoria2 = new ArrayList<>(); 
                respuestaPreguntas0Categoria2.add(new Respuesta("upperCase()",false));
                respuestaPreguntas0Categoria2.add(new Respuesta("toUpperCase()",true));
                respuestaPreguntas0Categoria2.add(new Respuesta("touppercase()",false));
                respuestaPreguntas0Categoria2.add(new Respuesta("tuc()",false));
                    preguntasCategoria2[0] = new Pregunta("¿Qué método se puede utilizar para devolver una cadena en letras mayúsculas?",respuestaPreguntas0Categoria2);
            preguntas2.add(preguntasCategoria2[0]); 
                
                List<Respuesta> respuestaPreguntas1Categoria2 = new ArrayList<>();
                respuestaPreguntas1Categoria2.add(new Respuesta("Math.maximun(x,y);",false));
                respuestaPreguntas1Categoria2.add(new Respuesta("Math.largest(x,y);",false));
                respuestaPreguntas1Categoria2.add(new Respuesta("Math.maxNum(x,y);",false));
                respuestaPreguntas1Categoria2.add(new Respuesta("Math.max(x,y);",true));
                    preguntasCategoria2[1] = new Pregunta("¿Qué método se puede utilizar para encontrar el valor más alto de x y?",respuestaPreguntas1Categoria2);
            preguntas2.add(preguntasCategoria2[1]); 
               
                List<Respuesta> respuestaPreguntas2Categoria2 = new ArrayList<>();
                respuestaPreguntas2Categoria2.add(new Respuesta("getElementById(id).document",false));
                respuestaPreguntas2Categoria2.add(new Respuesta("document.getElement(id)",false));
                respuestaPreguntas2Categoria2.add(new Respuesta("document.getElementById(id)",true));
                respuestaPreguntas2Categoria2.add(new Respuesta("document.getId(id)",false));
                    preguntasCategoria2[2] = new Pregunta("¿Como se obtiene un elemento html con javascript?",respuestaPreguntas2Categoria2);
            preguntas2.add(preguntasCategoria2[2]);
                
                List<Respuesta> respuestaPreguntas3Categoria2 = new ArrayList<>();
                respuestaPreguntas3Categoria2.add(new Respuesta("MONGODB",true));
                respuestaPreguntas3Categoria2.add(new Respuesta("MYSQL",false));
                respuestaPreguntas3Categoria2.add(new Respuesta("MARIADB",false));
                respuestaPreguntas3Categoria2.add(new Respuesta("POSTGRESQL",false));
                    preguntasCategoria2[3] = new Pregunta("¿Cual no es un motor de base de datos relacionales?",respuestaPreguntas3Categoria2);
            preguntas2.add(preguntasCategoria2[3]);   
                
                List<Respuesta> respuestaPreguntas4Categoria2 = new ArrayList<>();
                respuestaPreguntas4Categoria2.add(new Respuesta("Postman",false));
                respuestaPreguntas4Categoria2.add(new Respuesta("Git",true));
                respuestaPreguntas4Categoria2.add(new Respuesta("API",false));
                respuestaPreguntas4Categoria2.add(new Respuesta("RestFull",false));
                    preguntasCategoria2[4] = new Pregunta("¿Cual es un sistema de control de versiones distribuido?",respuestaPreguntas4Categoria2);
            preguntas2.add(preguntasCategoria2[4]);
            categorias[2] = new Categoria("Categoria 3", "Intermedio",3,preguntas2);
            
            /// categoria 4
            
                Pregunta[] preguntasCategoria3 = new Pregunta[5];
                List<Respuesta> respuestaPreguntas0Categoria3 = new ArrayList<>(); 
                respuestaPreguntas0Categoria3.add(new Respuesta("controles de flujo",false));
                respuestaPreguntas0Categoria3.add(new Respuesta("un paradigma",false));
                respuestaPreguntas0Categoria3.add(new Respuesta("una propiedad del POO",false));
                respuestaPreguntas0Categoria3.add(new Respuesta("un evento que interrunpe la ejecucion del programa",true));
                    preguntasCategoria3[0] = new Pregunta("¿Que son las Excepciones?",respuestaPreguntas0Categoria3);
            preguntas3.add(preguntasCategoria3[0]); 
                
                List<Respuesta> respuestaPreguntas1Categoria3 = new ArrayList<>();
                respuestaPreguntas1Categoria3.add(new Respuesta("scrum",false));
                respuestaPreguntas1Categoria3.add(new Respuesta("Herencia",true));
                respuestaPreguntas1Categoria3.add(new Respuesta("Ciclos",false));
                respuestaPreguntas1Categoria3.add(new Respuesta("Recursividad",false));
                    preguntasCategoria3[1] = new Pregunta("¿Cual es un concepto de POO?",respuestaPreguntas1Categoria3);
            preguntas3.add(preguntasCategoria3[1]); 
               
                List<Respuesta> respuestaPreguntas2Categoria3 = new ArrayList<>();
                respuestaPreguntas2Categoria3.add(new Respuesta("Fisica",false));
                respuestaPreguntas2Categoria3.add(new Respuesta("Trasnporte",false));
                respuestaPreguntas2Categoria3.add(new Respuesta("Red",false));
                respuestaPreguntas2Categoria3.add(new Respuesta("Conexion",true));
                    preguntasCategoria3[2] = new Pregunta("¿Cual de estas no es una capa del modelo OSI?",respuestaPreguntas2Categoria3);
            preguntas3.add(preguntasCategoria3[2]);
                
                List<Respuesta> respuestaPreguntas3Categoria3 = new ArrayList<>();
                respuestaPreguntas3Categoria3.add(new Respuesta("802.11ax",true));
                respuestaPreguntas3Categoria3.add(new Respuesta("802.11ac wave2",false));
                respuestaPreguntas3Categoria3.add(new Respuesta("802.11ac wave1",false));
                respuestaPreguntas3Categoria3.add(new Respuesta("802.11n",false));
                    preguntasCategoria3[3] = new Pregunta("¿Que protocolo de WiFi supera los 2Gbps?",respuestaPreguntas3Categoria3);
            preguntas3.add(preguntasCategoria3[3]);   
                
                List<Respuesta> respuestaPreguntas4Categoria3 = new ArrayList<>();
                respuestaPreguntas4Categoria3.add(new Respuesta("Par trenzado",false));
                respuestaPreguntas4Categoria3.add(new Respuesta("Coaxial",false));
                respuestaPreguntas4Categoria3.add(new Respuesta("Comunicación Inhalámbrica",false));
                respuestaPreguntas4Categoria3.add(new Respuesta("Fibra Optica",true));
                    preguntasCategoria3[4] = new Pregunta("¿Cual de los medios de conexion es mas rapido?",respuestaPreguntas4Categoria3);
            preguntas3.add(preguntasCategoria3[4]);
            categorias[3] = new Categoria("Categoria 4", "Moderado",4,preguntas3);
            
            // categoria 5
            
                Pregunta[] preguntasCategoria4 = new Pregunta[5];
                List<Respuesta> respuestaPreguntas0Categoria4 = new ArrayList<>(); 
                respuestaPreguntas0Categoria4.add(new Respuesta("El formato de intercambio de datos",false));
                respuestaPreguntas0Categoria4.add(new Respuesta("El formato que obtenemos tras compilar un fuente .java",true));
                respuestaPreguntas0Categoria4.add(new Respuesta("Un tipo de variable",false));
                respuestaPreguntas0Categoria4.add(new Respuesta("Un depurador de código",false));
                    preguntasCategoria4[0] = new Pregunta("¿Qué es el bytecode en Java?",respuestaPreguntas0Categoria4);
            preguntas4.add(preguntasCategoria4[0]); 
                
                List<Respuesta> respuestaPreguntas1Categoria4 = new ArrayList<>();
                respuestaPreguntas1Categoria4.add(new Respuesta("ArrayList[0] = dato",false));
                respuestaPreguntas1Categoria4.add(new Respuesta("new ArrayList<dato>",false));
                respuestaPreguntas1Categoria4.add(new Respuesta("insert(dato)",false));
                respuestaPreguntas1Categoria4.add(new Respuesta(".add(dato)",true));
                    preguntasCategoria4[1] = new Pregunta("¿Como se agregan datos a un ArrayList?",respuestaPreguntas1Categoria4);
            preguntas4.add(preguntasCategoria4[1]); 
               
                List<Respuesta> respuestaPreguntas2Categoria4 = new ArrayList<>();
                respuestaPreguntas2Categoria4.add(new Respuesta("Systems House",false));
                respuestaPreguntas2Categoria4.add(new Respuesta("Hostings server",false));
                respuestaPreguntas2Categoria4.add(new Respuesta("Security Software Host",false));
                respuestaPreguntas2Categoria4.add(new Respuesta("Secure Shell",true));
                    preguntasCategoria4[2] = new Pregunta("¿Que es SSH?",respuestaPreguntas2Categoria4);
            preguntas4.add(preguntasCategoria4[2]);
                
                List<Respuesta> respuestaPreguntas3Categoria4 = new ArrayList<>();
                respuestaPreguntas3Categoria4.add(new Respuesta("DCCP",false));
                respuestaPreguntas3Categoria4.add(new Respuesta("SCTP",false));
                respuestaPreguntas3Categoria4.add(new Respuesta("UDP",false));
                respuestaPreguntas3Categoria4.add(new Respuesta("TCP",true));
                    preguntasCategoria4[3] = new Pregunta("¿Cual es un protocolo del control de la transmisión?",respuestaPreguntas3Categoria4);
            preguntas4.add(preguntasCategoria4[3]);   
                
                List<Respuesta> respuestaPreguntas4Categoria4 = new ArrayList<>();
                respuestaPreguntas4Categoria4.add(new Respuesta("3",false));
                respuestaPreguntas4Categoria4.add(new Respuesta("7",true));
                respuestaPreguntas4Categoria4.add(new Respuesta("6",false));
                respuestaPreguntas4Categoria4.add(new Respuesta("5",false));
                    preguntasCategoria4[4] = new Pregunta("¿Cuantas capas tiene el modelo OSI?",respuestaPreguntas4Categoria4);
            preguntas4.add(preguntasCategoria4[4]);
            categorias[4] = new Categoria("Categoria 5", "Dificil",5,preguntas4);
            return categorias;
    }
    
    public Vista() {
        initComponents();
        this.nombreJugador = JOptionPane.showInputDialog(null, "Ingrese su nombre de jugador");
        this.numeroRand = rando.nextInt(5);
        this.numeroRonda = 1;
        this.premio = 0; 
        Categoria[] categorias = bancoPreguntas();
        llenarCampos(numeroRonda, numeroRand);
        labelAcumulado.setText("0");
        labelNombreJugador.setText(nombreJugador);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        Background = new javax.swing.JPanel();
        panelMove = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        cerrar = new javax.swing.JLabel();
        Body = new javax.swing.JPanel();
        ronda = new javax.swing.JLabel();
        acumulado = new javax.swing.JLabel();
        checkbox1 = new java.awt.Checkbox();
        checkbox2 = new java.awt.Checkbox();
        checkbox3 = new java.awt.Checkbox();
        checkbox4 = new java.awt.Checkbox();
        panelContinuar = new javax.swing.JPanel();
        continuar = new javax.swing.JLabel();
        panelRetirarme = new javax.swing.JPanel();
        retirarme = new javax.swing.JLabel();
        panelHistorial = new javax.swing.JPanel();
        historial = new javax.swing.JLabel();
        labelPregunta = new javax.swing.JLabel();
        labelNumeroRonda = new javax.swing.JLabel();
        labelAcumulado = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labelJugador = new javax.swing.JLabel();
        labelNombreJugador = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelMove.setBackground(new java.awt.Color(18, 18, 18));
        panelMove.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelMoveMouseDragged(evt);
            }
        });
        panelMove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelMoveMousePressed(evt);
            }
        });

        Titulo.setBackground(new java.awt.Color(43, 176, 220));
        Titulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Titulo.setForeground(new java.awt.Color(43, 176, 220));
        Titulo.setText("JUEGO DE PREGUNTAS");

        cerrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cerrar.setForeground(new java.awt.Color(43, 176, 220));
        cerrar.setText("X");
        cerrar.setToolTipText("");
        cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelMoveLayout = new javax.swing.GroupLayout(panelMove);
        panelMove.setLayout(panelMoveLayout);
        panelMoveLayout.setHorizontalGroup(
            panelMoveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMoveLayout.createSequentialGroup()
                .addContainerGap(223, Short.MAX_VALUE)
                .addComponent(Titulo)
                .addGap(189, 189, 189)
                .addComponent(cerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(44, 44, 44))
        );
        panelMoveLayout.setVerticalGroup(
            panelMoveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMoveLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMoveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Titulo))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        Background.add(panelMove, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Body.setBackground(new java.awt.Color(43, 176, 220));

        ronda.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ronda.setForeground(new java.awt.Color(255, 255, 255));
        ronda.setText("RONDA");

        acumulado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        acumulado.setForeground(new java.awt.Color(255, 255, 255));
        acumulado.setText("PREMIO ACUMULADO");

        checkbox1.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        checkbox1.setLabel("checkbox1");
        checkbox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                checkbox1MousePressed(evt);
            }
        });

        checkbox2.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        checkbox2.setLabel("checkbox1");
        checkbox2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                checkbox2MousePressed(evt);
            }
        });

        checkbox3.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        checkbox3.setLabel("checkbox1");
        checkbox3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                checkbox3MousePressed(evt);
            }
        });

        checkbox4.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        checkbox4.setLabel("checkbox1");
        checkbox4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                checkbox4MousePressed(evt);
            }
        });

        panelContinuar.setBackground(new java.awt.Color(18, 18, 18));
        panelContinuar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        continuar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        continuar.setForeground(new java.awt.Color(255, 255, 255));
        continuar.setText("Continuar");
        continuar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        continuar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                continuarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                continuarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                continuarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelContinuarLayout = new javax.swing.GroupLayout(panelContinuar);
        panelContinuar.setLayout(panelContinuarLayout);
        panelContinuarLayout.setHorizontalGroup(
            panelContinuarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContinuarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(continuar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelContinuarLayout.setVerticalGroup(
            panelContinuarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContinuarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(continuar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelRetirarme.setBackground(new java.awt.Color(18, 18, 18));
        panelRetirarme.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        retirarme.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        retirarme.setForeground(new java.awt.Color(255, 255, 255));
        retirarme.setText("Retirarme");
        retirarme.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        retirarme.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                retirarmeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                retirarmeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                retirarmeMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelRetirarmeLayout = new javax.swing.GroupLayout(panelRetirarme);
        panelRetirarme.setLayout(panelRetirarmeLayout);
        panelRetirarmeLayout.setHorizontalGroup(
            panelRetirarmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRetirarmeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(retirarme)
                .addContainerGap())
        );
        panelRetirarmeLayout.setVerticalGroup(
            panelRetirarmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRetirarmeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(retirarme)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelHistorial.setBackground(new java.awt.Color(18, 18, 18));
        panelHistorial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        historial.setBackground(new java.awt.Color(255, 255, 255));
        historial.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        historial.setForeground(new java.awt.Color(255, 255, 255));
        historial.setText("Historial");
        historial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                historialMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                historialMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                historialMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelHistorialLayout = new javax.swing.GroupLayout(panelHistorial);
        panelHistorial.setLayout(panelHistorialLayout);
        panelHistorialLayout.setHorizontalGroup(
            panelHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHistorialLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(historial)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        panelHistorialLayout.setVerticalGroup(
            panelHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHistorialLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(historial)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        labelPregunta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelPregunta.setForeground(new java.awt.Color(18, 18, 18));
        labelPregunta.setText("pregunta");

        labelNumeroRonda.setForeground(new java.awt.Color(255, 255, 255));
        labelNumeroRonda.setText("#");

        labelAcumulado.setForeground(new java.awt.Color(18, 18, 18));
        labelAcumulado.setText("acumulado");

        jLabel2.setText("Puntos");

        labelJugador.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelJugador.setForeground(new java.awt.Color(255, 255, 255));
        labelJugador.setText("JUGADOR");

        labelNombreJugador.setForeground(new java.awt.Color(18, 18, 18));
        labelNombreJugador.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelNombreJugador.setText("nombre");
        labelNombreJugador.setAlignmentX(0.5F);

        javax.swing.GroupLayout BodyLayout = new javax.swing.GroupLayout(Body);
        Body.setLayout(BodyLayout);
        BodyLayout.setHorizontalGroup(
            BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BodyLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BodyLayout.createSequentialGroup()
                        .addComponent(checkbox1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(31, 31, 31)
                        .addComponent(labelJugador)
                        .addGap(134, 134, 134))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BodyLayout.createSequentialGroup()
                        .addComponent(ronda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelNumeroRonda, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 332, Short.MAX_VALUE)
                        .addComponent(acumulado)
                        .addGap(61, 61, 61))
                    .addGroup(BodyLayout.createSequentialGroup()
                        .addComponent(labelPregunta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelAcumulado)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(80, 80, 80))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BodyLayout.createSequentialGroup()
                        .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkbox2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(checkbox3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(checkbox4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(21, 21, 21)
                        .addComponent(labelNombreJugador)
                        .addGap(147, 147, 147))))
            .addGroup(BodyLayout.createSequentialGroup()
                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BodyLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(panelContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelRetirarme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BodyLayout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addComponent(panelHistorial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BodyLayout.setVerticalGroup(
            BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BodyLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ronda)
                    .addComponent(acumulado)
                    .addComponent(labelNumeroRonda))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPregunta)
                    .addComponent(labelAcumulado)
                    .addComponent(jLabel2))
                .addGap(13, 13, 13)
                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(checkbox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelJugador))
                .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BodyLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(checkbox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(checkbox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(checkbox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelRetirarme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(panelHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(BodyLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelNombreJugador)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        Background.add(Body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 630, 340));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, 610, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panelMoveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMoveMousePressed
        posxRaton = evt.getX();
        posyRaton = evt.getY();
    }//GEN-LAST:event_panelMoveMousePressed

    private void panelMoveMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMoveMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-posxRaton, y-posyRaton);
    }//GEN-LAST:event_panelMoveMouseDragged

    private void cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_cerrarMouseClicked

    private void continuarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_continuarMouseEntered
        panelContinuar.setBackground(new Color(46,46,46));
    }//GEN-LAST:event_continuarMouseEntered

    private void continuarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_continuarMouseExited
        panelContinuar.setBackground(new Color(18,18,18));
    }//GEN-LAST:event_continuarMouseExited

    private void retirarmeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_retirarmeMouseEntered
        panelRetirarme.setBackground(new Color(46,46,46));
    }//GEN-LAST:event_retirarmeMouseEntered

    private void retirarmeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_retirarmeMouseExited
        panelRetirarme.setBackground(new Color(18,18,18));
    }//GEN-LAST:event_retirarmeMouseExited

    private void historialMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_historialMouseEntered
        panelHistorial.setBackground(new Color(46,46,46));
    }//GEN-LAST:event_historialMouseEntered

    private void historialMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_historialMouseExited
        panelHistorial.setBackground(new Color(18,18,18));
    }//GEN-LAST:event_historialMouseExited

    private void continuarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_continuarMouseClicked
        String valor = null;        
        if(nombreJugador.isEmpty()){
            nombreJugador = JOptionPane.showInputDialog(null, "Ingrese su nombre de jugador para jugar de nuevo");
            labelNombreJugador.setText(nombreJugador);
        }else{
            if(checkbox1.getState()){
                valor = checkbox1.getLabel();
            }
            if(checkbox2.getState()){
                valor = checkbox2.getLabel();
            }
            if(checkbox3.getState()){
                valor = checkbox3.getLabel();
            }
            if(checkbox4.getState()){
                valor = checkbox4.getLabel();
            }

            for(int i=0;i<4;i++){
                if(categorias[numeroRonda-1].getPreguntaCategoria(numeroRand).getRespuestas(i).getPosibleRespuesta().equals(valor)){
                   if(categorias[numeroRonda-1].getPreguntaCategoria(numeroRand).getRespuestas(i).getRespuestasCorrecta()){
                       premio+=premioss[numeroRonda-1];
                       labelAcumulado.setText(String.valueOf(premio));
                       if(numeroRonda<5){
                           JOptionPane.showMessageDialog(null, "Premio acumulado: "+premio, "Respuesta correcta!",JOptionPane.INFORMATION_MESSAGE);
                            numeroRonda = numeroRonda+1;
                            numeroRand = rando.nextInt(5);
                            llenarCampos(numeroRonda, numeroRand);
                       }else{
                           try {
                               insertarJugadores(nombreJugador,"Gano",premio);
                           } catch (SQLException ex) {
                               JOptionPane.showMessageDialog(null, "Ha ocurrido un error ingresando al jugador "+ex);
                           }
                            JOptionPane.showMessageDialog(null, "has respondido bien la 5 preguntas: ", "Juego ganado!",JOptionPane.INFORMATION_MESSAGE);
                            labelAcumulado.setText(String.valueOf(premio));
                            nombreJugador = JOptionPane.showInputDialog(null, "Ingrese su nombre de jugador para jugar de nuevo");
                            labelNombreJugador.setText(nombreJugador);
                            premio = 0;
                            numeroRonda = 1;
                            numeroRand = rando.nextInt(5);
                            llenarCampos(numeroRonda, numeroRand);
                            labelAcumulado.setText(String.valueOf(premio));
                            nombreJugador = "";
                       }
                   }else{
                       try {
                            insertarJugadores(nombreJugador,"Perdio",0);
                        } catch (SQLException ex) {
                            JOptionPane.showMessageDialog(null, "Ha ocurrido un error ingresando al jugador "+ex);
                            Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
                        }
                       JOptionPane.showMessageDialog(null, "Respuesta incorrecta, has perdido el premio acumulado.","Respuesta incorrecta",JOptionPane.ERROR_MESSAGE);
                       nombreJugador = JOptionPane.showInputDialog(null, "Ingrese su nombre de jugador para jugar de nuevo");
                       labelNombreJugador.setText(nombreJugador);
                       premio=0;
                       numeroRonda = 1;
                       numeroRand = rando.nextInt(5);
                       llenarCampos(numeroRonda, numeroRand);
                       labelAcumulado.setText(String.valueOf(premio));
                       nombreJugador = "";
                   }                           
                }

            }
        }
        
        
    }//GEN-LAST:event_continuarMouseClicked

    private void checkbox1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkbox1MousePressed
        checkbox2.setState(false);
        checkbox3.setState(false);
        checkbox4.setState(false);        
    }//GEN-LAST:event_checkbox1MousePressed

    private void checkbox2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkbox2MousePressed
        checkbox1.setState(false);
        checkbox3.setState(false);
        checkbox4.setState(false);
    }//GEN-LAST:event_checkbox2MousePressed

    private void checkbox3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkbox3MousePressed
        checkbox1.setState(false);
        checkbox2.setState(false);
        checkbox4.setState(false);
    }//GEN-LAST:event_checkbox3MousePressed

    private void checkbox4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkbox4MousePressed
        checkbox1.setState(false);
        checkbox2.setState(false);
        checkbox3.setState(false);
    }//GEN-LAST:event_checkbox4MousePressed

    private void historialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_historialMouseClicked
        try {
            consultarJugadores();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al con la base de datos "+ex);
        }
    }//GEN-LAST:event_historialMouseClicked

    private void retirarmeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_retirarmeMouseClicked
        if(nombreJugador.isEmpty()){
            nombreJugador = JOptionPane.showInputDialog(null, "Ingrese su nombre de jugador para jugar de nuevo");
            labelNombreJugador.setText(nombreJugador);
        }else{
            try {
                insertarJugadores(nombreJugador,"Retiro",premio);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error ingresando al jugador "+ex);
            }
             JOptionPane.showMessageDialog(null, "Te has retirado con un premio de: "+premio+" puntos", "Juego retirado!",JOptionPane.INFORMATION_MESSAGE);
             nombreJugador = JOptionPane.showInputDialog(null, "Ingrese su nombre de jugador para jugar de nuevo");
             labelNombreJugador.setText(nombreJugador);
             premio = 0;
             numeroRonda = 1;
             numeroRand = rando.nextInt(5);
             llenarCampos(numeroRonda, numeroRand);
             labelAcumulado.setText(String.valueOf(premio));
        }
    }//GEN-LAST:event_retirarmeMouseClicked
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }
    
    // gets y sets
    public static String getNombreJugador() {
        return nombreJugador;
    }

    public static void setNombreJugador(String nombreJugador) {
        Vista.nombreJugador = nombreJugador;
    }

    public static Categoria[] getCategorias() {
        return categorias;
    }

    public static void setCategorias(Categoria[] categorias) {
        Vista.categorias = categorias;
    }

    public static int getNumeroRand() {
        return numeroRand;
    }

    public static void setNumeroRand(int numeroRand) {
        Vista.numeroRand = numeroRand;
    }

    public static int getNumeroRonda() {
        return numeroRonda;
    }

    public static void setNumeroRonda(int numeroRonda) {
        Vista.numeroRonda = numeroRonda;
    }

    public static int getPremio() {
        return premio;
    }

    public static void setPremio(int premio) {
        Vista.premio = premio;
    }

    public static int[] getPremioss() {
        return premioss;
    }

    public static void setPremioss(int[] premioss) {
        Vista.premioss = premioss;
    }
    
    /// Metodos de consulta y conexion
    public void llenarCampos(int numRonda,int numRandom){
        labelNumeroRonda.setText(String.valueOf(numeroRonda));
        labelPregunta.setText(categorias[numRonda-1].getPreguntaCategoria(numRandom).getPregunta());
        checkbox1.setLabel(categorias[numRonda-1].getPreguntaCategoria(numRandom).getRespuestas(0).getPosibleRespuesta());
        checkbox2.setLabel(categorias[numRonda-1].getPreguntaCategoria(numRandom).getRespuestas(1).getPosibleRespuesta());
        checkbox3.setLabel(categorias[numRonda-1].getPreguntaCategoria(numRandom).getRespuestas(2).getPosibleRespuesta());
        checkbox4.setLabel(categorias[numRonda-1].getPreguntaCategoria(numRandom).getRespuestas(3).getPosibleRespuesta()); 
    }
    
    public static void insertarJugadores(String jugador,String estado, int prem) throws SQLException{
        Connection connect = funcionConnect();
        String query = "INSERT INTO jugadores(NombreJugador,EstadoJugador,PremioJugador) VALUES(?,?,?)"; 
        PreparedStatement ps = connect.prepareStatement(query);
        ps.setString(1, jugador);
        ps.setString(2, estado);
        ps.setInt(3, prem);
        ps.executeUpdate();
       
        ps.close();
        connect.close();
    }
    
    public static void consultarJugadores() throws SQLException{
        Connection connect = funcionConnect();
        String query = "SELECT * FROM jugadores"; 
        
        PreparedStatement ps = connect.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        String cadena = "";
        while(rs.next()){
            String nombre = rs.getNString("NombreJugador");
            String estado = rs.getNString("EstadoJugador");
            int prem = rs.getInt("PremioJugador");
            cadena += "Jugador: "+nombre+"\n"+"Estado: "+estado+"\n"+"Premio: "+prem+" puntos"+"\n\n";
        }
        JOptionPane.showMessageDialog(null, cadena);
        rs.close();
        ps.close();
        connect.close();
    }
    
    public static Connection funcionConnect() throws SQLException{
       return DriverManager.getConnection("jdbc:mysql://localhost/jugadores_db?serverTimezone=UTC","root","");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JPanel Body;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel acumulado;
    private javax.swing.JLabel cerrar;
    private java.awt.Checkbox checkbox1;
    private java.awt.Checkbox checkbox2;
    private java.awt.Checkbox checkbox3;
    private java.awt.Checkbox checkbox4;
    private javax.swing.JLabel continuar;
    private javax.swing.JLabel historial;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel labelAcumulado;
    private javax.swing.JLabel labelJugador;
    private javax.swing.JLabel labelNombreJugador;
    private javax.swing.JLabel labelNumeroRonda;
    private javax.swing.JLabel labelPregunta;
    private javax.swing.JPanel panelContinuar;
    private javax.swing.JPanel panelHistorial;
    private javax.swing.JPanel panelMove;
    private javax.swing.JPanel panelRetirarme;
    private javax.swing.JLabel retirarme;
    private javax.swing.JLabel ronda;
    // End of variables declaration//GEN-END:variables
}
