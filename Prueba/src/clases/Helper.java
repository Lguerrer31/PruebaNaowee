package clases;

import java.awt.Component;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author laura
 */
public class Helper {

    public static int mensaje(Component ventana, String info, String titulo, int tipo) {
        int retorno = -1;
        switch (tipo) {
            case 1:
                JOptionPane.showMessageDialog(ventana, info, titulo, JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(ventana, info, titulo, JOptionPane.ERROR_MESSAGE);
                break;
            case 3:
                retorno = JOptionPane.showConfirmDialog(ventana, info, titulo, JOptionPane.YES_NO_OPTION);
                break;
        }
        return retorno;
    }

    public static void habilitarBotones(JButton[] botones) {
        for (int i = 0; i < botones.length; i++) {
            botones[i].setEnabled(true);
        }
    }

    public static void deshabilitarBotones(JButton[] botones) {
        for (int i = 0; i < botones.length; i++) {
            botones[i].setEnabled(false);
        }
    }

    public static void editarCajaDeTexto(JTextField[] caja) {
        for (int i = 0; i < caja.length; i++) {
            caja[i].setEditable(true);
        }
    }

    public static void noEditarCajaTexto(JTextField[] caja) {
        for (int i = 0; i < caja.length; i++) {
            caja[i].setEditable(false);
        }
    }

    public static void LimpiarTabla(JTable tabla) {
        int nf, nc;
        nf = tabla.getRowCount();
        nc = tabla.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                tabla.setValueAt("", i, j);
            }
        }
    }

    public static void LlenadoTabla(JTable tabla, String ruta) {
        int nf;
        DefaultTableModel tm;
        ArrayList<Cliente> cliente = TraerDatos(ruta);
        tm = (DefaultTableModel) tabla.getModel();
        nf = cliente.size();
        tm.setRowCount(nf);
        LimpiarTabla(tabla);
        for (int i = 0; i < nf; i++) {
            tm.setValueAt(i + 1, i, 0);
            tm.setValueAt(cliente.get(i).getIdentificacion(), i, 1);
            tm.setValueAt(cliente.get(i).getNombre(), i, 2);
            tm.setValueAt(cliente.get(i).getPrimer_apellido(), i, 3);
            tm.setValueAt(cliente.get(i).getSegundo_apellido(), i, 4);
            tm.setValueAt(cliente.get(i).getEdad(), i, 5);
            tm.setValueAt(cliente.get(i).getSexo(), i, 6);
            tm.setValueAt(cliente.get(i).getEmail(), i, 7);
            tm.setValueAt(cliente.get(i).getTel(), i, 8);
            tm.setValueAt(cliente.get(i).getDireccion(), i, 9);
            tm.setValueAt(cliente.get(i).getVentas(), i, 10);
        }
    }

    public static void LlenadoTablaVentas(JTable tabla, ArrayList<Cliente> cliente) {
        int nf;
        DefaultTableModel tm;
        tm = (DefaultTableModel) tabla.getModel();
        nf = cliente.size();
        tm.setRowCount(nf);
        LimpiarTabla(tabla);
        for (int i = 0; i < nf; i++) {
            tm.setValueAt(i + 1, i, 0);
            tm.setValueAt(cliente.get(i).getIdentificacion(), i, 1);
            tm.setValueAt(cliente.get(i).getNombre(), i, 2);
            tm.setValueAt(cliente.get(i).getPrimer_apellido(), i, 3);
        }
    }

    public static void LlenadoTabla2(JTable tabla, ArrayList<Cliente> cliente) {
        int nf;
        DefaultTableModel tm;
        tm = (DefaultTableModel) tabla.getModel();
        nf = cliente.size();
        tm.setRowCount(nf);
        LimpiarTabla(tabla);
        for (int i = 0; i < nf; i++) {
            tm.setValueAt(i + 1, i, 0);
            tm.setValueAt(cliente.get(i).getIdentificacion(), i, 1);
            tm.setValueAt(cliente.get(i).getNombre(), i, 2);
            tm.setValueAt(cliente.get(i).getEdad(), i, 3);
        }
    }

    public static void LlenadoTablaI(JTable tabla, String ruta) {
        int nf;
        DefaultTableModel tm;
        ArrayList<Ventas> ventas = TraerDatos(ruta);
        tm = (DefaultTableModel) tabla.getModel();
        nf = ventas.size();
        tm.setRowCount(nf);
        LimpiarTabla(tabla);
        for (int i = 0; i < nf; i++) {
            tm.setValueAt(i + 1, i, 0);
            tm.setValueAt(ventas.get(i).getIdentificacion(), i, 1);
            tm.setValueAt(ventas.get(i).getNombre(), i, 2);
            tm.setValueAt(ventas.get(i).getEstado(), i, 3);
            tm.setValueAt(ventas.get(i).getFecha(), i, 4);
            tm.setValueAt(ventas.get(i).getDireccion(), i, 5);

        }
    }

    public static void LlenadoTablaI(JTable tabla, ArrayList<Ventas> ventas) {
        int nf;
        DefaultTableModel tm;
        tm = (DefaultTableModel) tabla.getModel();
        nf = ventas.size();
        tm.setRowCount(nf);
        LimpiarTabla(tabla);
        for (int i = 0; i < nf; i++) {
            tm.setValueAt(i + 1, i, 0);
            tm.setValueAt(ventas.get(i).getDireccion(), i, 1);
            tm.setValueAt(ventas.get(i).getIdentificacion(), i, 2);
        }
    }

    public static ArrayList TraerDatos(String ruta) {
        FileInputStream archivo;
        ObjectInputStream entrada;
        ArrayList cliente = new ArrayList();
        Object p;
        try {
            archivo = new FileInputStream(ruta);
            entrada = new ObjectInputStream(archivo);
            while ((p = entrada.readObject()) != null) {
                cliente.add(p);
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return cliente;
    }

    public static ArrayList TraerDatosI(String ruta) {
        FileInputStream archivo;
        ObjectInputStream entrada;
        ArrayList ventas = new ArrayList();
        Object p;
        try {
            archivo = new FileInputStream(ruta);
            entrada = new ObjectInputStream(archivo);
            while ((p = entrada.readObject()) != null) {
                ventas.add(p);
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return ventas;
    }

    public static void Volcado(ObjectOutputStream salida, ArrayList cliente) {
        for (int i = 0; i < cliente.size(); i++) {
            try {
                salida.writeObject(cliente.get(i));
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public static void VolcadoI(ObjectOutputStream salida, ArrayList ventas) {
        for (int i = 0; i < ventas.size(); i++) {
            try {
                salida.writeObject(ventas.get(i));
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public static void ListadoClientesPorVentas(JTable tabla, String ruta, String si, String no) {
        ArrayList<Ventas> ventas = TraerDatosI(ruta);
        ArrayList<Ventas> ventasFiltrados = new ArrayList();
        for (int i = 0; i < ventas.size(); i++) {
            if (ventas.get(i).getEstado().equals(si)) {
                ventasFiltrados.add(ventas.get(i));
            } else if (ventas.get(i).getEstado().equals(no)) {
                ventasFiltrados.add(ventas.get(i));
            }
        }
        LlenadoTablaI(tabla, ventasFiltrados);
    }

    public static Cliente traerCliente(String identificacion, String ruta) {
        ArrayList<Cliente> cliente = TraerDatos(ruta);
        for (int i = 0; i < cliente.size(); i++) {
            if (cliente.get(i).getIdentificacion().equals(identificacion)) {
                return cliente.get(i);
            }

        }
        return null;
    }

    public static Ventas traerVentas(String numero_registro, String ruta) {
        ArrayList<Ventas> ventas = TraerDatosI(ruta);
        for (int i = 0; i < ventas.size(); i++) {
            if (ventas.get(i).getIdentificacion().equals(numero_registro)) {
                return ventas.get(i);
            }

        }
        return null;
    }

    public static ArrayList<Cliente> actualizarCliente(String ruta, String identificacion, String nombre, String primer_apellido, String segundo_apellido, String edad, Ventas direccion, String tel, String email, Ventas ventas, String sexo) {
        ArrayList<Cliente> cliente = TraerDatos(ruta);
        for (int i = 0; i < cliente.size(); i++) {
            if (cliente.get(i).getIdentificacion().equals(identificacion)) {
                cliente.get(i).setNombre(nombre);
                cliente.get(i).setPrimer_apellido(primer_apellido);
                cliente.get(i).setSegundo_apellido(segundo_apellido);
                cliente.get(i).setEdad(edad);
                cliente.get(i).setEmail(email);
                cliente.get(i).setTel(tel);
                cliente.get(i).setSexo(sexo);
                cliente.get(i).setDireccion(direccion);

                i = cliente.size();
            }
        }
        return cliente;
    }

    public static ArrayList<Ventas> actualizarVentas(String ruta, String nombre, String sexo, String identificacion, String direccion, String estado, String fecha) {
        ArrayList<Ventas> ventas = TraerDatosI(ruta);
        for (int i = 0; i < ventas.size(); i++) {
            if (ventas.get(i).getIdentificacion().equals(identificacion)) {
                ventas.get(i).setNombre(nombre);
                ventas.get(i).setEstado(estado);
                ventas.get(i).setFecha(fecha);

                i = ventas.size();
            }
        }
        return ventas;
    }

    public static boolean soloLetras(String texto) {
        char[] numeros = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        for (int i = 0; i < texto.length(); i++) {
            char x = texto.charAt(i);
            for (int j = 0; j < numeros.length; j++) {
                if (x == numeros[j]) {
                    return true;
                }
            }
        }
        return false;

    }

    public static boolean soloNumeros(String texto) {

        char[] numeros = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        for (int i = 0; i < texto.length(); i++) {
            char x = texto.charAt(i);
            boolean esta = false;
            for (int j = 0; j < numeros.length; j++) {
                if (x == numeros[j]) {
                    esta = true;
                    j = numeros.length + 1;

                }
            }

            if (esta == false) {
                return false;
            }
        }
        return true;

    }

}
