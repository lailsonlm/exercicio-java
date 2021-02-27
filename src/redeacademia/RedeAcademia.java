package redeacademia;

/**
 *
 * @author Lailson Sobral
 */
public class RedeAcademia {

    public static void main(String[] args) {
        
        Aluno [] a = new Aluno [5];
        Pacotes [] p = new Pacotes [3];
        
        p[0] = new Pacotes("Plano A", "Mensal", 100f);
        p[1] = new Pacotes("Plano B", "Semestral", 80f);
        p[2] = new Pacotes("Plano C", "Anual", 50f);
        
        a[0] = new Aluno("Lailson de Lima" , "123.456.789-00", 27, 1.78f, 85.1f, p[2]);
        a[0].setStatus(true);
        a[0].listarAlunos();
        
        a[1] = new Aluno("João Pedro" , "254.693.021-00", 15, 1.50f, 65.5f, p[0]);
        a[1].setStatus(true);
        a[1].listarAlunos();
 
        a[2] = new Aluno("Maria Alice" , "321.568.794-00", 19, 1.55f, 59.8f, p[1]);
        a[2].setStatus(true);
        a[2].listarAlunos();       
      
        a[3] = new Aluno("Adilson José" , "100.200.300-00", 35, 1.73f, 90f, p[0]);
        a[3].setStatus(true);
        a[3].listarAlunos();

        a[4] = new Aluno("Rodrigo Manoel" , "547.986.321-65", 17, 1.65f, 67.15f, p[2]);
        a[4].listarAlunos();        
        
       
        //Contador de Alunos Ativos/Inativos
        int ativos = 0;
        int totA = 0;
        int inativos = 0;
        int totI = 0;
        
        for (int i = 0; i < a.length; i++){
        if(a[i]!=null && a[i].getStatus() == true){
        ativos++;
        } else {
            inativos++;
        }
        }
        
        totA += ativos;
        totI = totI + inativos;
        System.out.println("\n----------------------------");
        System.out.println("Total de Alunos Ativos: " + totA);
        System.out.println("Total de Alunos Inativos: " + totI);

}
    
    }
    
