package godofjavabook1.example.defaultmethod;

public class DefaultImplementedChild implements DefaultStaticInterface {

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSince() {
        return since;
    }
}
