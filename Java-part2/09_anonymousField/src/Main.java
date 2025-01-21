class MyWindow {
    interface OnClickListener {
        public void onClick();
    }
    OnClickListener listener = new MyWindow.OnClickListener() {
        @Override
        public void onClick() {
            System.out.println("Anonymous listener");
        }
    };

    public void click() {
        listener.onClick();
    }
}

public class Main {
    public static void main(String[] args) {
        MyWindow win = new MyWindow();
        win.click();
    }
}