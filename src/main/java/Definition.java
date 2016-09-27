import java.util.List;
import java.util.ArrayList;

public class Definition {
  private String mMeaning;
  private static List<Definition> instances = new ArrayList<Definition>();
  private int mId;

  public Definition (String meaning) {
    mMeaning = meaning;
    instances.add(this);
    mId = instances.size();
  }

  public String getMeaning() {
    return mMeaning;
  }

  public static List<Definition> all() {
    return instances;
  }

  public static void clear() {
    instances.clear();
  }

  public int getId() {
    return mId;
  }

  public static Definition find(int id) {
    return instances.get(id - 1);
  }
}
