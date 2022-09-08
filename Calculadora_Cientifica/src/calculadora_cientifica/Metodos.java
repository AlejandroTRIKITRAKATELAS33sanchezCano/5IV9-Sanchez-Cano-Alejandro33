
package calculadora_cientifica;

/**
 *
 * Sanchez Cano Alejandro 33
 */
public class Metodos {
    private String cadena;
    private double resultado;
    private boolean suma;
    private boolean resta;
    private boolean multiplicacion;
    private boolean division;
    private boolean raiz;
    private boolean seno;
    private boolean coseno;
    private boolean tangente;
    private boolean alcuadrado;
    private boolean alapotencia;
    private boolean diezal;
    private boolean logaritmo;
    private boolean exp;
    private boolean mod;
    private boolean pi;
    private boolean eu;
    private boolean negativo;
    
    public Metodos(){
        cadena="";
        suma=false;
        resta=false;
        multiplicacion=false;
        division=false;
        raiz=false;
        seno=false;
        coseno=false;
        tangente=false;
        alcuadrado=false;
        alapotencia=false;
        diezal=false;
        logaritmo=false;
        exp=false;
        mod=false;
        pi=false;
        eu =false;
        negativo=false;
    }
    
    public String concatenamiento(String cadena){
   
       this.cadena=this.cadena+cadena;
       return this.cadena;
       
   
   }
    
    public void borrar(String cadena){
        this.cadena="";
        this.resultado=0.0;
        
        suma=false;
        resta=false;
        multiplicacion=false;
        division=false;
        raiz=false;
        seno=false;
        coseno=false;
        tangente=false;
        alcuadrado=false;
        alapotencia=false;
        diezal=false;
        logaritmo=false;
        exp=false;
        mod=false;
        pi=false;
        negativo=false;

    }
       
    
    
    public void suma(String cadena){
        this.resultado=Double.parseDouble(cadena);
        suma=true;
        this.cadena="";
        
    }
    
    public void resta(String cadena){
        this.resultado=Double.parseDouble(cadena);
        resta=true;
        this.cadena="";
        
    }
    
    public void multiplicacion(String cadena){
        this.resultado=Double.parseDouble(cadena);
        multiplicacion=true;
        this.cadena="";
        
    }
    
    public void division(String cadena){
        this.resultado=Double.parseDouble(cadena);
        division=true;
        this.cadena="";
        
    }
    
    public void raiz(String cadena){
        this.resultado=Double.parseDouble(cadena);
        raiz=true;
        this.cadena="";
        
    }
    
    public void seno(String cadena){
        this.resultado=Double.parseDouble(cadena);
        seno=true;
        this.cadena="";
        
    }
    
    public void coseno(String cadena){
        this.resultado=Double.parseDouble(cadena);
        coseno=true;
        this.cadena="";
        
    }
    
    public void tangente(String cadena){
        this.resultado=Double.parseDouble(cadena);
        tangente=true;
        this.cadena="";
        
    }
    
    public void alcuadrado(String cadena){
        this.resultado=Double.parseDouble(cadena);
        alcuadrado=true;
        this.cadena="";
        
    }
    
    public void alapotencia(String cadena){
        this.resultado=Double.parseDouble(cadena);
        alapotencia=true;
        this.cadena="";
        
    }
    
    public void diezal(String cadena){
        this.resultado=Double.parseDouble(cadena);
        diezal=true;
        this.cadena="";
        
    }
    
    public void logaritmo(String cadena){
        this.resultado=Double.parseDouble(cadena);
        logaritmo=true;
        this.cadena="";
        
    }
    
    public void exp(String cadena){
        this.resultado=Double.parseDouble(cadena);
        exp=true;
        this.cadena="";
        
    }
    
    public void mod(String cadena){
        this.resultado=Double.parseDouble(cadena);
        mod=true;
        this.cadena="";
        
    }
    
    public void pi(String cadena){
        this.resultado=Double.parseDouble(cadena);
        pi=true;
        this.cadena="";
        
    }
    
    public void eu(String cadena){
        this.resultado=Double.parseDouble(cadena);
        eu=true;
        this.cadena="";
        
    }
    
    public void negativo(String cadena){
        this.resultado=Double.parseDouble(cadena);
        negativo=true;
        this.cadena="";
        
    }
    
    
    
///////////////////////////////////////////////////////////////////////////////////////////

    public double resultado (String numero){
        
        if(suma==true){
            
        resultado=resultado+Double.parseDouble(numero);
        
        }else if(resta==true){
            
        resultado=resultado-Double.parseDouble(numero);
        
        }else if(multiplicacion==true){
            
        resultado=resultado*Double.parseDouble(numero);
        
        }else if(division==true){
            
        resultado=resultado/Double.parseDouble(numero);
        
        }else if(raiz==true){
            
        resultado=Math.sqrt(Double.parseDouble(numero));
        }
        
        else if (seno == true){
            
            double seno=Math.toRadians(resultado);
            resultado=Math.sin(seno);
            
        }else if (coseno == true){
            
            double coseno=Math.toRadians(resultado);
            resultado=Math.cos(coseno);
            
        }else if (tangente == true){
            double tangente=Math.toRadians(resultado);
            resultado=Math.tan(tangente);
            
        }else if (alcuadrado == true){
            
            resultado=Math.pow(resultado, 2);
            
        }else if (alapotencia == true){
            
            resultado=Math.pow(resultado, Double.parseDouble(numero));
            
        }else if (diezal==true){
        
            resultado=Math.pow(10, Double.parseDouble(numero));
            
        }else if (logaritmo==true){
        
            resultado=Math.log(Double.parseDouble(numero));
            
        }else if (exp==true){
        
            resultado=resultado*Math.pow(10, Double.parseDouble(numero));
            
        }else if (mod==true){
        
            resultado=Math.floorMod(Long.parseLong((numero)), Long.parseLong((numero)));
            
        }else if(pi==true){
        
            resultado=Math.PI;
            
        }else if(eu==true){
        
            resultado=Math.E;
            
        }else if (negativo==true){
        
            resultado=Double.parseDouble(numero)*(-1);
            
        }
        
        suma=false;
        resta=false;
        multiplicacion=false;
        division=false;
        raiz=false;
        seno=false;
        coseno=false;
        tangente=false;
        alcuadrado=false;
        alapotencia=false;
        diezal=false;
        logaritmo=false;
        exp=false;
        mod=false;
        pi=false;
        negativo=false;
        
        return resultado;
    }
    
}
