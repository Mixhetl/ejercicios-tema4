public class Main {
    public static void main(String[] args) {
        int numeroIf = 0;
        int numeroWhile = 0;
        var estacion = "Primavera";

        // Estructura IF
        System.out.println("Estructura If else");
        if(numeroIf > 0){
            System.out.println("El numero es positivo");
        } else if(numeroIf < 0) {
            System.out.println("El numero es negativo");
        } else {
            System.out.println("El numero es cero");
        }

        //Estructura While
        System.out.println("Estructura While");
        while(numeroWhile < 3) {
            numeroWhile++;
            System.out.println(numeroWhile);
        }

        //Estructura DoWhile
        System.out.println("Estructura Do While");
        do{
            System.out.println(numeroWhile);
            numeroWhile++;
        } while (numeroWhile < 3);

        //Estructura For
        System.out.println("Estructura For");
        for(int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);
        }

        //Estructura Switch
        System.out.println("Estructura Switch");
        switch (estacion){
            case "Primavera":
                System.out.println("Es primavera");
                break;
            case "Verano":
                System.out.println("Es verano");
                break;
            case "Otoño":
                System.out.println("Es otoño");
                break;
            case "Invierno":
                System.out.println("Es invierno");
                break;
            default:
                System.out.println("No existe la estación");
        }
    }
}