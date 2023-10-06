package Day10.CarRentalSystem;

public class Car {
    int carId ;
    String brandName ;
    int ModelNumber ;
    int rentalRate ;
    char Availability ;
    Car(){
        this.carId = 0 ;
        this.brandName = "" ;
        this.ModelNumber = 0 ;
        this.rentalRate = 0 ;
        this.Availability = 'N' ;
    }
    Car( String brandName ,int ModelNumber,int rentalRate ){
        this() ;
        this.brandName = brandName ;
        this.ModelNumber = ModelNumber ;
        this.rentalRate = rentalRate ;
    }
    Car(int carId ,String brandName ,int ModelNumber , int rentalRate , char Availability){
        this(brandName,ModelNumber,rentalRate) ;
        this.carId = carId ;
        this.Availability = Availability ;
    }

}
