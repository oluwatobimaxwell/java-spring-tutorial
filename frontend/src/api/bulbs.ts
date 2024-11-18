import { useQuery } from "@tanstack/react-query";
import axiosInstance from "./base";

export const fetchBulbs = async () => {
  const response = await axiosInstance.get("/bulbs");
  return response.data;
};

type ResponseType = {
  bulb1: boolean;
  bulb2: boolean;
  bulb3: boolean;
  bulb4: boolean;
};

export const useGetBulbs = () => {
  return useQuery<ResponseType>({
    queryKey: ["bulbs"],
    queryFn: fetchBulbs,
  });
};
