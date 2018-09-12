import java.util.Scanner;

// some intro stuff

  // Overloading constructor
  public PGM(String fileName){
    Scanner sc = new Scanner(new File(fileName));
    magic = sc.nextLine();
    width = sc.nextLine();
    // same for height and depth

    pixels = new int[height][width];

    // Reading pixel values
    for(int i = 0, i < height, i++){
      for(int j = 0, j < width, j++){
        pixels[i][j] = sc.nextInt();
      }
    }
  }
