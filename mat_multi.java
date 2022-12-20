package pranavlab;
import java.util.Scanner;

public class mat_multi {

	public static void main(String[] args) {
		int i,j,k,row1,col1,row2,col2;		
		System.out.println("Enter the rows of the first matrix");
		Scanner sc = new Scanner (System.in);
		row1 = sc.nextInt();
		System.out.println("Enter the columns of the first matrix");
		Scanner sca = new Scanner (System.in);
		col1 = sc.nextInt();
		int mat1[][]=new int[row1][col1];
		System.out.println("Enter the rows of the second matrix");
		Scanner scn = new Scanner (System.in);
		row2 = sc.nextInt();
		System.out.println("Enter the columns of the second matrix");
		Scanner scan = new Scanner (System.in);
		col2 = sc.nextInt();
		int mat2[][]=new int[row2][col2];
		int result[][]=new int[row1][col2];
		if(col1==row2)
		{
			System.out.println("Enter the first matrix");
			for(i=0;i<row1;i++)
			{
				for(j=0;j<col1;j++)
				{
					Scanner el = new Scanner (System.in);
					mat1[i][j]=el.nextInt();
				}			
			}
			System.out.println("The entered matrix is");
			for(i=0;i<row1;i++)
			{
				for(j=0;j<col1;j++)
				{
					System.out.print(""+mat1[i][j]+"\t");
				}
				System.out.print("\n");
			}
			System.out.println("Enter the second matrix");
			for(i=0;i<row2;i++)
			{
				for(j=0;j<col2;j++)
				{
					Scanner ele = new Scanner (System.in);
					mat2[i][j]=ele.nextInt();
				}			
			}
			System.out.println("The entered matrix is");
			for(i=0;i<row2;i++)
			{
				for(j=0;j<col2;j++)
				{
					System.out.print(""+mat2[i][j]+"\t");
				}
				System.out.print("\n");
			}
			//multiplying the matrices
			for(i=0;i<row1;i++)
			{
				for(j=0;j<col2;j++)
				{	
					for(k=0;k<row2;k++)
					{
						result[i][j]+=mat1[i][k]*mat2[k][j];
					}
				}
			}
			System.out.println("The result of the matrix is");
			for(i=0;i<row2;i++)
			{
				for(j=0;j<col1;j++)
				{
					System.out.print(""+result[i][j]+"\t");
				}
				System.out.print("\n");
			}
		}	
		else
			{
				System.out.println("The matrix cannot be multiplied");}
			}

	}




