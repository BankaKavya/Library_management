
package allocateminimumnumberofpages;
public class AllocateMinimumNumberOfPages {

    
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr={25,46,28,49,24};
        int m=4;
        int low=max(arr);
        int high=Sum(arr);
        while(low<=high){
           int mid=(low+high)/2;
           int noOfStudents=minPages(arr,mid);
           if(noOfStudents>m){
               
               low=mid+1;
           }
           else{
               high=mid-1;
           }
        }
        System.out.println(low);
         
    }
    public static int max(int[] arr){
        int maxi=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>maxi){
                maxi=arr[i];
            }
        }
        return maxi;
    }
    public static int Sum(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        return sum;
        
    }
    public static int maxPages(int low,int high){
        int[] arr={25,46,28,49,24};
        int m=4;
        for(int pages=low;pages<=high;pages++){
           int countStudents=minPages(arr,pages);
           if(countStudents==m){
               return pages;
           }
           
        }
        return 0;
    }
    static int minPages(int[] arr,int Pages){
        int countStudent=1;
        int PageCount=0;
        for(int i=0;i<arr.length;i++){
            if(PageCount+arr[i]<=Pages){
                PageCount+=arr[i];
            }
            else{
                countStudent++;
                PageCount=arr[i];
            }
            
        }
        return countStudent;
    }
        
    
}
