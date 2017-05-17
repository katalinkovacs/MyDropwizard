package representation;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SaySomethingXML {

    private String greetings;

    private String people;


    public void setGreetings(String greetings) {
        this.greetings = greetings;
    }


    public void setPeople(String people) {
        this.people = people;
    }


    public String getGreetings() {
        return greetings;
    }


    public String getPeople() {
        return people;
    }

}
