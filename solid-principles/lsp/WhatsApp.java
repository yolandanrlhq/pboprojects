package lsp;

public class WhatsApp implements VideoGrupManager {
    @Override
    public void chat() {
        System.out.println("Fitur chat");
    }
    @Override
    public void sendPhotosAndVideos() {
        System.out.println("Fitur kirim foto dan video");
    }
    @Override
    public void callGroupVideo() {
        System.out.println("Fitur panggilan video grup");
    }
}