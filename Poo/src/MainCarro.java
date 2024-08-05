public class MainCarro {
    //class filha
    public static void main(String[] args) {

        Carro punto= new Carro();
        punto.cavalos = 100;
        punto.cor ="Preta";
        punto.montadora = "Fiat";
        punto.transmissao = "Manual";
        punto.capacidadeTanque = 50;
        punto.combustivel =0;
        punto.KmPorLitros=10;

        Carro civic = new Carro();
        civic.cavalos = 150;
        civic.cor ="Prata";
        civic.montadora ="Honda";
        civic.transmissao ="Automatica";
        civic.capacidadeTanque = 48;
        civic.combustivel =10;
        civic.KmPorLitros=8;

        System.out.println(" Situação tanquer Puntos " + punto.combustivel);
        System.out.println("Situação tanquer Civic: " + civic.combustivel);


        System.out.println("Abastecendo 20 litros no punto");
         punto.abastecer( 20);

        System.out.println("Abastecendo 50 litros no punto");
        int  sobrapunto = punto.abastecer( 50);

        System.out.println("Abastecendo 30 litros no civic");
         civic.abastecer(30);

        System.out.println("Abastecendo 100 litros no civic");
       int  sobracivic = civic.abastecer(100);


        System.out.println("Punto (depois abastecimento): " +
                punto.combustivel + " , sobrou" +sobrapunto);

        System.out.println("Civic (depois aba" +
                "stecimento): " + civic.combustivel + " ,  sobrou " + sobracivic);

        System.out.println( "Autonomia punto: " + punto.autonomiaCombustivel());
        System.out.println( "Autonomia civic : " +civic.autonomiaCombustivel());
    }
}
