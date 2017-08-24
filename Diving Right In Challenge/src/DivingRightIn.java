import java.util.*;

public class DivingRightIn
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = in.nextLine();
		System.out.println("What is your age?");
		int age = in.nextInt();
		System.out.println("What year were you born?");
		int birth = in.nextInt();
		
		if (birth > 2017 - age)
		{
			System.out.println("No you weren't you liar!");
			birth = in.nextInt();
		}
		
		if (birth < 2017 - age)
		{
			System.out.println("No you weren't you liar!");
			birth = in.nextInt();
		}

		System.out.println();
		System.out.println("Hello " + name + ". It is nice to meet you!");

		if (age <= 16)
		{
			System.out.println("You are pretty young");
		}

		if (age == 17)
		{
			System.out.println("Cool! You are 17 huh?");
		}

		if (age >= 18)
		{
			System.out.println("One thing is for sure. You don't have school anymore!");
		}

		System.out.println();

		for (int i = 0; i <= age; i++)
		{
			System.out.println("In " + birth + " you were " + i + " years old");
			birth = birth + 1;
		}

		System.out.println();
		System.out.println("That is " + age * 7 + " in dog years");
	}
}