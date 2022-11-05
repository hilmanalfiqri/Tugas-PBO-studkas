public class Main {
    public static void main(String[] args) {
        tiket_bioskop tiketbioskop = new tiket_bioskop();
        int Total;
        do {
            tiketbioskop.Menu();
            switch (tiketbioskop.Total){
                case 1 :
                    tiketbioskop.tiket_bioskopRegular();
                    break ;
                case 2 :
                    tiketbioskop.tiket_bioskopPremiumHD();
                    break ;
                case 3 :
                    tiketbioskop.tiket_bioskopPremiereHD();
                    break ;

            }
        } while(tiketbioskop.Total<0);

    }
}