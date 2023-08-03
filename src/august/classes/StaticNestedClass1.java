package august.classes;

public class StaticNestedClass1 {

    private static String companyName;

    static public class CandidateInfo{
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

        public void setCompanyName(String _companyName){
            companyName = _companyName;
        }

        public String getCompanyName(){
            return companyName;
        }


        public class CandidateSalary{
            private int salary;

            public int getSalary() {
                return salary;
            }

            public void setSalary(int salary) {
                this.salary = salary;
            }
        }
    }

    public static void main(String[] args) {
        StaticNestedClass1 obj = new StaticNestedClass1();
//      CandidateInfo objCi = obj.new CandidateInfo();  // If companyName is not static
        CandidateInfo objCi =  new CandidateInfo();     // changed the companyName to static

        CandidateInfo.CandidateSalary objCs = objCi.new CandidateSalary();

        objCi.setName("Kush");
        objCi.setAge(20);
        objCi.setCompanyName("Fargo");
        objCs.setSalary(1000000);

        System.out.println(objCi.getName());
        System.out.println(objCi.getAge());
        System.out.println(objCi.getCompanyName());
        System.out.println(objCs.getSalary());

    }
}
