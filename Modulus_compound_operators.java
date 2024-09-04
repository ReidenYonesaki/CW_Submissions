//PART ONE: MODULUS
//What would each of the following 1-6 lines including the modulo operator cause to be printed?
     System.out.println(14 % 13); = 1
     System.out.println(8 % 11); = 8
     System.out.println(6 % 2); = 0
     System.out.println(7 % 2); = 1
     System.out.println(274 % 10); = 4
     System.out.println(881 % 2); = 1

//PART TWO: COMPOUND OPERATORS AND SHORTCUTS (credits to runestone.academy)

    int x = 0; 
    int y = 1;
    int z = 2;
    x--; // x followed by the double minus sign x=x-0
    y++; = 2
    z+=y; z=z+y
//After the above code runs, what are x, y, and z equal to?

    int a = 3;
    int b = 5;
    int c = 2;
    a = c * 2; =4
    b = b / 2; b/=2 b=b/2 = 2
    c++; c++=3
//After the above code runs, what are a, b, and c equal to?

//PART THREE: CASTING

    int total = 5 + 7 + 2;
    (double) (total / 3); //Option A
    total / 3; //Option B
    (double) total / 3; //Option C

//Which of the above options correctly computes the average of total? Why do the other options not work? 

Option C. The others do not work because it does not give as specific an answer as C.