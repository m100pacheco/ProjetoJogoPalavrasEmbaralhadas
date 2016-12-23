
public class AplicativosGerais {

    public int rand(int Str, int End) {
        return (int) Math.ceil(Math.random() * (End  - Str + 1)) - 1 + Str;
    }
    
}
