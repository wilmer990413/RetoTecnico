package co.com.retoTecnico.stepdefinitions;

import co.com.retoTecnico.model.UserData;
import co.com.retoTecnico.questions.CorrectRegistrationAnswer;
import co.com.retoTecnico.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static co.com.retoTecnico.util.Constants.ZERO;
import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.actors.OnStage.*;

import java.util.List;

public class RetoTecnicoStepDefinitions {

    @Before
    public void setStage() {

        setTheStage(new OnlineCast());
    }

    @Given("^brandon wants to signup into a utest\\.com$")
    public void brandoWantsToSignupIntoAUtestCom() {

        theActorCalled("brandon").wasAbleTo(OpenUp.thePage());
    }


    @When("^brandon clicks on button Join today and writes his credentials$")
    public void brandonClicksOnButtonJoinTodayAndWritesHisCredentials(List<UserData> userData) {
        theActorInTheSpotlight().attemptsTo(
                FillOut.personalData(userData.get(ZERO)),
                Find.addressInformation(userData.get(ZERO)),
                FindThe.devicesInformation(userData.get(ZERO)),
                Choose.passwordAndConditions(userData.get(ZERO))
        );
    }

    @Then("^brandon was successfully registered$")
    public void brandonWasSuccessfullyRegistered(List<String> questionUser) {
        theActorInTheSpotlight().should(seeThat(CorrectRegistrationAnswer.toThe(questionUser.get(1))));
    }
}
