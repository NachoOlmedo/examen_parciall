package paqEmpleados;

public abstract class Empleado implements Cloneable{

        protected String dni;
        protected String nombre;
        protected String dirección;
        protected int teléfono;
        protected String email;

        public Empleado(String dni, String nombre, String dirección, int teléfono, String email) {
            this.dni = dni;
            this.nombre = nombre;
            this.dirección = dirección;
            this.teléfono = teléfono;
            this.email = email;
        }

        //dos Empleados son iguales si su dni coincide o si su email coincide.
        public boolean iguales(Empleado p) {
            if (this == p) return true;
            if (p == null || getClass() != p.getClass()) return false;
            return this.dni.equals(p.dni) || this.email.equals(p.email);

        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

        @Override
        public String toString() {
            return "Empleado{" +
                    "dni='" + dni + '\'' +
                    ", nombre='" + nombre + '\'' +
                    ", dirección='" + dirección + '\'' +
                    ", teléfono=" + teléfono +
                    ", email='" + email + '\'' +
                    '}';
        }
    }/*dsdsdsdsdsdsdsdsdsd*/
/*dsdsfeasdsa*/

