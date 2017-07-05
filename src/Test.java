public class Test {
    public static void main(String[] args) {
        ReportCard student1 = new ReportCard();
        System.out.println(student1);

        ReportCard student2 = new ReportCard("Melania", "Trax", 5,6,7,3,4,5);
        System.out.println(student2);

        student1.setmName("Carl");
        student1.setmSurname("Delfino");
        student1.setmArtGrade(6);
        student1.setmMathGrade(3);

        System.out.println(student1.getmName());
        System.out.println(student1);
    }
}