public class App {
    public static void main(String[] args) throws Exception {
        String cadena = "Hola mundo";

        System.out.println(cadena);
        System.out.println("Tamano de la cadena");
        System.out.println(cadena.length());
        System.out.println(cadena.split(" ")[0]);



        for(int i = 0; i< cadena.length(); i++){
            //System.out.print(cadena.charAt(i)+"-");
            if (i == cadena.length()-1){
                System.out.print(cadena.charAt(i));
            }else{
                System.out.print(cadena.charAt(i)+"-");
            }


        }
        System.out.println();


        ///CONTAR PALABRAS
        //cadena.split(" ");
        int palabras = cadena.split(" ").length;
        System.out.println(" "+palabras);

        ///CONTAR CUANTAS LETRAS HAY EN LA CADENA

        int letras = cadena.split("").length;
        System.out.println(""+letras);
        System.out.println();
        

        




        


        


    }
}
