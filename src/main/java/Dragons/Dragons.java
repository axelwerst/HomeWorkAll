package Dragons;

public class Dragons {
    private String name;
    private int age;
    private int weigth;
    // private static typeD type;

    public Dragons (String name, int age, int weigth){}
    public void setName (String name) {
        this.name = name;
    }
    public void setAge (int age) {
        this.age = age;
    }
    public void setWeigth(int weigth) {
        this.weigth = weigth;
    }

   // public void setType(typeD type) {
    //    this.type = type;
  //  }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeigth() {
        return weigth;
    }
  //  public enum getType(){
 //       return type;
  //  }

    @Override
    public String toString() {
        return "Dragons{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weigth=" + weigth +
                '}';
    }
}