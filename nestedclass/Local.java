class AA {
    void fun() {
        System.out.println("Hello Ritik");

        class BB {
            void BBfun() {
                System.out.println("Ye BB Fun wala Ritik hai");
                if (true){
                class CC {
                    void CCfun() {
                        System.out.println("CC ka fun ye if ke andar hai");
                    }
                }

                CC obb = new CC();
                obb.CCfun();
            }
            }
        }

        BB obj1 = new BB();
        obj1.BBfun();
    }
}

public class Local {
    public static void main(String[] args) {
        AA obj = new AA();
        obj.fun();

    }
}