package august.classes;

public class StaticNestedClasses {

    public class CandidateInfo{
        private String name;
        private int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

    }

    public static void main(String[] args) {
        StaticNestedClasses obj = new StaticNestedClasses();
        CandidateInfo objCi = obj.new CandidateInfo();


        System.out.println(obj.hashCode());
        System.out.println(objCi.hashCode());

        objCi.setName("Kush");
        objCi.setAge(20);

        System.out.println(objCi.getName());
        System.out.println(objCi.getAge());

    }
}
