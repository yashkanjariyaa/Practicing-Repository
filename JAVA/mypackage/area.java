package mypackage;

abstract class area{
    abstract void areaCalc(int l, int b);
    abstract void areaCalc(int r);
}
class areaOfRect {
    static void areaCalc(int l, int b){
        System.out.println(l*b);
    }
}
class areaOfTri {
    static void areaCalc(int l, int b){
        System.out.println((l*b)/2);
    }
}
class areaOfCircle{
    static void areaCalc(int r){
        System.out.println(3.14*r*r);
    }
}
