public class vetor{

    public static void main(String[] args) 
{

    String produto [] = new String[5];

        produto[0]= "Amendoin";
        produto[1]= "Cana de açucar";
        produto[2]= "Soja";
        produto[3]= "Café";
        produto[4]= "Carne";

        int estoque[]=new int[5];

        estoque[0]= 100;
        estoque[1]= 5000;
        estoque[2]= 60;
        estoque[3]= 20;
        estoque[4]= 15;

        for (int index = 0; index < estoque.length; index++) {
            System.out.println("O produto " + produto[index] + " tem " + estoque[index] + " unidades em estoque");
        }
    }
}