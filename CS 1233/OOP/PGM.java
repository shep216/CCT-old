import java.util.Scanner;

public class PGM extends Image{
  // Overloading constructor
  public PGM(String fileName){
    try{
      Scanner sc = new Scanner(new File(fileName));
      magic = sc.nextLine();
      width = sc.nextLine();
      // same for height and depth

      pixels = new int[height][width];

      // Reading pixel values
      for(int i = 0; i < height; i++){
        for(int j = 0; j < width; j++){
          pixels[i][j] = sc.nextInt();
        }
      }
    }
    catch(FileNotFoundException E){
      System.err.println(E);
    }
  }

  @Override
  public void flip_horizontally(){
    // TODO: implement this and others
  }

  public int[][] getPixels(){
    return pixels;
  }

  public void save(String outputName){
    PrintWriter writer = new PrintWriter(outputName);
    writer.println(magic);
    writer.println(width + " " + height);
    writer.println(depth);

    // for loop to print pixels[i][j] like w/ constructor

    writer.close();
  }
}
