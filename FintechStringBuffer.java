public class FintechStringBuffer {

    private StringBuffer stringBuffer;

    // Constructor
    public FintechStringBuffer(String initialString) {
        this.stringBuffer = new StringBuffer(initialString);
    }

    // Additional methods
    public void append(String str) {
        stringBuffer.append(str);
    }

    public void insert(int index, String str) {
        stringBuffer.insert(index, str);
    }

    public void replace(int start, int end, String str) {
        stringBuffer.replace(start, end, str);
    }

    public void delete(int start, int end) {
        stringBuffer.delete(start, end);
    }

    public char charAt(int index) {
        return stringBuffer.charAt(index);
    }

    public void setCharAt(int index, char ch) {
        stringBuffer.setCharAt(index, ch);
    }

    public int length() {
        return stringBuffer.length();
    }

    public int capacity() {
        return stringBuffer.capacity();
    }

    public void ensureCapacity(int minCapacity) {
        stringBuffer.ensureCapacity(minCapacity);
    }

    public String toString() {
        return stringBuffer.toString();
    }

    public String substring(int start) {
        return stringBuffer.substring(start);
    }

    public String substring(int start, int end) {
        return stringBuffer.substring(start, end);
    }

    public static void main(String[] args) {

        FintechStringBuffer fintech = new FintechStringBuffer(
                "Fintech refers to firms using new technology to deliver financial services");

        // StringBuffer methods
        // Append
        fintech.append(" is the future!");
        System.out.println("Append: " + fintech);

        // Insert
        fintech.insert(7, "Insert");
        System.out.println("Insert: " + fintech);

        // Replace
        fintech.replace(0, 7, "NotFintech");
        System.out.println("Replace: " + fintech);

        // Delete
        fintech.delete(10, 19);
        System.out.println("Delete: " + fintech);

        // Char at
        char charAtIndex = fintech.charAt(5);
        System.out.println("Char at: " + charAtIndex);

        // SetCharAt
        fintech.setCharAt(0, 'F');
        System.out.println("SetCharAt: " + fintech);

        // Length
        int length = fintech.length();
        System.out.println("Length: " + length);

        // Capacity
        int capacity = fintech.capacity();
        System.out.println("Capacity: " + capacity);

        // EnsureCapacity
        fintech.ensureCapacity(20);
        System.out.println("EnsureCapacity: " + fintech);

        // To String
        String fintechStringStr = fintech.toString();
        System.out.println("To String: " + fintechStringStr);

        // Substring(int start)
        String substring1 = fintech.substring(3);
        System.out.println("Substring: " + substring1);

        // Substring(int start, int end)
        String substring2 = fintech.substring(3, 7);
        System.out.println("Substring: " + substring2);
    }
}

// Alternate code:

// public class FintechStringBuffer {
//     public static void main(String[] args) {

//         FintechStringBuffer fintech = new FintechStringBuffer("Fintech refers to firms using new technology to deliver financial services");

//         // Append
//         fintech.append(" Appended");
//         System.out.println("Append: " + fintech);

//         // Insert
//         fintech.insert(7, "Inserted");
//         System.out.println("Insert: " + fintech);

//         // Replace
//         fintech.replace(0, 7, "NotFintech");
//         System.out.println("Replace: " + fintech);

//         // Delete
//         fintech.delete(10, 19);
//         System.out.println("Delete: " + fintech);

//         // Char at
//         char charAtIndex = fintech.charAt(5);
//         System.out.println("Char at: " + charAtIndex);

//         // SetCharAt
//         fintech.setCharAt(0, 'F');
//         System.out.println("SetCharAt: " + fintech);

//         // Length
//         int length = fintech.length();
//         System.out.println("Length: " + length);

//         // Capacity
//         int capacity = fintech.capacity();
//         System.out.println("Capacity: " + capacity);

//         // EnsureCapacity
//         fintech.ensureCapacity(20);
//         System.out.println("EnsureCapacity: " + fintech);

//         // To String
//         String fintechStringStr = fintech.toString();
//         System.out.println("To String: " + fintechStringStr);

//         // Substring(int start)
//         String substring1 = fintech.substring(3);
//         System.out.println("Substring: " + substring1);

//         // Substring(int start, int end)
//         String substring2 = fintech.substring(3, 7);
//         System.out.println("Substring: " + substring2);
//     }
// }