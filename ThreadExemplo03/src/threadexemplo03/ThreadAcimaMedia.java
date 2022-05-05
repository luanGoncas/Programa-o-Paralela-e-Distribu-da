package threadexemplo03;

public class ThreadAcimaMedia implements Runnable{
        private Integer[] numeros;
        private double media;
        private int qtdAcimaMedia;

        public ThreadAcimaMedia(Integer[] numeros, double media){
            this.numeros = numeros;
            this.media = media;
            this.qtdAcimaMedia = qtdAcimaMedia;
        }

        public double getAcimaMedia() {
            return this.qtdAcimaMedia;
        }

        public void run(){
            for (int num : numeros) {
                if(num > media){
                    qtdAcimaMedia++;
                }
            }
        }
}
