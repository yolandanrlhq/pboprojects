package lsp;

public class Main {
    public static void main(String[] args) {
        WhatsApp wa = new WhatsApp();
        Instagram ig = new Instagram();

        System.out.println("Fitur WhatsApp:");
        wa.chat();
        wa.sendPhotosAndVideos();
        wa.callGroupVideo();

        System.out.println("\nFitur Instagram:");
        ig.chat();
        ig.sendPhotosAndVideos();
        ig.publishPost();
    }   
}