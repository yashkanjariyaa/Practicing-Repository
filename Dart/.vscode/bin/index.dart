typedef myFunction(int a);
add(int a){
    print( a + a);
  }
 sub(int b){
    print( b - b);
  }
void main(){
  myFunction operator;
  operator = add;
  operator(10);
  operator = sub;
  operator(10);
}

