import { useGetUserList } from "./api/users";
import "./App.css";
import { Avatar, Card, Flex, List, Typography } from "antd";

function App() {

  const { data: response } = useGetUserList();

  return (
    <>
      <h4>School Info</h4>
      <Card title={response?.name}>
        <List
          itemLayout="horizontal"
          dataSource={response?.data}
          renderItem={(item) => (
            <List.Item key={item.id}>
              <Flex align="center" gap={16}>
                <Avatar
                  src="https://www.gravatar.com/avatar/2c7d99fe281ecd3bcd65ab915bac6dd5"
                  size="large"
                />
                <Flex vertical align="flex-start">
                  <Typography.Title style={{ margin: 0 }} level={5}>
                    {item.name}
                  </Typography.Title>
                  <Typography.Text>
                    {item.school} | {item.address}
                  </Typography.Text>
                </Flex>
              </Flex>
            </List.Item>
          )}
        />
      </Card>
    </>
  );
}

export default App;
