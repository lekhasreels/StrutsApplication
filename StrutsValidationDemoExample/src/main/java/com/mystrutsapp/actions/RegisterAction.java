package com.mystrutsapp.actions;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mystrutsapp.model.User;
import com.mystrutsapp.util.DatabaseUtil;
import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String execute() throws Exception {
        // Perform validation based on validation.xml

        // Store user in database
        try (Connection connection = DatabaseUtil.getConnection()) {
            String query = "INSERT INTO users (name, email) VALUES (?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getEmail());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return ERROR;
        }

        return SUCCESS;
    }

}
