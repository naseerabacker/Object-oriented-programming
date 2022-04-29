/*Create CPU with attribute price. Create inner class
Processor (no. of cores, manufacturer)and static nested class
RAM (memory, manufacturer). Create an object of CPU and
print information of Processor and RAM.*/

class CPU
{
int price;
CPU(int p)
{
this.price = p;
}
class Processor
{
int cores;
String manufacture;
Processor(int n, String m)
{

this.cores = n;
this.manufacture = m;

}
void display()
{

System.out.println("No of Cores : " + this.cores);
System.out.println("Processor manufactures : " + this.manufacture);

}

}
static class Ram
{

int memory;

String manufacture;
Ram(int n, String m) 
{
this.memory = n;
this.manufacture = m;
}

void display() 
{

System.out.println("Memory Size : " + this.memory);
System.out.println("Memory manufactures : " + this.manufacture);

}

}

void display() 
{
 System.out.println("Price of CPU : " + this.price);
}
public static void main(String[] args)
{

CPU intel = new CPU(23000);
CPU.Processor i_processor = intel.new Processor(4, "intel");
CPU.Ram i_ram = new Ram(1024, "Asus");
intel.display();
i_processor.display();
i_ram.display();


/*
Price of CPU : 23000
No of Cores : 4
Processor manufactures : intel
Memory Size : 1024
Memory manufactures : Asus
*/
}

}
