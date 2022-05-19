public class Student {
    String name;
    String stdNo;
    String classes;
    Course kimya;
    Course fizik;
    Course bioloji;
    double avarage;
    boolean ispass;

    Student(String name, String stdNo, String classes, Course kimya, Course fizik, Course bioloji){
        this.name=name;
        this.stdNo=stdNo;
        this.classes=classes;
        this.kimya=kimya;
        this.fizik=fizik;
        this.bioloji=bioloji;
        this.avarage=0.0;
        this.ispass=false;
    }
    void addBulkExamNotes(int kimya, int fizik, int bio, int sozKimya, int sozFizik, int sozBio){
        if (kimya>=0 && kimya<=100)
               this.kimya.note=kimya;
        if (sozKimya>=0 && sozKimya<=100)
            this.kimya.sozlu=sozKimya;
        if (fizik>=0 && fizik<=100)
            this.fizik.note=fizik;
        if (sozFizik>=0 && sozFizik<=100)
            this.fizik.sozlu=sozFizik;
        if (bio>=0 && bio<=100)
            this.bioloji.note=bio;
        if (sozBio>=0 && sozBio<=100)
            this.bioloji.sozlu=bio;

    }
    void calcAvarage(){
        this.avarage=(((this.kimya.note * 0.8) + (this.kimya.sozlu * 0.2) + (this.fizik.note * 0.8) + (this.fizik.sozlu * 0.2)
        + (this.bioloji.note * 0.8) + (this.bioloji.sozlu * 0.2))/3);


    }
    boolean isCheckPass(){
        // CalcAvarage fonksiyonundaki değeri aldık ve bu 55 büyükse true değilse false değerini RETURN ettik.
        calcAvarage();
        return this.avarage>55;
    }

    void isPass(){
        this.ispass=isCheckPass(); // Return edilen True ya da False değerimizi  ispass niteliğimize atadık
        printNote();
        System.out.println("Ortalama : " + this.avarage);
        if (this.ispass){
            System.out.println("Sınıf Geçildi");

        }
        else{
            System.out.println("Tekrar!!!");

        }


    }
    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Biyoloji Notu : " + this.bioloji.note + " Biyoloji Sözlü Notu :" + this.bioloji.sozlu);
        System.out.println("Fizik Notu : " + this.fizik.note + " Fizik Sözlü Notu :" + this.fizik.sozlu);
        System.out.println("Kimya Notu : " + this.kimya.note + " Kimya Sözlü Notu :" + this.kimya.sozlu);
    }

}
