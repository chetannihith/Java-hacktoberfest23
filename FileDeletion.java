public class FileDeletion {
    public static void main(String[] args) {
        String filePath = "path_to_your_file.txt"; // Replace with the path to your file

        // Create a Path object for the file
        Path path = Paths.get(filePath);

        try {
            // Delete the file
            Files.delete(path);
            System.out.println("File deleted successfully.");
        } catch (IOException e) {
            System.err.println("Unable to delete the file: " + e.getMessage());
        }
    }
