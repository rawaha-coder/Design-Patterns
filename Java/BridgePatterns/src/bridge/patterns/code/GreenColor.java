package bridge.patterns.code;

class GreenColor implements IColor {
    @Override
    public void fillWithColor(int border) {
        System.out.print("Green color with " + border +" inch border.");
    }
}
