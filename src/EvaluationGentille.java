public class EvaluationGentille implements EvaluationQuestion{
    public int evalue(Question question){
        if(question.nonTraitee() || !question.bienChoisi()) return 0;
        return 1;
    }
}

/* public class EvaluationGentille extend Question{
    private Question question;
    public EvaluationGentille(Question question){
        this.question = question;
    }

    public void coche(int i){ question.coche(i);}

    boolean estCoche ( int i ){return question.estCoche(i);}

    public
    public int evalue(Question question){
        if(question.nonTraitee() || !question.bienChoisi()) return 0;
        return 1;
    }
}
 */