import sun.security.pkcs11.wrapper.PKCS11Constants;

public class Main {
    public static void main(String[] args) {
//        TomJerry t1 = new TomJerry();
//        t1.name = "tomm";
//        t1.color = "blue";
//        t1.weight=30;
//
//        t1.introduceSelf();
//
//        TomJerry j1 = new TomJerry();
//        j1.name = "Jerrie";
//        j1.color = "red";
//        j1.weight = 45;
//
//        j1.introduceSelf();


//        Vehicle v1=new Vehicle();
//        v1.color="red";
//        v1.miles = 75000.63;
//        v1.numberOfWheels = 4;
//        v1.speed =  15.62;
//
//        v1.speed();


//        Book b1 = new Book();
//        b1.color = "red";
//        b1.name = "Dinosaur";
//        b1.page = 347;
//        b1.dimension = 67;
//        b1.lines = 23.5;
//
//        b1.BookQuality();
//
//    }
//}

//        marks m1 = new marks();
//        m1.name = "kulwinder";
//        m1.math = 89;
//        m1.sci = 56;
//        m1.chem= 78;
//        m1.totalmarks=89+56+78;
//
//        m1.totalmarks();


        Student s1 = new Student();
        s1.name = "Sam";
        s1.phoneNumber = "1234567889";
        s1.math = 67;
        s1.sci = 95;
        s1.chem = 89;

        s1.Studentinfo();

        Student s2 = new Student();
        s2.name = "Pam";
        s2.phoneNumber = "12344857889";
        s2.math = 57;
        s2.sci = 67;
        s2.chem = 37;

        s2.Studentinfo();

        Student s3 = new Student();
        s3.name = "tom";
        s3.phoneNumber = "12300567889";
        s3.math = 90;
        s3.sci = 88;
        s3.chem = 55;

        s3.Studentinfo();

    }
}
