package com.mycompany.entradablogjcc;

public class EntradaBlogJCC {
//separador es el carácter que separa ENTRADA DE del nombre del autor


public static char separador=':';
private int id=-3;
private String texto="Esta es la versión 2.4";
private String autor="Jonattan Cuenca Cerdan";

/**
 * Constructor de la clase.
 * @param id 
 * @param autor Jonattan Cuenca Cerdan
 * @param texto Versión 2.3
 * @throws IllegalArgumentException 
 */

public void EntradaBlog(int id, String autor, String texto)throws IllegalArgumentException{
        if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
        this.id=id;
        this.autor=autor;
        this.texto=texto;
        }

    /**
     *
     * @return
     */

    @Override
public String toString(){
        String cad="";
        cad+="\nENTRADA DE"+separador+autor;
        cad+="\n "+texto;
        return cad;
        }

    /**
     *
     * @return Número de entrada
     */

public int getId(){
        return this.id;
        }

    /**
     * 
     * @return Texto de la entrada
     */

public String getTexto(){
        return this.texto;
        }


    /**
     *
     * @return Nombre del autor en Mayúsculas
     */

public String getAutor(){
        return this.autor.toUpperCase();
        }


    /**
     *
     * @return Nombre del autor, ya no se usa (ver getAutor)
     */

public String devuelveAutor(){
        return this.autor;
        }

    /**
     *
     * @param args
     */

    public static void main(String[] args) {
        //Modificar.
        EntradaBlogJCC e1= new EntradaBlogJCC();
        System.out.println(e1);
        }
        }