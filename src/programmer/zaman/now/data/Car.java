package programmer.zaman.now.data;

public interface Car extends HasBrand, IsMaintanance{
    void drive();

    int getTier();

    default boolean isBig(){
        return false;
    };
}
