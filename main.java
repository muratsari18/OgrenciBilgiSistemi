public class Main {
    public static void main(String[] args) {


        Course bioloji = new Course("Biyoloji", "BIO101", "BIO");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "101", "KMY");

        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "BIO");
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

        bioloji.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);


        Student s1 = new Student("Ali", "1", "2", kimya, fizik, bioloji);
        s1.addBulkExamNotes(10, 90, 67, 50, 67, 6);
        s1.isPass();

        Student s2 = new Student("Veli", "11", "2", kimya, fizik, bioloji);
        s2.addBulkExamNotes(10, 90, 67, 50, 33, 100);
        s2.isPass();


        Student s3 = new Student("Deli", "1", "2", kimya, fizik, bioloji);
        s3.addBulkExamNotes(100, 70, 100, 100, 67, 100);
        s3.isPass();

    }
}
