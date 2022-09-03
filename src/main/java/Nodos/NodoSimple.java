package Nodos;

public class NodoSimple {
    private int num;
    private String desc;
    private NodoSimple sig;

    public NodoSimple (int num, String desc){
        this.num = num;
        this.desc = desc;
        this.sig = null;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public NodoSimple getSiguiente() {
        return sig;
    }

    public void setSiguiente(NodoSimple siguiente) {
        this.sig = siguiente;
    }

}
