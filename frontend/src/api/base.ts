import axios from 'axios';

const axiosInstance = axios.create({
  baseURL: 'http://localhost:8080/api', // Set the base URL for your API
  timeout: 5000, // Optional: timeout in milliseconds
  headers: {
    'Content-Type': 'application/json',
  },
});

export default axiosInstance;
