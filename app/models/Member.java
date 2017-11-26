package models;

import javax.persistence.*;
import javax.validation.Constraint;

import io.ebean.Model;
import play.data.validation.Constraints;
import play.db.ebean.*;

@Entity
@Table
public class Member extends Model{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    long id;
    @Constraints.Required
    private String name;
    @Constraints.Min(0)
    private int age;
    @Constraints.Min(0)
    private int physics_Skill;
    @Constraints.Min(0)
    private int sociology_Skill;
    @Constraints.Min(0)
    private int manufacturing_Skill;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhysics_Skill() {
        return physics_Skill;
    }

    public void setPhysics_Skill(int physics_Skill) {
        this.physics_Skill = physics_Skill;
    }

    public int getSociology_Skill() {
        return sociology_Skill;
    }

    public void setSociology_Skill(int sociology_Skill) {
        this.sociology_Skill = sociology_Skill;
    }

    public int getManufacturing_Skill() {
        return manufacturing_Skill;
    }

    public void setManufacturing_Skill(int manufacturing_Skill) {
        this.manufacturing_Skill = manufacturing_Skill;
    }
}
