#include<stdio.h>
#include<math.h>
int Kaprekar(int n){
    long sq=(long)n*n;
    int digits=0,temp=sq;
    while(temp>0){
        digits++;
        temp=temp/10;
    }
    long div=1;
    for(int i=1;i<digits;i++){
        div=div*10;
        long left=sq/div;
        long right=sq%div;
        if(right>0 && (left+right==n)){
            return 1;
        }
    }
    if(n==1)
        return 1;
    return 0;
}
int main(){
    int p,q,count=0;
    printf("Enter tha value of p and q: ");
    scanf("%d %d",&p,&q);
    printf("Kaprekar number between %d and %d are: ",p,q);
    for(int i=p;i<q;i++){
        if(Kaprekar(i)){
            printf("%d ",i);
            count++;
        }
    }
    if(count==0){
        printf("No kaprekar number found");
    }
    else{
        printf("\nTotal Kaprepkar number are: %d", count);
    }
    return 0;
}