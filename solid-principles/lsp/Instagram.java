package lsp;

public class Instagram implements PostMediaManager {
    @Override
    public void chat() {
        System.out.println("Fitur chat di Instagram");
    }
    @Override
    public void sendPhotosAndVideos() {
        System.out.println("Fitur kirim foto dan video di Instagram");
    }
    @Override
    public void publishPost() {
        System.out.println("Fitur posting di Instagram");
    }    
}