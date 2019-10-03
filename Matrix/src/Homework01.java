import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;

public class Homework01 {

	public static void main(String[] args) {
		
// ���������� ���� ����� ����� �� 1 �� 10 (��� ��� ����������, �����?) ��� ����������� ������ � ������ �������

	try{	
		
		Scanner sc = new Scanner(System.in);
			
		int n, m;
		do {
			System.out.println("������� ����� ������������� ����� �� 1 �� 10:");
				while (!sc.hasNextInt()) {
					System.out.println("�� �������, ��� �� ����� ����� ������������� ����� �� 1 �� 10?");
					sc.next();
				}
				n = sc.nextInt();
			} while (n < 1 || n > 10);
				System.out.println("�������!\n");
		
				do {
					System.out.println("������� ��� ���� ����� ������������� ����� �� 1 �� 10:");
					while (!sc.hasNextInt()) {
						System.out.println("�� �������, ��� �� ����� ����� ������������� ����� �� 1 �� 10?");
						sc.next();
					}
					m = sc.nextInt();
				} while (m < 1 || m > 10);
				System.out.println("������� �������!\n");
			
/*����� ��� ��� � ����������� ������ ��������� ��� ��������� ����� �������� ����� (��������� try/catch)
 			
		int n, m;
		do {
			System.out.println("������� ����� ������������� ����� �� 1 �� 10:");
			if (!sc.hasNextInt()) {
				System.out.println("�� �������, ��� �� ����� ����� ������������� ����� �� 1 �� 10?");
				sc.next();
			}
			n = sc.nextInt();
		} while (n < 1 || n > 10);
		System.out.println("�������!\n");
		
		do {
			System.out.println("������� ��� ���� ����� ������������� ����� �� 1 �� 10:");
			if (!sc.hasNextInt()) {
				System.out.println("�� �������, ��� �� ����� ����� ������������� ����� �� 1 �� 10?");
				sc.next();
				}
			m = sc.nextInt();
		} while (m < 1 || m > 10);
		System.out.println("������� �������!\n");*/
			
				sc.close();
						
//������ ����������� �������� ������� � ������� �� 1 �� 10
			
				System.out.println("� ��� ���������� ���������� ������� �� ��������� �����:");
		
				int [][] matrix = new int [n][m];
				Random rnd = new Random();
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < m; j++) {
						matrix[i][j] = rnd.nextInt(10) + 1;
					}
				}
				for (int i = 0; i < n; i++, System.out.println()) {
					for (int j = 0; j < m; j++) {
						System.out.print(matrix[i][j] + " ");
					}
				}    
				System.out.println();
			
/*��� ����� ���, �� ������ ����� ������ �� ����� ������	

			int [][] matrix = new int [n][m];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					matrix[i][j] = (int)(Math.random() * 10);
				}
			}
			for (int i = 0; i < n; i++, System.out.println()) {
				for (int j = 0; j < m; j++) {
					System.out.print(matrix[i][j] + " ");
				}
			}    
			System.out.println();*/
        
//������ ����������� � ������������ �������� ������ ������ �������
        
				System.out.println("�����������, �� �� ���������� ����������� � ������������ �������� � ������ ������");
				for(int i = 0; i < n; i++) {
					int minimum = matrix[i][0];
					for(int j = 1; j < m; j++) {
						if(matrix[i][j] < minimum) {
							minimum = matrix[i][j];
						}
					}
					int maximum = matrix[i][0];
					for(int j = 1; j < m; j++) {
						if(matrix[i][j] > maximum) {
							maximum = matrix[i][j];
						}
					}
					System.out.println("min=" + minimum + " " + "max=" + maximum);
				}
				System.out.println();
            	
//������ ����� ��������� � �������� �������
            	
				System.out.println("C���� ��������� ������� ������� ���� ���������. ����������!");
				for (int i = 0; i < m; i++) {
					int sum = 0;
					for (int j = 0; j < n; j++) {
						sum += matrix[j][i];
					}
					System.out.print(sum + " ");
				}
				System.out.println("\n");
	                
//�������� ��������������� �������
	                
