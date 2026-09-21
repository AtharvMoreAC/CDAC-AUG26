public class consoleinput {

public static void main(String[] args) {

}

public static String getstring() {

    try {

        byte arrinput[] = new byte[100];

        int length = System.in.read(arrinput);

        if (length <= 0) {
            return "";
        }

        String objstring = new String(arrinput, 0, length);

        // Remove Enter key characters
        objstring = objstring.replace("\r", "").replace("\n", "");

        return objstring;

    } catch (Exception e) {

        e.printStackTrace();
    }

    return null;
}

public static int getint() {

    String objstring = getstring();

    int num1 = Integer.parseInt(objstring);

    return num1;
}

public static float getfloat() {

    return Float.parseFloat(getstring());
}

public static boolean getboolean() {

    return Boolean.parseBoolean(getstring());
}

}
