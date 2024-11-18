import { useQuery } from "@tanstack/react-query";
import axiosInstance from "./base";

export const fetchUsers = async () => {
  const response = await axiosInstance.get("/users");
  return response.data;
};

type ResponseType = {
  name: string;
  data: {
    name: string;
    id: string;
    school: string;
    address: string;
  }[];
};

export const useGetUserList = () => {
  return useQuery<ResponseType>({
    queryKey: ["users"],
    queryFn: fetchUsers,
  });
};
