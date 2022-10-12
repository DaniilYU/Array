package com.company;

public class Main {
    public static void inn(int Massive[]) {
        int a = Massive.length;
        int sum=0;
            for (int i = 0; i < a; i++) {
                sum = sum + Massive[i];
            }
        System.out.println("Cумма всех чисел в массиве при использовании цикла for = "+sum);
            int j=0;
            sum=0;
            do{
                sum = sum+Massive[j];
                j++;
            } while(j<a);
        System.out.println("Cумма всех чисел в массиве при использовании цикла do/while = "+sum);
            sum=0;
            for(int n=0;n<17;n++){
                if(n==a)
                    break;
                sum=sum+Massive[n];
            }
        System.out.println("Cумма всех чисел в массиве при использовании цикла break = "+sum);

    }

    public static void main(String[] args){
        int a = (int)(Math.random()*10);
        int[] Massive = new int[a];
        int k;
        for (k = 0; k < a; ++k) {
                Massive[k] = (int) (Math.random() * 10.00);
                System.out.print(Massive[k] + "\t");
        }
        inn(Massive);
    }
}