package core.models;

import javax.persistence.*;

@Entity
@Table (name = "clients")
public class ClientDO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String  username;

    private String email;

    private String phone;

    public ClientDO() {
    }

    public ClientDO(String username, String email, String phone) {
        this.username = username;
        this.email = email;
        this.phone = phone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "models.Client{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email=" + email + '\'' +
                ", phone=" + phone +
                '}';
    }
}
