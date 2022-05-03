package practicaHarry;

public class Personaje {
    private String nombre, casa, genero, boggart, patronus;

    public Personaje(String nombre, String casa, String genero, String boggart, String patronus){
        this.nombre = nombre;
        this.casa = casa;
        this.genero = genero;
        this.boggart = boggart;
        this.patronus = patronus;
    }


    //Practicando con getter y setters
    public String getCasa(){  return casa;  }
    public boolean setCasa(String casa){
        if (!casa.isEmpty()) {
            this.casa = casa;
            return true;
        } else
            return false;
    }

    public String getGenero(){  return genero;  }
    public boolean setGenero(String genero){
        if (!genero.isEmpty()){
            this.genero = genero;
            return true;
        } else
            return false;
    }

    public String getNombre(){  return nombre;  }
    public boolean setNombre(String nombre) {
        if (!nombre.isEmpty()){
            this.nombre = nombre;
            return true;
        } else
            return false;
    }

    public String getBoggart() {  return boggart;  }
    public boolean setBoggart(String boggart) {
        if (!boggart.isEmpty()) {
            this.boggart = boggart;
            return true;
        } else
            return false;
    }

    public String getPatronus() {  return patronus;  }
    public boolean setPatronus(String patronus) {
        if (!patronus.isEmpty()) {
            this.patronus = patronus;
            return true;
        } else
            return false;
    }

    void showMessage(){
        System.out.println("Nombre: " + nombre +
                " Casa: " + casa +
                " Genero: " + genero +
                " Boggart: " + boggart +
                " Patronus: " + patronus);
    }
}
