public class Alternative extends Question{
    private int bonChoix;

    public Alternative ( String question,String[] responses,int bonChoix){
        super(question,responses,new EvaluationGentille());
        this.bonChoix = bonChoix;
    }

    public boolean bienChoisi () {
        for (int i = 0; i < nbChoix() ; i ++)
            if (!estCoche(i) && bonChoix == i || estCoche (i) && bonChoix != i )
                return false ;
        return true ;
    }

}
