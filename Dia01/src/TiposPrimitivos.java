public class TiposPrimitivos {
    
    public static void main(String[] args) {
        // Tipos primitivos
        byte b = 127; // 8 bits
        short s = 32767; // 16 bits
        int i = 2147483647; // 32 bits
        long l = 9223372036854775807L; // 64 bits
        float f = 3.4028235E38f; // 32 bits
        double d = 1.7976931348623157E308; // 64 bits
        //char c = 'c'; // 16 bits
        //char c = 0x0041; // 16 bits 
        char c = '\u00A9'; // unicode

        boolean bool = true; // 1 bit

        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + bool);
    }
}