public class App {
    public static void main(String[] args)  {
        FileSystemComponent file1 = new File("File1.txt");
        FileSystemComponent file2 = new File("File2.txt");

        Directory directory1 = new Directory("Directory1");
        directory1.addComponent(file1);
        directory1.addComponent(file2);

        FileSystemComponent file3 = new File("File3.text");

        Directory directory2 = new Directory("Directory2");
        directory2.addComponent(file3);
        directory2.addComponent(directory1);

        directory2.display(""); 
    }
}
