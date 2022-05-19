public class Course {
    String name;
    String code;
    String prefix;
    int note, sozlu;
    Teacher teacher; // bu nesne teacher sınıfındaki tüm niteliklere ulaşır.

    Course (String name, String code, String prefix){

        this.name=name;
        this.code=code;
        this.prefix=prefix;
        int note = 0;
        int sozlu=0;

    }
    // Teacher türünde bir nesne parametre olarak gelecek. Teacher sınıfında oluşturulacak teacher nesne girilecek.
    void addTeacher(Teacher teacher){
        if (teacher.branch.equals(this.prefix)) // this.teacher demedik çünkü bu sınıftaki nesnenin branşını alscağız
            // ve bunu BURADA BULUNAN PREFIX ile karşılaştıracağız. Branch burada DEĞİL.

        this.teacher=teacher;
        // Course sınıfındaki teacher nesnesine atanıyor.
        else
            System.out.println("Öğretmen branşı ile sınıf kodu uyumsuz.");

    }
    void printTeacherInfo(){
        System.out.println("Teacher name :" + this.teacher.name);
        System.out.println("Teacher number :" + this.teacher.phone);
        System.out.println("Teacher Branch :" + this.teacher.branch);
    }
}
