public abstract class Question{
    private String question;
    private String [] responses;
    private boolean [] coches;
    private EvaluationQuestion evaluator;

    Question(String question,String[] responses,EvaluationQuestion evaluator) {
        this.question = question ;
        this.responses = responses ;
        coches = new boolean [responses.length];
        this.evaluator = evaluator;
    }
    void coche ( int i ) {coches[i] = true ;}

    boolean estCoche ( int i ){return coches[i];}

    abstract boolean bienChoisi();

    public int nbChoix(){return coches.length;}

    boolean nonTraitee () {
        for( int i = 0; i < coches . length ; i ++)
            if ( coches [ i ])
                return false ;
        return true ;
    }

    public int evalue(Question question) {
        return evaluator.evalue(question);
    }
}
