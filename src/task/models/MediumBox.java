package task.models;


import java.util.Objects;

public class MediumBox extends BigBox {

  private SmallBox smallBox;

  private Integer countSmallBox;

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }

    MediumBox mediumBox = (MediumBox) o;

    if (!Objects.equals(smallBox, mediumBox.smallBox)) {
      return false;
    }
    return Objects.equals(countSmallBox, mediumBox.countSmallBox);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + (smallBox != null ? smallBox.hashCode() : 0);
    result = 31 * result + (countSmallBox != null ? countSmallBox.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "MediumBox{" +
        "smallBox=" + smallBox +
        ", countSmallBox=" + countSmallBox +
        '}';
  }

  public Integer getCountSmallBox() {
    return countSmallBox;
  }

  public void setCountSmallBox(Integer countSmallBox) {
    this.countSmallBox = countSmallBox;
  }

  public SmallBox getSmallBox() {
    return smallBox;
  }

  public void setSmallBox(SmallBox smallBox) {
    this.smallBox = smallBox;
  }
}
