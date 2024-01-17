package task.models;


import java.util.Objects;

public class SmallBox extends MediumBox {

  private MicroBox microBox;

  private Integer countMicroBox;

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

    SmallBox smallBox = (SmallBox) o;

    if (!Objects.equals(microBox, smallBox.microBox)) {
      return false;
    }
    return Objects.equals(countMicroBox, smallBox.countMicroBox);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + (microBox != null ? microBox.hashCode() : 0);
    result = 31 * result + (countMicroBox != null ? countMicroBox.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "SmallBox{" +
        "microBox=" + microBox +
        ", countMicroBox=" + countMicroBox +
        '}';
  }

  public MicroBox getMicroBox() {
    return microBox;
  }

  public void setMicroBox(MicroBox microBox) {
    this.microBox = microBox;
  }

  public Integer getCountMicroBox() {
    return countMicroBox;
  }

  public void setCountMicroBox(Integer countMicroBox) {
    this.countMicroBox = countMicroBox;
  }
}
