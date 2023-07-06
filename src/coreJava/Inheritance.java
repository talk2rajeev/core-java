package coreJava;

class Engineer {
    public String name;

    public  Engineer(String name) {
        this.name = name;
    }

    public void writeCode() {
        System.out.println("Engineer is writing code");
    }
}

class FullStack extends Engineer {
    public String engineerType = "Full-Stack";
    public String [] technology;

    public FullStack(String name, String[] technology) {
        super(name);
        this.technology = technology;
    }
    @Override
    public void writeCode() {
        System.out.println("FullStack engineer is writing code");
    }
}

class FrondEnd extends Engineer {
    public String engineerType = "Front-End";
    protected String [] technology;

    public FrondEnd(String name, String[] technology) {
        super(name);
        this.technology = technology;
    }
}

class EngineerCreator {
    public static void main(String[] args) {
        String [] feTechnologies = new String[] {"JavaScript", "HTML", "CSS"};
        String [] beTechnologies = new String[] {"Java", "MySQL"};
        FrondEnd fe = new FrondEnd("Rajeev", feTechnologies);
        FullStack fs = new FullStack("Aneesh", beTechnologies);

        System.out.println(fe.name+' '+fe.engineerType + ' ' +fe.technology[0]);
        System.out.println(fs.name+' '+fs.engineerType + ' ' +fs.technology[0]);
        fs.writeCode();
        fe.writeCode();
    }
}



