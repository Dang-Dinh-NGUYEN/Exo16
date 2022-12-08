import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	/*Question 3:
	Le(s) principe(s) violé(s) est:
	- SRP: la classe Question et ses héritages ont plusieurs rôles différents (sauvegarder le contenu de question, les bonnes
	réponses, les compte - rendus et évaluer les réponse)
	- OCP: lorsqu'il existe plusieurs façons pour évaluer les questions, on devra toujours modifier la classe Question afin de
	ajouter ces manières d'évaluation >> OCP est violé
	* */

    /*Question 6:
    Tous les principes sont bien respectés
    * */

    Question question1 = new Alternative("What is the capital of France ?",new String[]{"Paris","Berlin","Moscow","London"},0);
    question1.coche(0);
    //question1.coche(1);
    //question1.evalue(question1);
    System.out.println(question1.bienChoisi());

    Question question2 = new ReponseMultiple("Which one is in France ?",new String[]{"Paris","Lyon","Marseille","London"},new ArrayList<Integer>(Arrays.asList(0,1,2)));
    question2.coche(0);
    question2.coche(1);
    question2.coche(2);
    //question2.evalue(question2);
    System.out.println(question2.bienChoisi());

    QCM QCM1 = new QCM(new Question[]{question1,question2});
    System.out.println(QCM1.note());

    }

}
