package node;

public class Main {

    public static void  main(String[] args){

        No no1 = new No("Conteúdo no1");

        No no2 = new No("Conteúdo no2");
        no1.setProximoNo(no2);

        No no3 = new No("Conteúdo no3");
        no2.setProximoNo(no3);

        No no4 = new No("Conteúdo no4");
        no3.setProximoNo(no4);

        // Imprimindo encadeamento

        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no2);

        System.out.println("-------------------");

        System.out.println(no1); // no1.toString();
        System.out.println(no1.getProximoNo()); // no1.proximoNo.toString(); // no1.no2.toString(); // no2.toString();
        System.out.println(no1.getProximoNo().getProximoNo()); // no1.no2.proximoNo.toString(); // no1.no2.no3.toString();
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo()); // no1.no2.no3.proximoNo.toString(); // no1.no2.no3.no4.toString();
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo()); // no1.no2.no3.no4.proximoNo.toString();
                                                                                             // Por quê a linha acima não retorna retorna NullPointerException.
        
     //   No no5 = new No("Conteúdo no5");
     //   System.out.println(no5.getProximoNo().toString()); // java.lang.NullPointerException
          
    }
}