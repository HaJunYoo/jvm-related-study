class MyPoint {
    MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    int x;
    int y;
}

class MyWindow {
    static interface OnClickListener {
        public void onClick(MyPoint point);
    }
    OnClickListener listener;

    MyWindow(OnClickListener listener) {
        this.listener = listener;
    }

    void click(MyPoint point) {
        listener.onClick(point);
    }
}

class ButtonListener implements MyWindow.OnClickListener {
    @Override
    public void onClick(MyPoint point) {
        System.out.print("ButtonListener.onClick(): ");
        System.out.println(point.x + ", " + point.y);
    }
}

public class Main {
    public static void main(String[] args) {
        MyWindow win = new MyWindow(new ButtonListener());
        win.click(new MyPoint(10, 10));
        win.click(new MyPoint(200, 150));
    }
}