void main() {
    int vize1 = 60;
    int vize2 = 70;
    int finall = 75;
    double ort = vize1/4.0 + vize2/4.0 + finall/2.0;
    if (ort >= 85){
        System.out.println("Takdir belgesi aldın");
    }
    else if (ort >= 75){
        System.out.println("Teşekkür belgesi aldın      ");
    }
    else if (ort >= 50){
        System.out.println("Geçtin");
    }
    else {
        System.out.println("Kaldın");
    }
}