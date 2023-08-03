package inheritance;

public class Child extends Father {

        private boolean isModified;
        public Child(String car_name){
                super(car_name);
        }


        //modification
        public boolean isModified() {
                return isModified;
        }

        public void setModified(boolean modified) {
                this.isModified = modified;
        }


}
