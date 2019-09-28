
public class Prog6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String out = "";
		for(int i=0; i< args.length; i++) {
			
			boolean flag = true; 
			for (int j=i+1; j< args.length; j++) {
				if (args[i].equals(args[j])) {
					flag = false;
					break;
				}
			}
			if(flag)
			out += (args[i]+",");
		}
		System.out.println(out.substring(0, out.length()-1));
	}

}
