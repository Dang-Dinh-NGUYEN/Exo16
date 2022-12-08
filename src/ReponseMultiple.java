import java.util.ArrayList;

public class ReponseMultiple extends Question{
    private ArrayList<Integer> bonChoix ; //il y a plusieurs bonne réponse

    public ReponseMultiple(String question, String[] responses,ArrayList<Integer> bonChoix){
        super(question,responses,new EvaluationGentille());
        this.bonChoix = bonChoix ;
    }

    @Override
    public boolean bienChoisi() {
        for (int i = 0; i < nbChoix() ; i ++)
            if (!estCoche(i) && bonChoix.contains(i) || estCoche(i) && !bonChoix.contains(i))
                return false;
        return true;
    }

}
