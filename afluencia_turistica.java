import java.util.Scanner;
public class afluencia_turistica {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] destinos = new String[10];
        String[] regiones = new String[10];
        String[] meses = new String[10];
        int[] anios = new int[10];
        int[] turistas = new int[10];
        String[] nacionalidades = new String[10];
        String[] tipos = new String[10];
        String[] estados = new String[10];
        int total = 0;
        int opcion;
        //-------------------------------------------//
        //--|menu_principal_de_afluencia_turistica|--//
        //-------------------------------------------//
        do {
            System.out.println("menu principal de afluencia turistica");
            System.out.println("1) Registrar afluencia");
            System.out.println("2) Editar afluencia");
            System.out.println("3) Listar afluencias");
            System.out.println("4) Buscar afluencia");
            System.out.println("5) Eliminar afluencia");
            System.out.println("6) Mostrar estadisticas");
            System.out.println("7) Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion) {
                //-------------------------//
                //--|registrar_afluencia|--//
                //-------------------------//
                case 1:
                    if (total >= destinos.length) {
                        System.out.println("No hay espacio para registrar mas afluencias.");
                        break;
                    }
                    int id = total + 1;
                    System.out.println("registro de afluencia turistica");
                    System.out.println("id de la afluencia a registrar: " + id);
                    System.out.print("nombre del destino turistico: ");
                    destinos[total] = entrada.nextLine();
                    System.out.print("ciudad o region: ");
                    regiones[total] = entrada.nextLine();
                    System.out.print("mes de registro: ");
                    meses[total] = entrada.nextLine();
                    System.out.print("anio: ");
                    anios[total] = entrada.nextInt();
                    System.out.print("cantidad de turistas: ");
                    turistas[total] = entrada.nextInt();
                    entrada.nextLine();
                    System.out.print("nacionalidad predominante: ");
                    nacionalidades[total] = entrada.nextLine();
                    System.out.print("tipo de turismo: ");
                    tipos[total] = entrada.nextLine();
                    System.out.print("estado del destino: ");
                    estados[total] = entrada.nextLine();
                    System.out.println("Afluencia registrada correctamente.");
                    total++;
                    break;
                //----------------------//
                //--|editar_afluencia|--//
                //----------------------//
                case 2:
                    if (total == 0) {
                        System.out.println("No existen afluencias registradas.");
                        break;
                    }
                    System.out.println("Datos de las afluencias");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Destino: " + destinos[i] + " | Region: " + regiones[i] + " | Mes: " + meses[i] + " | Anio: " + anios[i] + " | Turistas: " + turistas[i] + " | Nacionalidad: " + nacionalidades[i] + " | Tipo: " + tipos[i] + " | Estado: " + estados[i]);
                    }
                    System.out.print("Ingrese el ID de la afluencia: ");
                    int idBuscar = entrada.nextInt();
                    entrada.nextLine();
                    if (idBuscar >= 1 && idBuscar <= total) {
                        int posicion = idBuscar - 1;
                        System.out.println("Editar el dato de la afluencia");
                        System.out.print("Nuevo destino turistico: ");
                        destinos[posicion] = entrada.nextLine();
                        System.out.print("Nueva ciudad o region: ");
                        regiones[posicion] = entrada.nextLine();
                        System.out.print("Nuevo mes de registro: ");
                        meses[posicion] = entrada.nextLine();
                        System.out.print("Nuevo anio: ");
                        anios[posicion] = entrada.nextInt();
                        System.out.print("Nueva cantidad de turistas: ");
                        turistas[posicion] = entrada.nextInt();
                        entrada.nextLine();
                        System.out.print("Nueva nacionalidad predominante: ");
                        nacionalidades[posicion] = entrada.nextLine();
                        System.out.print("Nuevo tipo de turismo: ");
                        tipos[posicion] = entrada.nextLine();
                        System.out.print("Nuevo estado del destino: ");
                        estados[posicion] = entrada.nextLine();
                        System.out.println("Afluencia actualizada correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //-----------------------//
                //--|listar_afluencias|--//
                //-----------------------//
                case 3:
                    if (total == 0) {
                        System.out.println("No existen afluencias registradas.");
                    } else {
                        System.out.println("Lista de afluencias");
                        for (int i = 0; i < total; i++) {
                            System.out.println("ID: " + (i + 1) + " | Destino: " + destinos[i] + " | Region: " + regiones[i] + " | Mes: " + meses[i] + " | Anio: " + anios[i] + " | Turistas: " + turistas[i] + " | Nacionalidad: " + nacionalidades[i] + " | Tipo: " + tipos[i] + " | Estado: " + estados[i]);
                        }
                    }
                    break;
                //----------------------//
                //--|buscar_afluencia|--//
                //----------------------//
                case 4:
                    if (total == 0) {
                        System.out.println("No existen afluencias registradas.");
                        break;
                    }
                    System.out.println("busqueda de afluencia");
                    System.out.print("ingresa la id para buscar afluencia: ");
                    int idBusqueda = entrada.nextInt();
                    entrada.nextLine();
                    if (idBusqueda >= 1 && idBusqueda <= total) {
                        int posicion = idBusqueda - 1;
                        System.out.println("Datos de la afluencia encontrada:");
                        System.out.println("ID: " + idBusqueda + " | Destino: " + destinos[posicion] + " | Region: " + regiones[posicion] + " | Mes: " + meses[posicion] + " | Anio: " + anios[posicion] + " | Turistas: " + turistas[posicion] + " | Nacionalidad: " + nacionalidades[posicion] + " | Tipo: " + tipos[posicion] + " | Estado: " + estados[posicion]);
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //------------------------//
                //--|eliminar_afluencia|--//
                //------------------------//
                case 5:
                    if (total == 0) {
                        System.out.println("No existen afluencias registradas.");
                        break;
                    }
                    System.out.println("Datos de las afluencias");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Destino: " + destinos[i] + " | Region: " + regiones[i] + " | Mes: " + meses[i] + " | Anio: " + anios[i] + " | Turistas: " + turistas[i] + " | Nacionalidad: " + nacionalidades[i] + " | Tipo: " + tipos[i] + " | Estado: " + estados[i]);
                    }
                    System.out.print("Ingrese el ID de la afluencia a eliminar: ");
                    int idEliminar = entrada.nextInt();
                    entrada.nextLine();
                    if (idEliminar >= 1 && idEliminar <= total) {
                        int posicion = idEliminar - 1;
                        for (int i = posicion; i < total - 1; i++) {
                            destinos[i] = destinos[i + 1];
                            regiones[i] = regiones[i + 1];
                            meses[i] = meses[i + 1];
                            anios[i] = anios[i + 1];
                            turistas[i] = turistas[i + 1];
                            nacionalidades[i] = nacionalidades[i + 1];
                            tipos[i] = tipos[i + 1];
                            estados[i] = estados[i + 1];
                        }
                        total--;
                        System.out.println("Afluencia eliminada correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //--------------------------//
                //--|mostrar_estadisticas|--//
                //--------------------------//
                case 6:
                    if (total == 0) {
                        System.out.println("No existen afluencias registradas.");
                        break;
                    }
                    int totalTuristas = 0;
                    int mayor = turistas[0];
                    int menor = turistas[0];
                    int posicionMayor = 0;
                    int posicionMenor = 0;
                    for (int i = 0; i < total; i++) {
                        totalTuristas += turistas[i];
                        if (turistas[i] > mayor) {
                            mayor = turistas[i];
                            posicionMayor = i;
                        }
                        if (turistas[i] < menor) {
                            menor = turistas[i];
                            posicionMenor = i;
                        }
                    }
                    double promedio = (double) totalTuristas / total;
                    System.out.println("resumen de afluencia turistica");
                    System.out.println("Destinos registrados: " + total);
                    System.out.println("Total de turistas: " + totalTuristas);
                    System.out.println("Mayor afluencia: " + destinos[posicionMayor] + " - " + mayor + " turistas");
                    System.out.println("Menor afluencia: " + destinos[posicionMenor] + " - " + menor + " turistas");
                    System.out.println("Promedio de turistas: " + promedio);
                    break;
                //------------------------------//
                //--|salir_del_menu_principal|--//
                //------------------------------//
                case 7:
                    System.out.println("Gracias por utilizar Afluencia Turistica.");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 7);
        entrada.close();
    }
}