package paqEmpleados;

public class Comercial extends Empleado {
    protected Producto [] productos;
    protected int n;

    public Comercial(Producto[] productos,String dni,String nombre, String direccion, int telefono, String email, int n) {
       super(dni,nombre,direccion,telefono,email);
        this.productos = productos;
        this.n=n;

    }
    public void borrarStockCero(){
        int o=n;
        Producto[] vector=new Producto[n];
        Producto[] vector2=new Producto[n];
        int i,j=0;
        for (i=0;i<n;i++){
            if (n==0){
                vector2[o]=vector[i];
                o--;
            }
            else {
              vector2[j]=vector[i];
              j++;
            }
        }


        }




    }



