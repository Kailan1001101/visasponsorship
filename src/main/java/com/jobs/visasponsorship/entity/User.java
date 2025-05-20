package com.jobs.visasponsorship.entity;

import jakarta.persistence.*;




    @Entity
    @Inheritance(strategy = InheritanceType.JOINED) //
    @Table(name = "users")
    public abstract class User {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        protected String name;
        protected String email;
        protected String password;

        @Enumerated(EnumType.STRING)
        protected Role role;

        protected boolean isVerified;

        // Getters and setters


        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public Role getRole() {
            return role;
        }


        public boolean isVerified() {
            return isVerified;
        }

        public void setVerified(boolean verified) {
            isVerified = verified;
        }


        public void setRole(Role role) {
        }
    }

