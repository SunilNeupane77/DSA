class TowerofHani {
    public static void towerofhanoi(int n,char from_rod,char to_rod,char aux_rod){
        if(n==0){
            return;
        }
        else{
            towerofhanoi(n-1, from_rod,aux_rod, to_rod);
            System.out.println("Move disk"+n+"From rod"+from_rod+"to rod"+to_rod);
            towerofhanoi(n-1, aux_rod, to_rod,from_rod);
        }
    
    }
    public static void main(String[] args) {
        int N=3;
        towerofhanoi(N, 'A', 'C', 'B');
    }
}