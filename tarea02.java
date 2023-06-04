public class Main {
public static void main(String[] args) {
    int numeroIf = -5;
    if (numeroIf > 0) {
        System.out.printLn("numero positivo");
    } else if (numeroIf < 0) {
        System.out.printLn("numero negativo");
    } else {
        System.out.printLn("numero 0");
    }
}

int numeroWhile = 0;
while (numeroWhile < 3) {
    numeroWhile++;
    System.out.printLn(numeroWhile);
}

int numeroWhile = 0;
do {numeroWhile++;
    System.out.printLn(numeroWhile);
} while (numeroWhile < 3);

int numeroFor = 0
for (var numeroFor; numeroFor <= 3; numeroFor++) {
    System.out.printLn(numeroFor)
}

var estacion = "invierno";
switch (estacion) {
    case "primavera":
                System.out.println("Es primavera");
                break;
    case "verano":
                System.out.println("Es verano");
                break;
    case "otoño":
                System.out.println("Es otoño");
                break;
    case "invierno":
                System.out.println("Es invierno");
                break;
    default:
                System.out.println("No es una estación válida");
                break;            
}

}