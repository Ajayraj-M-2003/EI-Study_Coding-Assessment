package Composite;

public class Main {
    public static void main(String[] args) {
        // Create files
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");
        File file3 = new File("file3.txt");

        // Create directories
        Directory directory1 = new Directory("dir1");
        Directory directory2 = new Directory("dir2");

        // Add files to directory1
        directory1.addComponent(file1);
        directory1.addComponent(file2);

        // Add file to directory2
        directory2.addComponent(file3);

        // Add directory2 inside directory1
        directory1.addComponent(directory2);

        // Show the hierarchy
        directory1.showDetails();
    }
}
