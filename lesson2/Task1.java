package lesson2;

public class Task1 {
    public static void main(String[] args) {
        int humans = 3;
        int dwarf = 1;
        int elf = 1;
        int hobbits = 4;
        int BrotherHoodOfTheRing = humans + dwarf + elf + hobbits;
        int Orks = 100000;
        int abracadabra= 2;
        System.out.println(BrotherHoodOfTheRing);
        // Gendalf died
        BrotherHoodOfTheRing = 9-1;
        System.out.println(BrotherHoodOfTheRing);
        // Ents distoyed the castle -50000 orks
        System.out.println(Orks/abracadabra);
        // Gendalf 1 Sarryman 0
        int End = (Orks * BrotherHoodOfTheRing)*0;
        System.out.println(End);
        //
    }
}
