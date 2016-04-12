package org.hfeng.misc;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Hello World From Library");
        String str = ":abc:abc";
        String[] tmp = str.split(":");
        for (int i = 0; i < tmp.length; i++) {
            System.out.println(tmp[i]);
        }

        System.out.println(tmp[1].equals(tmp[2]));
        System.out.println(tmp[1].equals(tmp[0]));
    }
}
