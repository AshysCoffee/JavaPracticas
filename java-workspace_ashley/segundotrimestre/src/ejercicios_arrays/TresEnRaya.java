package ejercicios_arrays;

import java.util.Scanner;

public class TresEnRaya {
	public static void main(String[]args){
		
		Scanner scan=new Scanner(System.in);
		int turn=0,l=0,movimiento;
		String [][] tres= new String[3][3];
		String contador,ficha = null;
		System.out.println("Las posiciones disponibles son los siguientes:");
		boolean repetido,ganador=false;
		for(int x=0;x<=2;x++)

		{

			for(int y=0;y<=2;y++)
			{
				l++;
				contador=""+l;
				tres[x][y]=contador;
				System.out.print(tres[x][y]);
			}
			System.out.println("");

		}


		while(turn!=9)
		{
			repetido=false;

			turn++;

			if(turn%2==0)
			{
				ficha="x";
			}
			else
			{
				ficha="o";
			}
			System.out.println("Turno de "+ficha);
			movimiento=scan.nextInt();
			switch (movimiento)
			{
			case 1:
				if(tres[0][0]=="x"||tres[0][0]=="o")
				{
					repetido=true;
				}
				else
				{
					tres[0][0]=ficha;					 
				}
				break;
			case 2:
				if(tres[0][1]=="x"||tres[0][1]=="o")
				{
					repetido=true;
				}
				else
				{
					tres[0][1]=ficha;					 
				}
				break;
			case 3:
				if(tres[0][2]=="x"||tres[0][2]=="o")
				{
					repetido=true;
				}
				else
				{
					tres[0][2]=ficha;					 
				}
				break;
			case 4:
				if(tres[1][0]=="x"||tres[1][0]=="o")
				{
					repetido=true;
				}
				else
				{
					tres[1][0]=ficha;					 
				}
				break;
			case 5:
				if(tres[1][1]=="x"||tres[1][1]=="o")
				{
					repetido=true;
				}
				else
				{
					tres[1][1]=ficha;					 
				}
				break;
			case 6:
				if(tres[1][2]=="x"||tres[1][2]=="o")
				{
					repetido=true;
				}
				else
				{
					tres[1][2]=ficha;					 
				}
				break;
			case 7:
				if(tres[2][0]=="x"||tres[2][0]=="o")
				{
					repetido=true;
				}
				else
				{
					tres[2][0]=ficha;					 
				}
				break;
			case 8:
				if(tres[2][1]=="x"||tres[2][1]=="o")
				{
					repetido=true;
				}
				else
				{
					tres[2][1]=ficha;					 
				}
				break;
			case 9:
				if(tres[2][2]=="x"||tres[2][2]=="o")
				{
					repetido=true;
				}
				else
				{
					tres[2][2]=ficha;					 
				}
				break;
			default:
				repetido=true;
				break;

			}
			if(repetido==false)
			{
				for(int i=0;i<=2;i++)
				{
					for(int j=0;j<=2;j++)
					{
						if(tres[i][j]=="x"||tres[i][j]=="o")
						{
							System.out.print(tres[i][j]);


						}
						else
						{
							System.out.print("-");

						}


					}
					System.out.println("");
				}
				for(int i=0;i<=2;i++)
				{
					if(tres[i][0]==tres[i][1]&&tres[i][0]==tres[i][2])
					{
						ganador=true;
						break;
					}
					if(tres[0][i]==tres[1][i]&&tres[0][i]==tres[2][i])
					{
						ganador=true;
						break;
					}




				}
				if(tres[0][0]==tres[1][1]&&tres[0][0]==tres[2][2])
				{
					ganador=true;
				}
				if(tres[0][2]==tres[1][1]&&tres[1][1]==tres[2][0])
				{
					ganador=true;
				}
				if(ganador==true)
				{
					break;

				}


			}
			else
			{
				System.out.println("Introduce un valor correcto");
				turn--;
			}

		}
		if(ganador==true)
		{
			System.out.print("Han ganado "+ ficha);
		}
		else
		{
			System.out.print("Empate");
		}
		scan.close();
	}
}		

	

