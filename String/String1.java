package StringFolder;
//char array is special type of array for that we doesn't want any Array.tostring method.
//in java string is immutable-i.e., we can not change value\
//int heap memory garbage collector can remove value
//in SCP garbage collector is used when SCP becomes full.
//SCP is inside the heap memory.

public class String1 {
    public static void main(String[] args) {
        
        char ca[]={'h','e','f','S','h','i','n','e'};
        System.out.println(ca);
        //1st way to create strings-by using new keyword 
        //here we use new keyword that allocate heap memory and using value (hefshine) it alloacate SCP (string constant pool)memory
        //
        String obj=new String("hefshine");
        System.out.println(obj);
        //2nd way to create strings-by using literals
        //here we use values(hefshine).so here value is stored in SCP(string constant pool) memory
        String str="hefshine";
        System.out.println(str);

    }
}
