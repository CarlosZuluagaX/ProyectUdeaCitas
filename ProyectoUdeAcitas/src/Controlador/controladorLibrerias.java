
package Controlador;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class controladorLibrerias {


public boolean validarFecha(String fecha) {
        try {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
            formatoFecha.setLenient(false);
            formatoFecha.parse(fecha);
        } catch (ParseException e) {
            return false;
        }
        return true;
    }

public Date convertirDatos( String dateEntrada, Date dateSalida) {
                
                try{ 
                //SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                
                //dateSalida = SimpleDateFormat.parse(dateEntrada);
                dateSalida = formatter.parse(dateEntrada);
                //String dateSalida2 = formatter.parse(dateSalida);
                }
                catch(ParseException e){
                    e.printStackTrace();
                    System.out.println("Error al convertir la fecha");
                }

        return dateSalida;
    }
    

public String dameFechaActual( String darFecha){
    
        java.util.Date date = new java.util.Date();
        java.text.SimpleDateFormat sdf  =new java.text.SimpleDateFormat("yyyy-MM-dd");
        darFecha = sdf.format(date);
        
        return darFecha;
}


public boolean validaMes(String mes){
    int mesValida = 0;
    boolean mesVal = true;
    
    mesValida = Integer.parseInt(mes);
    
    mesVal = mesValida <13;
    
    return mesVal;
}

public boolean validaDia(String dia){
    int diaValida = 0;
    boolean diaVal = true;
    
    diaValida = Integer.parseInt(dia);
    
    diaVal = diaValida <32;
    
    return diaVal;
}

public boolean validaAno(String ano){
    
    int anoValida = 0;
    boolean anoVal = true;
    
    anoValida = Integer.parseInt(ano);
    
    anoVal = anoValida <2019;
    
    return anoVal;
    
}

}
