package com.girik;
class Student{
    int rollno;
    String name;
}
public class ArrayDemo{
    public static void main(String[] args) {
        int nums[]=new int[4];
        int nums2[]={8,17,16,25};
        Student s1=new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();

        Student s[]=new Student[4];
        nums[0]=8;
        nums[1]=12;
        nums[2]=16;
        nums[3]=54;

        for (int k:nums){
            System.out.println(k);
        }  
        int d[][]={
            {1,2,3,4}, 
            {2,4,6,8},
            {5,6,7,8}
        };
        for (int k[]:d){
            for (int l:k){
                System.out.print(" "+l);
            }
            System.out.println();
        }
        // for (int i=0;i<d.length;i++){
        //     for (int j=0;j<d[i].length;j++){
        //         System.out.print(" "+d[i][j]);
        //     }
        //     System.out.println();
        // }
        // System.out.println(d[0][1]);
        // for (int i=0;i<4;i++){
        //     System.out.println(nums[i]);
        // }
        //System.out.println(nums[2]);
       // System.out.println(nums[5]);
    }
}