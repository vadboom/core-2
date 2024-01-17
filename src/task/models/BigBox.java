package task.models;


import java.util.Objects;

public class BigBox {

  private String size;

  private Integer width;
  private Integer height;
  private Integer length;

  //Содержимое коробки к примеру внутри BigBox хранится MediumBox
  private MediumBox mediumBox;


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    BigBox bigBox = (BigBox) o;

    if (!Objects.equals(size, bigBox.size)) {
      return false;
    }
    if (!Objects.equals(width, bigBox.width)) {
      return false;
    }
    if (!Objects.equals(height, bigBox.height)) {
      return false;
    }
    if (!Objects.equals(length, bigBox.length)) {
      return false;
    }
    return Objects.equals(mediumBox, bigBox.mediumBox);
  }

  @Override
  public int hashCode() {
    int result = size != null ? size.hashCode() : 0;
    result = 31 * result + (width != null ? width.hashCode() : 0);
    result = 31 * result + (height != null ? height.hashCode() : 0);
    result = 31 * result + (length != null ? length.hashCode() : 0);
    result = 31 * result + (mediumBox != null ? mediumBox.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "BigBox{" +
        "size='" + size + '\'' +
        ", width=" + width +
        ", height=" + height +
        ", length=" + length +
        ", mediumBox=" + mediumBox +
        ", countMediumBox=" + " " +
        '}';
  }


  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }

  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public Integer getLength() {
    return length;
  }

  public void setLength(Integer length) {
    this.length = length;
  }

  public MediumBox getMediumBox() {
    return mediumBox;
  }

  public void setMediumBox(MediumBox mediumBox) {
    this.mediumBox = mediumBox;
  }


}
