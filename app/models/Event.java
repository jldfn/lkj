package models;

import javax.persistence.*;

@Entity
@Table
public class Event {
    long id;
    String name;
    String description;
    String d_mail_Text;
}
