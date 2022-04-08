package de.vc.view;



import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named(value = "login")
@RequestScoped
public class Login implements Serializable {

    private static final long serialVersionUID = -9200993633621128164L;

    private String username;
    private String password;


    public String checkAccount(){
        return "index.xhtml";
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
