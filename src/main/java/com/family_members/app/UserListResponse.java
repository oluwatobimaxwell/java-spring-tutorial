package com.family_members.app;

import java.util.List;
import java.util.Map;

public class UserListResponse {
        private String name;
        private List<Map<String, String>> data;

        // Constructor
        public UserListResponse(String name, List<Map<String, String>> data) {
            this.name = name;
            this.data = data;
        }

        // Getters and Setters
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<Map<String, String>> getData() {
            return data;
        }

        public void setData(List<Map<String, String>> data) {
            this.data = data;
        }
    }


