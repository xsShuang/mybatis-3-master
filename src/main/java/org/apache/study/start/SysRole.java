package org.apache.study.start;

/**
 * @author xieshuang
 * @date 2021-04-27 16:57
 */
public class SysRole {

  private String role_name;
  private Integer id;
  private String label;

  public String getRole_name() {
    return role_name;
  }

  public void setRole_name(String role_name) {
    this.role_name = role_name;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  @Override
  public String toString() {
    return "SysRole{" +
      "role_name='" + role_name + '\'' +
      ", id=" + id +
      ", label='" + label + '\'' +
      '}';
  }
}
