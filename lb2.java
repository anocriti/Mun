public class lb2 {
	static String output1;
	public static void passwordGenerate(String s1,String s2)
	{
		String[] a=new String[3];
		String[] b=new String[3];
		int len1=s1.length();
		int len2=s2.length();
		if(len1>3)
		{
		if(len1%3==0)
		{
			int i=0,j=0;
			int x=len1/3;
			while(j<3)
			{
			a[j]=s1.substring(i, i+x);
			j++;
			i=i+x;
			}
		}
		else if(len1%3==1)
		{
			int i=0;
			int x=len1/3;
			a[0]=s1.substring(0, x);
			a[1]=s1.substring(x,2*x+1);
			a[2]=s1.substring(2*x+1);
		}
		else
		{
			int i=0;
			int x=len1/3;
			a[0]=s1.substring(0, x+1);
			a[1]=s1.substring(x+1,2*x+1);
			a[2]=s1.substring(2*x+1);
		}
		}
	/////////////////////////////////////	
		if(len2>3)
		{
		if(len2%3==0)
		{
			int i=0,j=0;
			int x=len2/3;
			while(j<3)
			{
			b[j]=s2.substring(i, i+x);
			j++;
			i=i+x;
			}
		}
		else if(len2%3==1)
		{
			int i=0;
			int x=len2/3;
			b[0]=s2.substring(0, x);
			b[1]=s2.substring(x,2*x+1);
			b[2]=s2.substring(2*x+1);
		}
		else
		{
			int i=0;
			int x=len2/3;
			b[0]=s2.substring(0, x+1);
			b[1]=s2.substring(x+1,2*x+1);
			b[2]=s2.substring(2*x+1);
		}
		}
		String res=a[1]+b[1]+b[0];
		output1=res;
		
		
		}
		
			

	public static void main(String args[])
	{
		passwordGenerate("MACHINE","LEARNING");
		System.out.println(output1);
	}
}

