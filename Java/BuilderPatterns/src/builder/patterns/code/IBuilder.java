package builder.patterns.code;

public interface IBuilder {
    void BuildBody();
    void InsertWheels();
    void AddHeadlights();
    Product GetVehicle();
}
