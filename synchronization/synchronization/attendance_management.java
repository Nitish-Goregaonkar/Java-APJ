package synchronization.synchronization;

public // Source code is decompiled from a .class file using FernFlower decompiler.
public class attendance_management{
   public attendance_management() {
   }

   public static void main(String[] var0) {
      Student var1 = new Student("Nitish Goregaonkar", "2221826", "TY Computer Engineering");
      var1.displayInfo();
      Attendance var2 = new Attendance(var1.getId(), "2024-08-12", true);
      var2.markAttendance(var1);
      var2.displayAttendance();
      Attendance var3 = new Attendance(var1.getId(), "2024-08-13", true);
      var3.markAttendance(var1, "2024-08-13");
      var3.displayAttendance();
   }
}
 {
    
}
