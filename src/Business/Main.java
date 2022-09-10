
package Business;

import java.util.ArrayList;

public class Main {
    
    private ArrayList<Vehiculo> listaVehiculo;
    private ArrayList<Persona> listaPropietario;

    public Main() {
        this.listaVehiculo = new ArrayList<Vehiculo>();
        this.listaPropietario = new ArrayList<Persona>();
        this.guardarPropietario("12345", "Harry", "Potter", "harryp@magic.com");
        this.guardarPropietario("67890", "Hermione", "Granger", "hermaioneg@magic.com");
        this.guardarPropietario("55555", "Ron", "Weasley", "ronweasley@magic.com");
    }
    
    
    
    public String guardarPropietario(String cedula, String nombre, String apellido, String contacto){
        String c = "Propietario ya existe";
        
        Persona p=this.buscarPropietario(cedula);
        if(p==null){
           p=new Persona(cedula, nombre,  apellido, contacto);
           this.listaPropietario.add(p);
           c="Propietario guardado correctamente";
        }
        
        return c;
    }
    
    public String modificarPropietario(String cedula,String nombre, String apellido, String contacto){
        String c = "Propietario no encontrado";
        Persona p=this.buscarPropietario(cedula);
        if(p!=null){
         c = "Propietario encontrado \n";
         if(nombre!=""){
              if(!p.getNombre().equals(nombre)){
                p.setNombre(nombre);
                c = c+" Nombre actualizado \n";
            }
         }
         if(apellido!=""){
             if(!p.getApellido().equals(apellido)){
                p.setApellido(apellido);
                c = c+" Apellido actualizado \n";
            }
         }
         if(contacto!=""){
            if(!p.getContacto().equals(contacto)){
                p.setContacto(contacto);
                c = c+" Contacto actualizado \n";
            }
         }
        }
        
        return c;
    }
    
    private Persona buscarPropietario(String cedula){
        Persona p=null;
        
        for(int i=0;i<this.listaPropietario.size();i++){
            if(this.listaPropietario.get(i).getCedula().equals(cedula)){
                p=this.listaPropietario.get(i);
            }
        }
        return p;
    }
    
    public String listarPropietario(){
        String c="Ninguno-";
        
        for(int i=0;i<this.listaPropietario.size();i++){
      
            c+=this.listaPropietario.get(i).getCedula()+" "+
                    this.listaPropietario.get(i).getNombre()+" "+
                            this.listaPropietario.get(i).getApellido()+"-";
  
        }
               
        return c;
    }
    
    public String guardarVehiculo(String placa, String modelo, String marca, String propietario){
        String c = "Vehiculo ya existe";
        
        Vehiculo v=this.buscarVehiculo(placa);
        
        if(v==null){
           v=new Vehiculo( placa, modelo, marca, propietario);
           this.listaVehiculo.add(v);
           c="Vehiculo guardado correctamente";
        }
        
        
        return c;
    }
    
    public String modificarVehiculo(String placa, String modelo, String marca, String propietario){
        String c = "Vehiculo no encontrado";
        
        Vehiculo p=this.buscarVehiculo(placa);
        
        if(p!=null){
         c = "Vehiculo encontrado \n";
            if(!p.getModelo().equals(modelo)){
                p.setModelo(modelo);
                c = c+" Modelo actualizado \n";
            }
             if(!p.getMarca().equals(marca)){
                p.setMarca(marca);
                c = c+" Marca actualizada \n";
            }
            if(!p.getPropietario().equals(propietario)){
                p.setPropietario(propietario);
                c = c+" Propietario actualizado \n";
            }
      
        }
        
        return c;
    }
    
    private Vehiculo buscarVehiculo(String placa){
        Vehiculo v=null;
        
        for(int i=0;i<this.listaVehiculo.size();i++){
            if(this.listaVehiculo.get(i).getPlaca().equals(placa)){
                v=this.listaVehiculo.get(i);
            }
        }
        return v;
    }
    
    public String consultarVehiculo(String placa){
        String c="Vehiculo no existe";
        
        Vehiculo v=this.buscarVehiculo(placa);
        
        if(v!=null){
            c=v.getPlaca()+"-"+v.getModelo()+"-"+v.getMarca()+"-"+v.getPropietario();
        }
        
        return c;
    }
    
}
