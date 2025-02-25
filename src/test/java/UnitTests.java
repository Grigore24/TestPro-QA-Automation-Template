import TicketsSeleniumL1.Tickets;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UnitTests extends BaseTest {
    @Test
    public void infantFreeTicket(){
        //Given - Preconditions - Arrange
        Tickets infant = new Tickets(0,1000);

        //When -Test-Act
        double resultPrice = infant.calculate();

        //Then - Validation-Assert
        Assert.assertEquals(resultPrice,0.0);

    }
    @Test
    public  void childTicket(){
        //Given
        Tickets child = new Tickets(5,800);

        //When
        double resultChildPrice = child.calculate();

        //Then
        Assert.assertEquals(resultChildPrice,400.0);
    }
    @Test
    public  void pensionTicket(){
        //Given
        Tickets pension = new Tickets(61,1000);

        //When
        double resultPensionPrice = pension.calculate();

        //Then
        Assert.assertEquals(resultPensionPrice,800.0);
    }
    @Test
    public  void adultTicket(){
        //Given
        Tickets adult = new Tickets(44,800);

        //When
        double resultAdultPrice = adult.calculate();

        //Then
        Assert.assertEquals(resultAdultPrice,800.0);
    }

}
