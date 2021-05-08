/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_josuedejesus;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author josue
 */
public class Lab3P2_JosueDeJesus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int opcion = 0;
        String admin = "admin";
        int contrasena = 1234;
        ArrayList tiendas = new ArrayList();
        ArrayList articulos = new ArrayList();
        ArrayList empleados = new ArrayList();
        
        do
        {
            String usuarioLogin;
            int contraLogin;
            opcion = Integer.parseInt(JOptionPane.showInputDialog("1 - Administrar\n"
                    + "2 - Cliente"));
            if(opcion == 1)
            {
                usuarioLogin = JOptionPane.showInputDialog("Ingrese el nombre de usuario");
                if(usuarioLogin.contains(admin) == false)
                {
                    String uIncorrecto="Nombre de usuario incorrecto!";
                    JOptionPane.showMessageDialog(null, uIncorrecto);
                }
                else
                {
                    contraLogin = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la contrasena"));
                    if(contraLogin != contrasena)
                    {
                        String cIncorrecta="Contrasena incorrecta!";
                        JOptionPane.showMessageDialog(null, cIncorrecta);
                    }
                    if(usuarioLogin.contains(admin) && contraLogin == contrasena)
                    {
                        opcion = Integer.parseInt(JOptionPane.showInputDialog("1 - Agregar tienda\n"
                        +"2 - Agregar articulos\n"
                        +"3 - Agregar empleados\n"
                        +"4 - Listar"));
            
                switch(opcion)
                {
                    //Agregar tienda
                    case 1:
                        String identificador, ubicacion, masVendido;
                        int empleado, cajas, totArticulos;
                    
                        identificador = JOptionPane.showInputDialog("Ingrese el id de la tienda");
                        ubicacion = JOptionPane.showInputDialog("Ingrese la ubicacion de la tienda");
                        empleado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de empleados"));
                        cajas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de cajas"));
                        masVendido = JOptionPane.showInputDialog("Ingrese el articulo mas vendido");
                        totArticulos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de articulos"));
                    
                        tiendas.add(new Tienda(identificador, ubicacion, empleado, cajas, masVendido, totArticulos));
                        break;
                 
                    //Ingresar articulos    
                    case 2:
                        double pantalla, grosor;
                        String marca, smart = "", tarjeta, bluray, limpieza, lector;
                        int seleccion, conexiones, almacenamiento, controles, accesorios, altavoces, potencia, aux, discos, usb;
                        opcion = Integer.parseInt(JOptionPane.showInputDialog("1 - Televisores\n"
                                + "2 - Consolas\n"
                                + "3 - Equipos de sonido\n"
                                + "4 - Teatros en casa"));
                    
                        //Televisores
                        if(opcion == 1)
                        {
                            pantalla = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamano de la pantalla"));
                            seleccion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese si es Smart tv: 1)Si 2)No"));
                            if(seleccion == 1)
                            {
                                smart = "Si";
                            }
                            else if(seleccion == 2)
                            {
                                smart = "No";
                            }
                            marca = JOptionPane.showInputDialog("Ingrese la marca");
                            conexiones = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de conexiones"));
                            grosor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el grosor"));
                            
                            articulos.add(new Televisores(pantalla, smart, marca, conexiones, grosor));
                        }
                    
                        //Consolas
                        if(opcion == 2)
                        {
                            marca = JOptionPane.showInputDialog("Ingrese la marca");
                            almacenamiento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de almacenamiento"));
                            controles = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de controles"));
                            accesorios = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de accesorios"));
                            tarjeta = JOptionPane.showInputDialog("Ingrese la informacion de la tarjeta de video");
                            articulos.add(new Consolas(marca, almacenamiento, controles, accesorios, tarjeta));
                        } 
                    
                        //Equipos de sonido
                        if(opcion == 3)
                        {
                            altavoces = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de altavoces"));
                            potencia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la potencia maxima"));
                            aux = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de puertos auxiliares"));
                            discos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad maxima de discos soportados"));
                            usb = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de puertos usb"));
                            articulos.add(new Sonido(altavoces, potencia, aux, discos, usb));
                        }
                    
                        //Teatros en casa
                        if(opcion == 4)
                        {
                            altavoces = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de altavoces"));
                            discos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de discos"));
                            bluray = JOptionPane.showInputDialog("Ingrese el tipo de Blu-Ray que soporta");
                            limpieza = JOptionPane.showInputDialog("Ingrese la informacion de limpieza");
                            lector = JOptionPane.showInputDialog("Ingrese la informacion del lector de discos");
                            articulos.add(new Teatro(altavoces, discos, bluray, limpieza, lector));
                        }
                        break;
                    
                    case 3:
                        String nombre, apellido, nacionalidad, horarioT, horarioA;
                        int salario, anos, meta, empleadosA;
                        opcion = Integer.parseInt(JOptionPane.showInputDialog("1 - Cajero\n"
                                + "2 - Supervisor\n"
                                + "3 - Asesor finaciero"));
                        //Cajeros
                        if(opcion == 1)
                        {
                            nombre = JOptionPane.showInputDialog("Ingrese el nombre");
                            apellido = JOptionPane.showInputDialog("Ingrese el apellido");
                            salario = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el salario"));
                            nacionalidad = JOptionPane.showInputDialog("Ingrese la nacionalidad");
                            anos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de anos laborando en Diunsa"));
                            horarioT = JOptionPane.showInputDialog("Ingrese el horario de trabajo");                       
                            horarioA = JOptionPane.showInputDialog("Ingrese el horario de almuerzo");
                            meta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la meta a vender por mes"));
                            empleadosA = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de empleados atendidos"));
                        }
                    
                        //Supervisor
                        if(opcion == 2)
                        {
                            nombre = JOptionPane.showInputDialog("Ingrese el nombre");
                            apellido = JOptionPane.showInputDialog("Ingrese el apellido");
                            salario = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el salario"));
                            nacionalidad = JOptionPane.showInputDialog("Ingrese la nacionalidad");
                            anos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de cajeros que supervisa"));
                            horarioT = JOptionPane.showInputDialog("Ingrese el horario de trabajo");                       
                            horarioA = JOptionPane.showInputDialog("Ingrese el horario de almuerzo");
                            meta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la meta a vender por mes"));
                            empleadosA = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de empleados atendidos"));
                        }
                     
                        //Asesor financiero
                        if(opcion == 3)
                        {
                            nombre = JOptionPane.showInputDialog("Ingrese el nombre");
                            apellido = JOptionPane.showInputDialog("Ingrese el apellido");
                            salario = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el salario"));
                            anos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de anos laborando en Diunsa"));
                            horarioT = JOptionPane.showInputDialog("Ingrese el horario de trabajo");                       
                            horarioA = JOptionPane.showInputDialog("Ingrese el horario de almuerzo");
                            meta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la meta a vender por mes"));
                            empleadosA = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de empleados atendidos"));
                        }
                        break;
                    
                    //Listar    
                    case 4:
                        opcion = Integer.parseInt(JOptionPane.showInputDialog("1 - Tiendas\n"
                                + "2 - Articulos"));
                     
                        //Tiendas
                        if(opcion == 1)
                        {
                            if(tiendas.isEmpty())
                            {
                                String salida="No se ha ingresado ninguna tienda";
                                JOptionPane.showMessageDialog(null, salida); 
                            }
                            else
                            {
                                String salida="";
                                for (Object t : tiendas) 
                                {
                                    if (t instanceof Tienda) 
                                    {
                                        salida+=tiendas.indexOf(t)+"- "+t+"\n";
                                    }
                                }
                                JOptionPane.showMessageDialog(null, salida); 
                            }
                        }
                    
                        //Articulos
                        if(opcion == 2)
                        {
                            opcion = Integer.parseInt(JOptionPane.showInputDialog("1 - Televisores\n"
                                    + "2 - Consolas\n"
                                    + "3 - Equipos de sonido\n"
                                    + "4 - Teatros en casa"));
                            if(opcion == 1)
                            {
                                if(articulos.isEmpty())
                                {
                                    String salida="No se ha ingresado ningun televisor";
                                    JOptionPane.showMessageDialog(null, salida); 
                                }
                                else
                                {
                                    String salida="";
                                    for (Object t : articulos) 
                                    {
                                        if (t instanceof Televisores) 
                                        {
                                            salida+=articulos.indexOf(t)+"- "+t+"\n";
                                        }
                                    }
                                    JOptionPane.showMessageDialog(null, salida); 
                                }
                            }
                        
                            if(opcion == 2)
                            {
                                if(articulos.isEmpty())
                                {
                                    String salida="No se ha ingresado ninguna consola";
                                    JOptionPane.showMessageDialog(null, salida); 
                                }
                                else
                                {
                                    String salida="";
                                    for (Object t : articulos) 
                                    {
                                        if (t instanceof Consolas) 
                                        {
                                            salida+=articulos.indexOf(t)+"- "+t+"\n";
                                        }
                                    }
                                    JOptionPane.showMessageDialog(null, salida); 
                                }
                            }
                        
                            if(opcion == 3)
                            {
                                if(articulos.isEmpty())
                                {
                                    String salida="No se ha ingresado ningun equipo de sonido";
                                    JOptionPane.showMessageDialog(null, salida); 
                                }
                                else
                                {
                                    String salida="";
                                    for (Object t : articulos) 
                                    {
                                        if (t instanceof Sonido) 
                                        {
                                            salida+=articulos.indexOf(t)+"- "+t+"\n";
                                        }
                                    }
                                    JOptionPane.showMessageDialog(null, salida); 
                                }
                            }
                        
                            if(opcion == 4)
                            {
                                if(articulos.isEmpty())
                                {
                                    String salida="No se ha ingresado ningun teatro en casa";
                                    JOptionPane.showMessageDialog(null, salida); 
                                }
                                else
                                {
                                    String salida="";
                                    for (Object t : articulos) 
                                    {
                                        if (t instanceof Teatro) 
                                        {
                                            salida+=articulos.indexOf(t)+"- "+t+"\n";
                                        }
                                    }
                                    JOptionPane.showMessageDialog(null, salida); 
                                }
                            }
                        }                          
                        break;
                }
                    }
                }
            } 
            else
                if(opcion == 2)
                {
                    JOptionPane.showInputDialog("1 - Crear usuario");
                }
        }while(opcion >= 1 && opcion <= 4);
   
    }
    
}
