package models;

import javax.persistence.*;


@Entity
public class Member {
    @Id
    long id;
    private String name;
    private int age;
    private int physics_Skill;
    private int sociology_Skill;
    private int manufacturing_Skill;
}
