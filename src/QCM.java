public class QCM{
    private Question [] questions;

    QCM (Question[] questions) {
        this.questions = questions ;
    }
    void coche(int question, int choix){
        questions [question].coche(choix) ;
    }
    int note(){
        int note = 0;
        for ( int i = 0; i < questions.length ; i ++)
            note = note + questions[i].evalue(questions[i]) ;
        return note ;
    }

}
