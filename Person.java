
    public class Person {
        // Private fields
        private String name;
        private int age;
    
        // Getter for 'name'
        public String getName() {
            return name;
        }
    
        // Setter for 'name'
        public void setName(String name) {
            this.name = name;
        }
    
        // Getter for 'age'
        public int getAge() {
            return age;
        }
    
        // Setter for 'age'
        public void setAge(int age) {
            if(age > 0) { // You can add validation here
                this.age = age;
            } else {
                System.out.println("Please enter a valid age.");
            }
        }
    
    
        public static void main(String[] args) {
            Person person = new Person();
    
            // Using setter methods
            person.setName("John");
            person.setAge(25);
    
            // Using getter methods
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());
        }
    
    
    
}
