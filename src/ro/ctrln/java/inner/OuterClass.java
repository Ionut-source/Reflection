package ro.ctrln.java.inner;

public class OuterClass {

    enum Weekday {MONDAY, TUESDAY};

    private final static int SIZE = 5;
    private static String [] messageList = {"Message1", "Message2"/*, "Message3", "Message4", "Message5","Message6", "etc."*/};

    public static class InnerClass {

        //enum Weekday {MONDAY, TUESDAY}; NU PUTEM DECLARA ENUMS IN INTERIORUL CLASELOR INTERIOARE

        private int nextIndex = 0;

        public boolean hasNext() {
            return (this.nextIndex <= messageList.length - 1);
        }

        public String next() {
            return messageList[this.nextIndex++];
        }
    }

    public void showMessages() {
        InnerClass innerClass = new InnerClass();
        while (innerClass.hasNext()) {
            System.out.println("Mesajul este: " + innerClass.next());
        }
    }

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.showMessages();
        //InnerClass innerClass = new InnerClass(); nu putem folosi o clasa non-statica intr-un context static
        Weekday weekday = Weekday.MONDAY;
    }
}
