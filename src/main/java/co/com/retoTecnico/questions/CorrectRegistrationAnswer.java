package co.com.retoTecnico.questions;

import co.com.retoTecnico.userinterface.StepFourTheLastStep;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;



public class CorrectRegistrationAnswer implements Question<Boolean> {

    private String questionUser;

    public CorrectRegistrationAnswer(String questionUser) {
        this.questionUser = questionUser;
    }
    public static CorrectRegistrationAnswer toThe(String questionUser) {
        return new CorrectRegistrationAnswer(questionUser);
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        String strCorrectRegistrationAnswer= Text.of(StepFourTheLastStep.SUCCESSFULLY_SIGNUP).viewedBy(actor).asString();


        return (questionUser.equals(strCorrectRegistrationAnswer)) ? true : false;
    }

    @Override
    public String getSubject() {
        return Question.super.getSubject();
    }
}