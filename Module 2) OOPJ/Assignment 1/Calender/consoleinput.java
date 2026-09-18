public class consoleinput {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

	}

	public static String getstring() {

		try {

			byte arrinput[] = new byte[100];

			int length = System.in.read(arrinput);

			byte arrfinal[] = new byte[length - 2];

			System.arraycopy(arrinput, 0, arrfinal, 0, length - 2);

			String objstring = new String(arrfinal);

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

}