				System.out.println("� ������� - ����������������");
				int[][] tMatrix = new int[m][n];
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < m; j++) {
						tMatrix[j][i] = matrix[i][j];
					}
				}
				for (int i = 0; i < m; i++) {
					for (int j = 0; j < n; j++) {
						System.out.print(tMatrix[i][j] + " ");
					}
					System.out.println();
				}
				System.out.println();
				System.out.println("�������������!!!");
		}
	catch (InputMismatchException e) {
		System.out.println("�������, �� ����� ������� ����� ��� �������������� ������. ��� ���� �� �����, ������������� ��������� � ���������� �����!");
		}
	}
}
// ��� ��� ��� ����� ���� - ���� �� �������� ���� �����, ����� ������� ��� �������� ������!

/*	                for (int i = 0; i < m; i++) {
	                	int [][] tMatrix = new int [n][m];
	                	
	                    for (int j = 0; j < n; j++) {
	                        tMatrix[j][i] = matrix[i][j];
	                    }
	                System.out.println(tMatrix);
/*	}
/*	                int[][] tMatrix(int [][] matrix){
	                    for (int i = 0; i < matrix.length; i++) {
	                        for (int j = i+1; j < matrix[0].length; j++) {
	                            double temp = matrix[i][j];
	                            matrix[i][j] = matrix[j][i];
	                            matrix[j][i] = temp;
	                        }
	                    }
	/*                    // ����� 3 - ���������������� �������
	                    for (int i = 0; i < n; i++) {
	                        for (int j = i+1; j < m; j++) {
	                            int tMatrix = matrix[i][j];
	                            matrix[i][j] = matrix[j][i];
	                            matrix[j][i] = tMatrix;
	                        }
	                    }
	             
	                    // ����� 4 - ������� �� ����� ����������������� �������
	                    System.out.println();
	                    System.out.println("����� �������");
	                    System.out.println("------");
	                    for (int i = 0; i < n; i++) {
	                        for (int j = 0; j < n; j++) {
	                            System.out.printf("%3d", matrix[i][j]);
	                        }
	                        System.out.println();
	                    }
//	                    temp[index] = sum;
//	                    System.out.println("Index is: " + index + " Sum is: "+sum);
//	                    index++;
	        }	
/*   //     int max, min;
        Random rnd = new Random();
        for (int i=0;i < matrix.length;i++) {
            for (int j=0;j < matrix[i].length;j++) {
            	matrix[i][j]=rnd.nextInt(10) + 1;
            }
        }
        for (int i=0;i < matrix.length;i++,System.out.println()) {
            for (int j=0;j < matrix[i].length;j++) {
                System.out.print(matrix[i][j]+" ");
            }
        }    
        System.out.println();
/*        System.out.println("�����������, �� �� ���������� ����������� �������� ������ ������ �������!");
        for(int i = 0; i < m; i++)
        {
           int min = matrix[i][0];
            for(int j = 1; j < n; j++)
            {
               if(matrix[i][j] < min)
               {
                   min = matrix[i][j];
                   System.out.println(min);
               }
            }
/*            int max = matrix[i][0];
            for(int j = 1; j < n; j++)
            {
               if(matrix[i][j] > max){
               {
                    max = matrix[i][j];
                    System.out.println(max);
               }
            }

            
   /*     }
			System.out.println();
			System.out.println("������������ �������� ����� �������. ����������!");
	        for(int i = 0; i < m; i++)
	        {
			int max = matrix[i][0];
            for(int j = 1; j < n; j++)
            {
               if(matrix[i][j] > max)
               {
                   max = matrix[i][j];
               }
            }
            System.out.println(max);
/*     //����������� �������		
        		int[] a = new int[m];
        		System.out.println("������ ������ ��������");
        		for (int i = 0; i < a.length; i++){
        			System.out.print(a[i] + " ");
        	/*	System.out.println("Array" + Arrays.toString(a));
        		int minValue = a[0];
        		for (int i = 0; i < a.length; i++){
        			if (a[i] < minValue){
        				minValue = a[i];
        			}
        		}
        		System.out.println("min value " + minValue);*/
        //������������ �������
 /*       		int maxValue = 0;
        		for (int number: m){
        			if (number > maxValue){
        				maxValue = number;
        			}
        		}
        		System.out.println("max value " + maxValue);
//		Random rnd = new Random();
  //      matrix = rnd.nextInt();
    //    System.out.println("Random number: " + number);
//	    System.out.println(n +" " + m);
/*		int number = 1;{
		for (int column = 0; column < matrix.length; column++){
			for (int row = 0; row < matrix.length; row++){
				matrix[row][column] = number++;
			}
		}
		for (int[] row:matrix){
			for (int element:row){
				System.out.print(element + "\t");
			}
			System.out.println();
            }
	}
*/







