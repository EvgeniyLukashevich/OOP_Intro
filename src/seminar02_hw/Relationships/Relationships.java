package seminar02_hw.Relationships;

import java.io.IOException;

public interface Relationships {
    String[] current = new String[]{"wife", "husband", "brother", "sister", "cousin"};
    String[] older = new String[]{"mother", "father", "uncle", "aunt", "mother-in-law", "parent-in-law"};
    String[] younger = new String[]{"son", "daughter", "nephew", "son-in-law", "daughter_in_law"};

    public String relations(String relationship) throws IOException;
}
