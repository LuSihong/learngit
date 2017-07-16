class  Week1
/*将int型32位整数转换为8个16进制数,结果从低位到高位
*/
{
	public static void main(String[] args) 
	{
		int n = 333333333;
		int temp;
		for(int i = 0;i < 8;i ++)
		{
			temp = n & 15;
			if(temp < 10)
			{
				System.out.println(temp);
			}
			else
			{
				System.out.println((char)(temp - 10 + 'A'));
			}
			n = n >> 4;
		}
	}
}
