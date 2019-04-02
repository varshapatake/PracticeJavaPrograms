package multidimentionalArray;

public class ThreeDMatrixSum {
	public static void main(String args[])
	{
		int mat1[][]={{1,2,3},{1,2,3},{1,2,3}};
		int mat2[][]={{2,3,4},{2,3,4},{2,3,4}};
		
		int result[][]=new int[3][3];
		
		for(int i=0;i<mat1.length;i++)
		{
			for(int j=0;j<mat1[i].length;j++)
			{
				result[i][j]=0;
				for(int k=0;k<3;k++)
				{
					result[i][j]=result[i][j]+mat1[i][k]*mat2[k][j];
					System.out.print(result[i][j]+" ");
				}
			}
			System.out.println();
		}
	}

}
