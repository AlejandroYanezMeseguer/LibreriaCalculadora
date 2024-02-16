import libreria.LeerDatos.LeerDatosJOP;
import libreria.MostrarDatos.MostrarDatos;

public class calculo {

public static int variableMenu;
public static float num1;
public static float num2;


    public static void operaciones(){

       variableMenu = LeerDatosJOP.LeerInt("Introduce la opcion que quieres ejecutar:\n\n" +
               "1- Suma\n" +
               "2- Resta\n" +
               "3- Multiplicacion\n" +
               "4- Division\n");

       switch (variableMenu){

           case 1:{
               num1 = LeerDatosJOP.LeerFloat("introduce el primer numero que quieres sumar");
               num2 = LeerDatosJOP.LeerFloat("introduce el segundo numero que quieres sumar");
               MostrarDatos.MostrarString("el resultado de la suma es: " + (num1+num2));
           }break;
           case 2:{
               num1 = LeerDatosJOP.LeerFloat("introduce el primer numero que quieres restar");
               num2 = LeerDatosJOP.LeerFloat("introduce el segundo numero que quieres restar");
               MostrarDatos.MostrarString("el resultado de la resta es: " + (num1-num2));
           }break;
           case 3:{
               num1 = LeerDatosJOP.LeerFloat("introduce el primer numero que quieres multiplicar");
               num2 = LeerDatosJOP.LeerFloat("introduce el segundo numero que quieres multiplicar");
               MostrarDatos.MostrarString("el resultado de la multiplicacion es: " + (num1*num2));
           }break;
           case 4:{
               num1 = LeerDatosJOP.LeerFloat("introduce el primer numero que quieres dividir");
               num2 = LeerDatosJOP.LeerFloat("introduce el segundo numero que quieres dividir");
               MostrarDatos.MostrarString("el resultado de la division es: " + (num1/num2));
           }break;

       }
    }

}
