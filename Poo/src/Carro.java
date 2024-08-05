public class Carro {
    //principal class mae de objetos

    int cavalos;
    String cor;
    String transmissao;
    String montadora;
   int capacidadeTanque;
   int combustivel;
   int KmPorLitros;

   int abastecer(int litros){

       int soma = combustivel + litros;
       if (soma > capacidadeTanque){
           combustivel = capacidadeTanque;
           int sobra = soma - capacidadeTanque;

           return sobra;
           //System.out.println("Tanque cheio, Sobrou "+ sobra + "litros. ");
       }else{
           combustivel = soma;

           return 0;
       }
       //somar para saber quantidade depois  do abastecimento
       //verificar se a quantidade for maior que a capacidade do tanque
       // o combustivel = capacidadeTanque;
       //imprimir a sobra que é a soma - capacidade do tanque



   }

   int autonomiaCombustivel(){
     int autonomia = KmPorLitros * combustivel;
     return autonomia;
   }
}
