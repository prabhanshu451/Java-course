

// public class marr 
// {
//     public static void main(String[] args) 
//     {
//         int nums[][] = new int [3][4];
//         int[] n1 = {1,2,3,4};
//         int[] n2 = {5,6,7,8};     
//         int[] n3 = {9,10,11,12}; 

//         for (int i = 0;i<3;i++){
//             for(int j = 0;j<4;j++)
//             {
//                 if (i == 0){
//                     nums[i][j] = n1[j];
//                 }else if (i == 1){
//                     nums[i][j] = n2[j];
//                 }else if (i == 2){
//                     nums[i][j] = n3[j];
//                 }
//                 System.out.print(nums[i][j] + " ");
               
//             }
//             System.out.println();
//         }
            
//         System.out.println(nums[0][0]);

//         }
//     }
    
// public class marr{
//     public static void main (String[] args)
//     {
//         int nums[][] = new int[3][4];

//         for(int i=0;i<3;i++){
//             for(int j = 0; j < 4; j++){
//                 nums[i][j] = (int)(Math.random()*10);
//             }
//         }
//         // for (int i = 0; i < 3;i++){
//         //     for(int j = 0; j<4;j++){
//         //         System.out.print(nums[i][j] + " ");
//         //     }
//         //     System.out.println();
//         // }
//         // enhanced for loop  this is used to iterate through the array
//         for (int n[] : nums){
//             for (int m : n){
//                 System.out.print(m + " ");
//             }
//             System.out.println();
//         }
//         System.out.println(nums[1][3]);   
//     }
// }

// public class marr
// {
//     public static void main(String[] args)
//     {
//         int nums[][] = new int [3][];
//         nums[0] = new int[4];
//         nums[1] = new int[3];
//         nums[2] = new int[2];
// // basic for loop
// for(int i = 0; i<3; i++)
// {
//     for(int j = 0; j< nums[i].length; j++)
//     {
//         nums[i][j] = (int)(Math.random() * 100);
//     }
// }


// // the values are created with using enhanced for loop
//         for (int[] num : nums) {
//             for (int j = 0; j < num.length; j++) {
//                 num[j] = (int)(Math.random() * 100);
//             }
//         }
//         // we can write an enhanced for loop to iterate through the array for the above loop

//         for (int n[] : nums)
//         {
//             for (int m : n)
//             {
//                 System.out.print(m + " ");
//             }
//             System.out.println();
//         }
//     }

// }


// 3d array
// public class marr
// {
    
//     public static void main(String[] args)
//     {
//         int nums [][][] = new int[3][4][4];
//         for(int i = 0; i <3 ;i++)
//         {
//             for (int j = 0; j <4; j++ )
//             {
//                for(int k =0; k < 4; k++)
                
//                     nums[i][j][k] = (int)(Math.random() *100);
                    
                
//             }
//         }
//         for(int i = 0; i <3 ;i++)
//         {
//             for (int j = 0; j <4; j++ )
//             {
//                 for (int k = 0; k < 4; k++)
//                 {
//                     System.out.print(nums[i][j][k] + " ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

// array of objects 
// store objects which are created from a class manually into an array of objects
// class student
// {
    
//         int rollno;    in
//         String name; initia
//         int marks;

    
// }




//     public class marr
//     {
//         public static void main(String[] args)
//         {
//             // create an array of objects
//             student s1 = new student();
//             // create an object of the class student and assign values to the object
//             s1.rollno = 1;
//             s1.name = "ram";
//             s1.marks = 32;

//             student s2 = new student();
//             s2.rollno = 2;
//             s2.name = "shyam";
//             s2.marks = 45;

//             student s3 = new student();
//             s3.rollno = 3;
//             s3.name = "krishna";
//             s3.marks = 50;
//             System.out.println(s1.rollno + ":" + s2.name + ":" +  s3.marks);
//            here we are creating an array of objects and assigning values to the objects in the array of objects
//             student students[] = new student[3];
//             students [0] = s1;
//             students [1] = s2;
//             students [2] = s3;
//             // now print the values of the objects in the array of objects.
//             // System.out.println(students[1].rollno + ":" + students[2].name + ":" +  students[0].marks);
//         //      for (int i = 0; i <students.length; i++)
//         //      {
//         //         System.out.println(students[i].rollno + ":" + students[i].name);
//         //      }
//         // }


//         // use enhanced for loop
//         for (student s : students)
//         {
//             System.out.println(s.rollno + ":" + s.name + ":" + s.marks);    
//         } 
//     }
//     }

