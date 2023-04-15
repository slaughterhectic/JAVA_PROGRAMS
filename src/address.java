class address1 {
    String ad;
    address1(){}
    void getadd(){
        ad="sfhih";
    }
    void setadd(){
        System.out.println(ad);

    }
}
class homeadress extends address1{
    void getadd(){
    super.getadd();
    }
    void setadd(){
        super.setadd();
    }
}
class officeadress extends address1{
    void getadd(){
        ad="sdjghs";
    }
    void setadd(){
        System.out.println(ad);
    }
}
class schooladress extends address1{
    void getadd(){
        ad="xshhfsf";
    }
    void setadd(){
        System.out.println(ad);
    }
}
class address{
    public static void main(String args[]){
       address1 a1=new homeadress();
       a1.getadd();
       a1.setadd();
        address1 a2=new officeadress();
        a2.getadd();
        a2.setadd();
        address1 a3=new schooladress();
        a3.getadd();
        a3.setadd();

    }


}
