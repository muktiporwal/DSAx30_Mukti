#include<stdio.h>
void swap(int arr[], int a, int b){
    int temp=arr[a];
    arr[a]=arr[b];
    arr[b]=temp;
}
int count=0;
void combo(int arr[],int start, int n){
    if(start==n){
        for(int i=0;i<n;i++){
            printf("%d",arr[i]);
            if(i<n-1)
                printf(" ");
        }
        printf("\n");
        count++;
        return;
    }
    for(int i=start;i<n;i++){
        swap(arr,start,i);
        combo(arr,start+1,n);
        swap(arr,start,i);
    }
}
int main(){
    int n,size;
    printf("Enter any number between 2 to 5: ");
    scanf("%d",&n);
    if(n<2||n>5){
        printf("Invalid input.\n");
        return 0;
    }
    printf("Enter the size of array: ");
    scanf("%d",&size);
    int arr[size];
    for(int i=0;i<size;i++){
        arr[i]=i+1;
    }
    combo(arr,0,n);
    printf("Total number of combinations are: %d",count);
    return 0;
}
