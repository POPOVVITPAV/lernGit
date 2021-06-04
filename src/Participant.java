public class Participant {
    private String nameParticipant;
    private int age;
    private String topicOfReport;

    public Participant(){
        this.nameParticipant ="Pol";
        this.age = 20;
        this.topicOfReport = "Java for beginners";

    }
    public Participant(String nameParticipant,int age,String topicOfReport){
        this.nameParticipant = nameParticipant;
        this.age = age;
        this.topicOfReport = topicOfReport;
    }
    public String answerQuestions(String Questions){
        switch (Questions){

        }
        String answer = "iueribeivbibvibbiibibev";
        return answer;
    }
    public void reported(String nameParticipant, int age, String topicOfReport){
        System.out.println("My name is " + nameParticipant);
        System.out.println("My topic of report is " + topicOfReport);
        System.out.println("And I am " + age);
    }
}
