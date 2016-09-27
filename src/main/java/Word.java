import java.util.List;
import java.util.ArrayList;

public class Word {
  private String mName;
  private static ArrayList<Word> instances = new ArrayList<Word>();
  private ArrayList<Definition> mDefinitions;
  private int mId;

  public Word (String name) {
    mName = name;
    instances.add(this);
    mId = instances.size();
    mDefinitions = new ArrayList<Definition>();
  }

  public String getName() {
    return mName;
  }

  public static ArrayList<Word> all() {
    return instances;
  }

  public static void clear() {
    instances.clear();
  }

  public int getId() {
    return mId;
  }

  public static Word find(int id) {
    return instances.get(id -1);
  }

  public void addDefinition(Definition definition) {
    mDefinitions.add(definition);
  }

  public ArrayList<Definition> getDefinitions() {
    return mDefinitions;
  }
}
