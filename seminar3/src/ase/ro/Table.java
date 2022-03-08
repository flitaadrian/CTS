package ase.ro;

public class Table {
    private Create create;
    private Read read;
    private Insert insert;

    public Table() {

    }

    public Table(Create create, Read read, Insert insert){
        this.create=create;
        this.read=read;
        this.insert=insert;
    }

    public void run(){
        create=new CreateTable();
        read=new ReadData();
        insert=new InsertData();
    }
}
