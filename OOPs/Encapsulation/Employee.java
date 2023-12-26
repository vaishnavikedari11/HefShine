package OOPs.Encapsulation;

public class Employee {
    private String eName;
    private int eId;
    private int eSalary;
    private int eDesk;
    private int ePassword;

    public void setEName(String eName){
        this.eName=eName;
    }
    public String getEName(){
        return eName;
    }
    public void setEId(int eId){
        this.eId=eId;
    }
    public int getEId(){
        return eId;
    }
    public void setESalary(int eSalary){
        this.eSalary=eSalary;
    }
    public int getESalary(){
        return eSalary;
    }
    public void setEDesk(int eDesk){
        this.eDesk=eDesk;
    }
    public int getEDesk(){
        return eDesk;
    }
    public void setEPassword(int ePassword){
        this.ePassword=ePassword;
    }
    public int getEPassword(){
        return ePassword;
    }
}

