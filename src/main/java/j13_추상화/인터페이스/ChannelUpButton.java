package j13_추상화.인터페이스;

public class ChannelUpButton extends Button{

    @Override
    public void onPressed() {
        System.out.println("채널을 한 칸 올립니다.");
    }

    @Override
    public void onDown() {
        System.out.println("채널을 계속 올립니다.");
    }
}
