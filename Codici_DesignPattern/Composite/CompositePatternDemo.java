public class CompositePatternDemo {
    public static void main(String[] args) {
        // Creare file (Leaf)
        FileComponent file1 = new FileLeaf("File1.txt");
        FileComponent file2 = new FileLeaf("File2.txt");
        FileComponent file3 = new FileLeaf("File3.txt");

        // Creare directory (Composite)
        DirectoryComposite dir1 = new DirectoryComposite("Directory1");
        DirectoryComposite dir2 = new DirectoryComposite("Directory2");

        // Aggiungere file alla prima directory
        dir1.addComponent(file1);
        dir1.addComponent(file2);

        // Aggiungere file e un'altra directory alla seconda directory
        dir2.addComponent(file3);
        dir2.addComponent(dir1);

        // Mostrare i dettagli della struttura di file
        dir2.showDetails();
    }
}
