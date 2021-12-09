class animation1 extends Thread{
  public animation1(){
    super("animation1");
  }
  public void run(){
  int c = 0;
  while(c<=150){
    c++;
    X+=2;
    try{
    Thread.sleep(10);
    }catch(Exception e ){
      System.out.println(e.getMessage());
    }
    image(img,X,Y,45,45);
  }if(c==150){
    System.out.println("fechou");
    exit();
  }}
}

class animation2 extends Thread{
  public animation2(){
    super("animation2");
  }
  public void run(){
  int c = 0;
  while(c<=150){
    c++;
    Y-=2;
    try{
    Thread.sleep(10);
    }catch(Exception e ){
      System.out.println(e.getMessage());
    }
    image(img,X,Y,45,45);
  }if(c==150){
    System.out.println("fechou");
    exit();
  }}
}


void animation3(){
  new Thread(){
  public void run(){
  int c = 0;
  while(c<=150){
    c++;
    Y+=2;
    try{
    Thread.sleep(10);
    }catch(Exception e ){
      System.out.println(e.getMessage());
    }
    image(img,X,Y,45,45);
  }if(c==150){
    System.out.println("fechou");
    exit();
  }}}.start();
  
}

void animation4(){
  new Thread(){
  public void run(){
  int c = 0;
  while(c<=150){
    c++;
    X-=2;
    try{
    Thread.sleep(10);
    }catch(Exception e ){
      System.out.println(e.getMessage());
    }
    image(img,X,Y,45,45);
  }if(c==150){
    System.out.println("fechou");
    exit();
  }}}.start();