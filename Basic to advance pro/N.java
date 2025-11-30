class N{int v;N l,r;N(int v){this.v=v;}}
class M{
    static void f(N n){if(n!=null){f(n.l);System.out.print(n.v+" ");f(n.r);}}
    public static void main(String[]a){
        N r=new N(1);r.l=new N(2);r.r=new N(3);
        f(r);
    }
}
