package ru.aston.hometask_3.builder.model;

public class User {
    private String name;
    private String email;
    private String password;

    private User(Builder builder) {
        this.name = builder.name;
        this.email = builder.email;
        this.password = builder.password;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "User: " + "name: " + getName() + ", email: " + getEmail() + ", password: " + getPassword() ;
    }

    public static class Builder {
        private String name;
        private String email;
        private String password;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
