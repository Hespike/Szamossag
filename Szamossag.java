public class Szamossag {

    public static void main(String[] args) {
        int pozitiv = 0;
        int negativ = 0;

        for (int i = 0; i < args.length; i++){
            if (Integer.parseInt(args[i]) > 0){
                pozitiv += 1;
            } else if ((Integer.parseInt(args[i]) < 0))  {
                negativ += 1;
            }


        }

        if (pozitiv > negativ) {
            System.out.println("pozitivbol van tobb");

        } else if  ( pozitiv == negativ){
                System.out.println("mind a kettobol ugyanannyi van");
            } else {
                System.out.println("negativbol van tobb");
            }

        }
        // megoldas
    }

/* public class Szamossag {

    public static void main(String[] args) {
        int negativak = 0;
        int pozitivak = 0;
        for (int i = 0; i < args.length; i++) {
            int aktualis = Integer.parseInt(args[i]);
            if (aktualis < 0) {
                negativak++;
            } else if (aktualis > 0) {
                pozitivak++;
            }
        }

        if (negativak > pozitivak) {
            System.out.println("negativbol van tobb");
        } else if (pozitivak > negativak) {
            System.out.println("pozitivbol van tobb");
        } else {
            System.out.println("mind a kettobol ugyanannyi van");
        }
    }

}

 */
