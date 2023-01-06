package seminar02_hw.Relationships;

import seminar02_hw.Model;
import seminar02_hw.Person;

import java.io.IOException;

public class GenerationCurrent extends GenerationBase implements Relationships {

    private String relationship = null;

    public String getRelationship() {
        return relationship;
    }

    @Override
    public String relations(String relationship) throws IOException {
        for (String s : current) {
            if (s.equals(relationship)) {
                Model.writeRelation("genCurrent",
                        getBasePerson().getName(), getBasePerson().getDateOfBirth(),
                        getBasePerson().getGender(), getNextPerson().getName(), relationship);
                return relationship;
            }
        }
        return null;
    }

    public GenerationCurrent(Person firstPerson, Person secondPerson, String relation) throws IOException {
        super(firstPerson, secondPerson);
        this.relationship = relations(relation);
    }
}
