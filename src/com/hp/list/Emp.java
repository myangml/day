package com.hp.list;

import java.util.Date;
import java.util.Objects;

/**
 * 定义私有属性:
 * String name;
 * int age;
 * String gender;
 * int salary;
 * Date hiredate;//入职时间
 * 
 * 定义构造方法，以及属性get,set方法.
 * 定义toString方法，格式如:
 *    张三,25,男,5000,2006-02-15
 * 
 * 定义equals方法，要求名字以及年龄相同，则认为内容一致。
 * @author Xiloer
 *
 */
public class Emp {
    private String name;
    private Integer age;
    private  String gender;
    private Integer salary;
    private Date hiredate;

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", salary=" + salary +
                ", hiredate=" + hiredate +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emp emp = (Emp) o;
        return name.equals(emp.name) &&
                age.equals(emp.age);

    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
