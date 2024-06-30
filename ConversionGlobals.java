public class Globals
{
	public static void main(String[] args)
	{
		String s = "";
		String c = "";
		s = ConsoleInput.readToWhiteSpace(true);
		c = ConsoleInput.readToWhiteSpace(true);
		int ps = 0;
		for (int i = 0; i < (int)c.length(); i++)
		{
			switch (c.charAt(i))
			{
			case 'R':
				if (ps + 1 < (int)s.length())
				{
					ps++;
				}
				break;
			case 'L':
				if (ps > 0)
				{
					ps--;
				}
				break;
			case 'T':
				if (s.charAt(ps) != '9')
				{
					s.charAt(ps)++;
				}
				break;
			case 'D':
				if (s.charAt(ps) != '0')
				{
					s.charAt(ps)--;
				}
				break;
			case 'S':
				i++;
				String element = "";
				for (i; i < (int)c.length() && c.charAt(i) >= '0' && c.charAt(i) <= '9'; i++)
				{
					element.push_back(c.charAt(i));
				}
				i--;
				int ind = Integer.parseInt(element);
				swap(s.charAt(ps), s.charAt(ind - 1));
				break;
			}
		}
		System.out.print(s);
		System.out.print("\n");
	}
}
